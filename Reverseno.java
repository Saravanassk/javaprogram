/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Reverseno {
    public static void Reverse(int num)
    {
        // base condition to end recursive calls
        if (num < 10) {
            System.out.println(num);
            return;
        }
        else {
            // print the unit digit of the given number
            System.out.print(num % 10);
            // calling function for remaining number other than unit digit
            Reverse(num / 10);
        }
    }

    // driver code
    public static void main(String args[])
    {
        // number to be reversed
        int num = 1099;

        System.out.print("Reversed Number: ");
        // calling recursive function to print the number in reversed form
        Reverse(num);
    }
}
