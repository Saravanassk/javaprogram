/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User  //Java program to find number of digits in an integer
 */
public class numofdigitsininteger {
    public static void main(String[] args)
	{
		int number = 12345;

		//declare a variable to count number of digits
		int digit = 0;
		while(number != 0)
		{
			//pick last digit of the number and count one by one
			int pick_last = number % 10;
			digit++;
			number = number / 10;
		}

		//display number of digits
		System.out.print("Number of Digits = "+digit);

	}
}
