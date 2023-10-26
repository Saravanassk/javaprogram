/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Perfectno {
     public static void main (String[]args)
   {

     int n = 28, sum = 0;

     for (int i = 1; i < n; i++)
       {
     	if (n % i == 0)
 	        sum = sum + i;
       }

     if (sum == n)
       System.out.println (n + " Is a perfect number");
     else
       System.out.println (n + " Is not a perfect number");

   }
    
}
