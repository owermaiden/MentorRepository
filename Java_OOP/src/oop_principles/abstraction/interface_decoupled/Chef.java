package oop_principles.abstraction.interface_decoupled;

public class Chef implements Cookable{

    @Override
    public void cookMeat() {
        System.out.println("he can cook really good food");
    }

    @Override
    public void cookSweet() {
        System.out.println("he can cook really good sweets");
    }

    @Override
    public void serveFood() {
        System.out.println("he can serve the food professionally");
    }
}
