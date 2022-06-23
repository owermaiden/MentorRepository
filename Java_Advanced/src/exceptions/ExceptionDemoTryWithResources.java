package exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionDemoTryWithResources {

    public static void show(){

        try (var reader = new FileReader("file.txt")) {

            reader.read();

        } catch (IOException e) {

            System.out.println("File not found");
            System.out.println(e.getMessage());
            e.printStackTrace();

        }

        // Java autoclose interface will close FileReader because it implements that interface...
    }
}
