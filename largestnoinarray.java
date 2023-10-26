/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */   //Largest Element of the array using Recursion in Java
public class largestnoinarray {  
  
     static int arr[] = {10, 32, 45, 90, 98};
     // Method to find maximum in arr[]
     static int largest()
     {
         int i;
         // Initialize maximum element
         int max = arr[0];
       
         // Traverse array elements from second and compare every element with current max
         for (i = 1; i < arr.length; i++)                        if (arr[i] > max)
                 max = arr[i];
         return max;
     }
     public static void main(String[] args)
     {
         System.out.println("Largest in given array is " + largest());
    }
}
