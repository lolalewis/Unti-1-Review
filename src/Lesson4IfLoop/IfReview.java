
package Lesson4IfLoop;

import java.util.Scanner;

public class IfReview {

    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
        System.out.print("Entr a number: ");
        int num = s.nextInt();
        
        if(num > 7){
            System.out.println("Too high");
            num--;
            
        }
        else if (num <7){
            System.out.println("Too low");
            num++;
        }else
            System.out.println("Just right");
        // not par of IF will rubn everytime
        System.out.format("Number is now %d\n", num);
        int rnum= (int)(Math.random()* 10 + 1); // 1 to 10
        System.out.format("Random number is %d\n",rnum);
        //which one is higher 3 ways
        int higher;
        if(rnum > num) higher =rnum;
        else System.out.println("Your number is higher");
       // System.out.println("The higher number is "+higher);
        // way 2 
      //  higher = Math.max(num, rnum)
       // System.out.println("The higher number is" +higher));
        
        //way 3
        //higher =   is this true? Yes : No    : = else
        higher= rnum > num? rnum : num;
        System.out.println("The higher number is "+higher);
        
    }
    
}
