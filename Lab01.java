/**
*
* Putting School Books in the Storage Room (Lab01 in Unit1, fcps.karel)
*
* @author Shaurya Prakash
* @version 24/10/2014
*/

import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;

public class Lab01 {

     public static void main(String[] args) {
            
            Display.openWorld("maps/school.map");
            Display.setSize(10, 10);
            
            Robot lisa = new Robot();
            Robot pete = new Robot(4, 5, Display.SOUTH, 0);
            
            lisa.move();
            lisa.move(); 
            lisa.turnLeft();
            lisa.move();
            lisa.turnLeft();
            lisa.move(); 
            lisa.pickBeeper();
            lisa.turnLeft();
            lisa.turnLeft();
            lisa.move();
            lisa.turnLeft();
            lisa.turnLeft();
            lisa.turnLeft();
            lisa.move(); 
            lisa.turnLeft();
            lisa.move(); 
            lisa.move(); 
            lisa.move(); 
            lisa.turnLeft();
            lisa.move(); 
            lisa.move(); 
            lisa.move();
            lisa.turnLeft();
            lisa.move();
            lisa.move();
            lisa.turnLeft();
            lisa.turnLeft();
            lisa.turnLeft();
            lisa.move();
            lisa.putBeeper();
            pete.pickBeeper();
            pete.move();
            pete.turnLeft();   
            pete.move();
            pete.move();
            pete.turnLeft();
            pete.move();
            pete.move();
            pete.turnLeft();
            pete.turnLeft();
            pete.turnLeft();
            pete.move();
            pete.move();
            pete.turnLeft();
            pete.move();
            pete.turnLeft();
            pete.move();
            pete.move();
            pete.turnLeft();
            pete.turnLeft();
            pete.turnLeft();
            pete.move();
            pete.move();
            pete.turnLeft();
            pete.move();
            pete.move();
            pete.putBeeper();
            pete.turnLeft();
            pete.turnLeft();
            pete.move();
      
   }
   
}