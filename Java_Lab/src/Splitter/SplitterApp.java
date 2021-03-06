package Splitter;

import java.util.ArrayList;
import java.util.Scanner;

public class SplitterApp {

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.println("Welcome to Budget Planner!");


            //Ask how many ppl in the budget planner?
            System.out.println("How many people will split the budget?");

            //Users DB
            ArrayList<User> userList = prepareUserLists(scanner);


            //Expenses DB
            ArrayList<Expense> expenseList = new ArrayList<>();

            System.out.println("Added user count : " + userList.size());

            String [] optionList = prepareOptionList();


            while (true) {

                System.out.println("What would you like to do?");

                for(int i=0;i<optionList.length;i++){

                    System.out.println(optionList[i] + ":" + (i+1));

                }

                int request =  scanner.nextInt();

                switch(request-1){
                    case 0:

                        //ask expanse name,amount,user


                        System.out.println("Expense name: ");
                        String expenseName = scanner.next();

                        System.out.println("Expense Amount: ");
                         int amount = scanner.nextInt();


                        System.out.println("Which user made this expense? Just type user id: ");

                        //show all users: id:0 name: Ozzy
                        for(User user : userList){
                            System.out.println("id: " + userList.indexOf(user) + "name:" + user.name);
                        }


                        int userId = scanner.nextInt();

                        User user = userList.get(userId);

                        Expense expense = new Expense(amount, expenseName, user);
                        expenseList.add(expense);

                        break;

                    case 1:

                        System.out.println("Please provide user name that you would like to search");
                        String userName = scanner.next();

                        User myUser = null;

                        for(User chosenUser : userList){

                            if(chosenUser.name.equals(userName)){
                                myUser = chosenUser;
                                break;

                            }
                        }

                        if(myUser == null){
                            System.out.println("User not exists!");
                            break;
                        }


                        ///List Specific Splitter.Person Expense
                        //0 - expense amount : 100, expense by :0zzy
                        //1 - expense amount : 100, expense by :0zzy
                        //ozzy spent $ 200

                        int userExpenseAmount = 0;
                        int expenseCount=0;

                        for(int i=0;i<expenseList.size();i++){

                            if(expenseList.get(i).user.equals(userName)){

                                userExpenseAmount += expenseList.get(i).amount;
                                expenseCount++;

                                System.out.println(expenseCount + " -expense amount:" + expenseList.get(i).amount + ",expense by :" + expenseList.get(i).user);
                            }

                        }

                        System.out.println(myUser.name + " spent $ " + userExpenseAmount);

                        break;


                    case 2:

                        for(int i = 0;i<expenseList.size();i++){
                            System.out.println(i + " - expense amount:" + expenseList.get(i).amount + ", expense by:" + expenseList.get(i).user);
                        }
                        break;
                    case 3:

                        // calculate price for each user

                        double totalExpensesMadeByAllUsers = 0;
                        ArrayList<Split> splitList = calculateSplitByUser(expenseList);

                        for(Split split : splitList){

                            totalExpensesMadeByAllUsers += split.amount;
                        }

                        // print result on the console
                        makeSplit(totalExpensesMadeByAllUsers,splitList);



                        break;
                    case 4:
                        break;
                    case 5:
                        System.exit(0);

                }

            }


        }

        public static void makeSplit(double totalAmount, ArrayList<Split> splitList) {

            double avarageAmount = totalAmount / splitList.size();

            for(Split split : splitList){

                if(split.amount > avarageAmount){
                    System.out.println(split.user.name + " needs to take back " + (split.amount - avarageAmount));
                }else{
                    System.out.println(split.user.name + " need to give " + (-1 * (split.amount-avarageAmount)));
                }

            }

        }

        public static ArrayList<Split> calculateSplitByUser(ArrayList<Expense> expenseList) {

            ArrayList<Split> splitList = new ArrayList<>();

            for(Expense expense : expenseList){

                Split split = hasUserSplitBefore(expense.user,splitList);

                if(split != null){
                    split.amount += expense.amount;

                }else{
                    splitList.add(new Split(expense.amount, expense.user));
                }
            }

            return splitList;

        }

        public static Split hasUserSplitBefore(User user, ArrayList<Split> splitList) {

            for(Split split : splitList){
                if(split.user.name.equals(user.name)){
                    return split;
                }
            }

            return null;   //break till 3:30 (5 review)

        }


        public static ArrayList<User> prepareUserLists(Scanner scanner){

            ArrayList<User> userList = new ArrayList<>();

            int userCount = scanner.nextInt();

            for(int i=0;i<userCount;i++) {


                System.out.println("Name: ");
                String name = scanner.next();

                System.out.println("Email: ");
                String email = scanner.next();

                User user = new User(name, email);
                userList.add(user);

            }

            return userList;

        }

        public static String[] prepareOptionList(){



                /*
        Creating options
        1 : Make Expense
        2 : List Specific Splitter.Person Expense
        3 : List All Expenses
        4 : Make Split
        5 : List All Users
        6 : Close the budget
        */

            String[] optionList = {"Make Expense","List Specific Splitter.Person Expense","List All Expenses","Make Split","List All Users","Close the budget"};

            return optionList;

        }

}
