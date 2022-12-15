package JavaTest1;

import java.util.Scanner;

public class classTest_3 {
	public static void main(String[] arg)
	{
		int evenSum=0;
		int oddSum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any two +ve number (first number must be lesser than second)");
		
		int first_num = sc.nextInt();
		int second_num = sc.nextInt();
		
		if (first_num < second_num)
		{
			System.out.println("even numbers are :");
			
			for (int i=first_num; i<=second_num; i++)
			{
				if (i%2==0) {
					System.out.println(i +", ");
					evenSum=evenSum+i;
				}
			}
			System.out.println("\n Sum of Even numbers from"+first_num+" to "+second_num+" is" +evenSum+"\n");
			
			System.out.println("odd numbers are :");
			
			for (int i=first_num; i<=second_num; i++)
			{
				if (i%2!=0) {
					System.out.println(i +", ");
					oddSum=oddSum+i;
				}
			}
			System.out.println("\n Sum of odd numbers from"+first_num+" to "+second_num+" is" +oddSum+"\n");
		}
		else
			System.out.println("invalid input");
	}
}