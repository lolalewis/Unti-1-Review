package Lesson3;

import java.util.Scanner;

public class Errortypes {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        //syntax -> error in code, prevents program to run
        int x;
        //System.out.println("Enter a value for x: ");
        // x = s.nextDouble();   //error
        x = s.nextInt();

        //Logic error 
        //Hard to find, code worrks but wrong result happens       
        double hours = 10.5, wage = 14.5;
        double pay = hours + wage; // should be * not +
        System.out.println("Your pay this week is " + pay);

        //runtime error - program starts then crashes
        System.out.println("Enter a value for x: ");
        x = s.nextInt(); // error will get thrown iif user doesnt use an integer

        // better approach -> use try / cathc to respond to error
        try {
            System.out.println("Enter a value for x: ");
            x = s.nextInt();
        } catch (Exception e) {
            // this runs if error happens
            System.out.println("Error");
        }
    }

}
