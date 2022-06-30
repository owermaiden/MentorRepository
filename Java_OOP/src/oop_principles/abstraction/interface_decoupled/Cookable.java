package oop_principles.abstraction.interface_decoupled;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public interface Cookable {

    List<String> accessories = new ArrayList<>(Arrays.asList("fork", "knife"));

    void cookMeat();
    void cookSweet();
    void serveFood();
}
