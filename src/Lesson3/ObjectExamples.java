
package Lesson3;
import TurtleGraphics.*;

public class ObjectExamples {

    
    public static void main(String[] args) {
        Pen p1, p2,p3;
        /*
        OBJECTS -> created from a class
        Some objects can be part of the same 'family' and have a common parent
        p1,p2,p3 are still open to become different TYPES of PENS    
        
        Polymorphism = When an object can become one of many different types of objects
        p1 -> can later become a wigglepen;
        Poly = many   morph = change into
        
        */
        SketchPadWindow w= new SketchPadWindow(800,600);
        p1 = new StandardPen(w);
        p2 = new RainbowPen(w);
        p3 = new WigglePen(w);
        
        /*
        All 3 pens respond to the same commands even though they are different types
        p1. -> showws all of the Pens instance methods (abilities)
        -> All 3 Pens INHERIT their abilities from the parent Pen class
        ->  there are also addidtional abillities shownn that are not part of the Pen class
        -> All objects also inherit abillities from the Object class (.getClass, .equals)
        -> Object is the mother of all Classes      
        */
        p1.up();
        p1.move(-100,-100);
        p1.down();
        p1.setDirection(0);
        
        //draw square
        for (int i = 0; i < 4; i++) {
            p1.move(100);
            p1.turn(90);
        }
            
            
               p3.up();
        p3.move(100,100);
        p3.down();
        p3.setDirection(0);
        
       // draw square
      for (int i = 0; i < 4; i++) {
            p3.move(100);
            p3.turn(90);
      }  
            
        p2.up();
        p2.move(-100,-100);
        p2.down();
        p2.setDirection(0);
        
        //draw square
        for (int i = 0; i < 4; i++) {
            p2.move(100);
            p2.turn(90);
        }
        
        // make p1 a differernt pen
        p1= new WigglePen(w);
        p1.move(100);
    }
    
}
