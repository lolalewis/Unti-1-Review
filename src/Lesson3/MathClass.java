package Lesson3;

public class MathClass {

    
    public static void main(String[] args) {
        
        // Math is a part of core language -> no import needed
        //All math methods are static -> DONT do this: Math m = new Math()
        //There fore all methods can be run directly through the class itself
        //NOT THIS -> m.pow(x, 3) but this instead Math.pow(x, 3)
        int x =25;
        System.out.println(Math.pow(x, 3)); //25 pow 3
        System.out.println(Math.sqrt(x));  //5
        double y = 8.9876;
        System.out.println(Math.round(y));  //9
        System.out.println("The bigger number is " + Math.max(x, y)); //max = highest
         System.out.println("The smaller number is " + Math.min(x, y)); //max = highest
        
        // Randoom class: We used to go: Random r = new Random(); r.next()
        System.out.println("Here is a random number :" + Math.random()); //0 and 1
        
        // To use a  range : (INT) (Math.random() * range + min number);
        //Ex -> 30 and 50 -> range =21, min=30
        int rnum = (int) (Math.random() * 21 +30);
        System.out.println("Random number is " +rnum);
        rnum = (int) (Math.random() * 10 + 1); //1 to 10
        
        System.out.println("\n\n Shortcut review\n=============\n");
        
        int a =10;
        a+= 10; // go up by 10
        System.out.println("a is "+ a);
        int b = a; // b =20
        b++; //b=21;
        System.out.println("b is " + b);
        a*=2; // a=a *2 //40
        System.out.println("a is doubled to" + a);
        //let c = b, then increaase b by 1
        int c= b++; // c= 21, b=22
        System.out.format("c is %d and b is %d\n", c,b);
        
        // let b go up by 1 and assign NEW b value to d at same time
        int d = ++b; // d and b will be 23
        System.out.format("d is %d and b is %d\n", d,b);    
        
        
    }
    
}
