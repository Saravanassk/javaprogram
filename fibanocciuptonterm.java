/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class fibanocciuptonterm {
     public static void main (String[]args)
   {

     int num = 15;
     int a = 0, b = 1;

     // Here we are printing 0th and 1st terms
       System.out.print (a + " , " + b + " , ");

     int temp;

     // printing the rest of the terms here
     for (int i = 2; i < num; i++)
       {
      temp = a + b;
      a = b;
          b = temp;
          System.out.print (temp + " , ");
       }


   }
    
}
