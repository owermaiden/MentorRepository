package Splitter;

import java.util.ArrayList;
import java.util.Scanner;

public class MySplitter {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] optionList = { "List Specific Person Expense",
                                "List All Expenses",
                                "Make Split",
                                "Close the budget"};

        //Users DB
        ArrayList<User> userList = new ArrayList<>();
        userList.add(new User("ower", "ower@gmail.com"));
        userList.add(new User("hasan", "hasan@gmail.com"));
        userList.add(new User("boban", "boban@gmail.com"));

        //Expenses DB
        ArrayList<Expense> expenseList = new ArrayList<>();
        expenseList.add(new Expense(100, "taxi", userList.get(0)));
        expenseList.add(new Expense(200, "hotel", userList.get(1)));
        expenseList.add(new Expense(750, "fun", userList.get(2)));


        while (true) {

            System.out.println("What would you like to do?");

            for(int i=0;i<optionList.length;i++){

                System.out.println(optionList[i] + ":" + (i+1));

            }

            int request =  scanner.nextInt();

            switch(request-1){
                case 0:

                    System.out.println("Which user you want to see expenses? Just type user id: ");

                    //show all users: id:0 name: Ozzy
                    for(User user : userList){
                        System.out.println("id: " + userList.indexOf(user) + " name: " + user.name);
                    }
                    int userId = scanner.nextInt();
                    User user = userList.get(userId);

                    int expensesByUser = 0;
                    for(Expense expense : expenseList){
                        if (user.name.equals(expense.user.name)){
                            expensesByUser += expense.amount;
                        }
                    }

                    System.out.println(user.name+" has spent "+expensesByUser+" total ");
                    break;

                case 1: //total expenses

                    for(int i = 0;i<expenseList.size();i++){
                        System.out.println(i + " - expense amount:" + expenseList.get(i).amount + ", expense by:" + expenseList.get(i).user.name);
                    }
                    break;

                case 2:

                    double totalAmount = 0;
                    ArrayList<Split> splitList = calculateSplitByUser(expenseList);

                    for(Split split : splitList){

                        totalAmount += split.amount;
                    }

                    makeSplit(totalAmount,splitList);
                    break;

                case 3:
                    System.exit(0);

            }

        }


    }

    public static void makeSplit(double totalAmount, ArrayList<Split> splitList) {

        double amount = totalAmount /splitList.size();

        for(Split split : splitList){

            if(split.amount > amount){
                System.out.println(split.user.name + " needs to take back " + (split.amount - amount));
            }else{
                System.out.println(split.user.name + " need to give " + (-1 * (split.amount-amount)));
            }

        }

    }

    public static ArrayList<Split> calculateSplitByUser(ArrayList<Expense> expenseList) {

        ArrayList<Split> splitList = new ArrayList<>();

        for(Expense expense : expenseList){

            Split split = existSplitList(expense.user.name,splitList);

            if(split != null){
                split.amount += expense.amount;

            }else{
                Split willbeAdded = new Split();
                willbeAdded.user = expense.user;
                willbeAdded.amount = expense.amount;
                splitList.add(willbeAdded);
            }
        }

        return splitList;

    }

    public static Split existSplitList(String userName, ArrayList<Split> splitList) {

        for(Split split : splitList){
            if(split.user.name.equals(userName)){
                return split;
            }
        }

        return null;

    }

}



