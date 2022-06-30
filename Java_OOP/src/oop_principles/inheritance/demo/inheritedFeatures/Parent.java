package oop_principles.inheritance.demo.inheritedFeatures;

public class Parent {

    static{
        System.out.println("Parent Static Initialization Block executed");
    }

    {
        System.out.println("Parent Instance Initialization Block executed");
    }

    Parent(){
        System.out.println("Parent Constructor Executed");
    }
}

class Child extends Parent {

    static {
        System.out.println("Child Static Initialization Block executed");
    }

    {
        System.out.println("Child Instance Initialization Block executed");
    }

    public Child() {
        System.out.println("Child Constructor Executed");
    }
}

class Main {
    public static void main(String[] args) {
        Child c = new Child();
    }
}


