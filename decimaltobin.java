/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class decimaltobin {
    public static void main(String args[])
	{   
		//Decimal Number
		int decimal = 12;
		//integer array for storing binary digits 
		int binary[] = new int[20];
		int i = 0; 
		//writing logic for the conversion 
		while(decimal > 0)
		{       
			int r = decimal % 2;
			binary[i++] = r;
			decimal = decimal/2;
		}
		//printing result
		System.out.print("Binary number : ");
		for(int j = i-1 ; j >= 0 ; j--)
		System.out.print(binary[j]+"");
	}
}