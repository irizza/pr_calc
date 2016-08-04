

import com.sun.xml.internal.messaging.saaj.util.CharWriter;

import java.io.*;
import java.util.Scanner;

/**
 * Created by Kovantonlenko on 6/30/2016.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int result = 0;
        String common = "";
        System.out.println("Put some expression");


        while (sc.hasNext()) {

            String value = sc.nextLine();
            if (value.equals("x")) break;
            if (!(value.equals("="))) {
                common += value + ",";
            } else {
                String[] var = common.split(",");
                switch (var[1]) {



                    case ("+"):
                        result = Integer.valueOf(var[0]) + Integer.valueOf(var[2]);
                        break;
                    case ("-"):
                        result = Integer.valueOf(var[0]) - Integer.valueOf(var[2]);
                        break;
                    case ("*"):
                        result = Integer.valueOf(var[0]) * Integer.valueOf(var[2]);
                        break;
                    case ("/"):
                        result = Integer.valueOf(var[0]) / Integer.valueOf(var[2]);
                        break;
                }
                System.out.println(result);
                String rez = String.valueOf(result);
                try {
                    BufferedWriter bw = new BufferedWriter(new FileWriter("t1.txt", false));
                    bw.write(rez);
                    bw.flush();


                } catch (IOException e) {
                    e.printStackTrace();
                }
                common = "";
                System.out.println("Put some expression");
            }

        }


    }


}
