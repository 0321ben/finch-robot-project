package com.example;

import com.birdbrain.Finch;

// Start of FinchSquare file
public class FinchSquare{
    public static void main(String args[]){
        Finch myFinch = new Finch();
     
     /*
        The robot's movement. Every move is set with a speed of 70 and different angles and length (in centimeters) every other time.
        Uses setMove to move the robot in a direction we want it to go to and setTurn to make it look at an angle we want it to.
    */ 

            myFinch.setMove("F", 10, 70);
            myFinch.setTurn("R", 45, 70);
            myFinch.setMove("F", 5, 70);
            myFinch.setTurn("R", 90, 70);
            myFinch.setMove("F", 12, 70);
            myFinch.setTurn("R", 90, 70);
            myFinch.setMove("F", 12, 70);
            myFinch.setTurn("R", 90, 70);
            myFinch.setMove("F", 5, 70);
            

            myFinch.StopAll();
            myFinch.disconnect();

    }


}