package exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionDemo {

    public static void show(){

        try {

            var reader = new FileReader("file.txt");
            reader.read();

        } catch (FileNotFoundException e) {

            System.out.println("File not found");
            System.out.println(e.getMessage());
            e.printStackTrace();

        } catch (IOException e) {

            e.printStackTrace();

        } finally {

        //  reader.close();
        }
    }
}
