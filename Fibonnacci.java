/*11.Write a Java Program  Print the fibonnacci series as follows: -  
    0	1	1	2	3	5	8	13
*/

import java.util.Scanner;
 public class Fibonnacci{
	public static void main(String args[]){
		int num1=0,num2=1,num3=0;
		
		int n=10;

		System.out.print(num1 + " \t" + num2);
		
		for(int i=0;i<n;i++)
		{
			num3=num1+num2;
			System.out.print("\t"+num3);
			num1=num2;
			num2 = num3;
					
		}
	}
}
