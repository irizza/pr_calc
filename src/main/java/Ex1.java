

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 * read
 */
public class Ex1 {
    public static void main(String[] args) {
        try {
          /*  BufferedReader bufferedReader = new BufferedReader(new FileReader("t1.txt"));
            System.out.println(bufferedReader.read());*/
            FileReader fileReader = new FileReader("t1.txt");
            char [] a = new char[50];
            try {
                fileReader.read(a);
            } catch (IOException e) {
                e.printStackTrace();
            }

            System.out.println(a);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}

