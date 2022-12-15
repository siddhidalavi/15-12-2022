package JavaTest1;
import java.util.Scanner;

public class classTest_1 
{

	public static void main(String[] args) {
		final int pin=1234;
		int guessPin;
		int count = 0;
		
		Scanner sc = new Scanner (System.in);
		
		for(int i=1;i<=3;i++)
		{			
			System.out.println("Enter Pin: ");
			guessPin =sc.nextInt();
			if (guessPin==pin)
			{
				System.out.println("Correct pin, Welcome");
				break;
				
		}
		else {
			count++;
			if(count>=3)
			{
				System.out.println("Sorry Enter Pin again");
				break;
			}
				System.out.println("Incorrect Pin Try again");
			}
			
				
				
		}

	}

}
