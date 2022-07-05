package oop_principles.polymorphism.method_overloading;

public class MethodOverloading {

    void methodOverloaded() {
        //No argument method
    }

    void methodOverloaded(int i) {
        //One argument is passed
    }

    void methodOverloaded(double d) {
        //One argument is passed but type of argument is different
    }

    void methodOverloaded(int i, double d) {
        //Two argument method
        //Method signature of this method is methodOverloaded(int, double)
    }

    void methodOverloaded(double d, int i) {
        //It is also two argument method but type of arguments changes
        //Method signature of this method is methodOverloaded(double, int)
    }

//    void methodOverloaded(double d1, int i1) {
//        //It has same method signature methodOverloaded(double, int) as of above method
//        //So, it is a Duplicate method, You will get compile time error here
//    }

    void differentMethod() {
        //Different method
    }
}
