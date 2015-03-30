package DiceBag;
import java.util.Random;
import java.util.Scanner;

public class d4_d100 {

	public static void main(String[] args) {
		String dice;
		int result;
		Scanner keyboard = new Scanner(System.in);
		Random number = new Random();
		
		System.out.println("Welcome to the DiceBag!!!");
		System.out.println("Insert the dice type you wanna use:");
		System.out.println("D4 / D6 / D8 / D10 / D12 / D14 / D16 / D20 / D100");
		dice = keyboard.nextLine();
				
		switch(dice){
			case"D4":
				 result = number.nextInt(5)-0;
				 System.out.println(result);
				 break;
				 
			case"D6":
				 result = number.nextInt(7)-0;
				 System.out.println(result);
				 break;
			
			case"D8":
				 result = number.nextInt(9)-0;
				 System.out.println(result);
				 break;
			case"D10":
				 result = number.nextInt(11)-0;
				 System.out.println(result);
				 break;
			case"D12":
				 result = number.nextInt(13)-0;
				 System.out.println(result);
				 break;
			case"D14":
				 result = number.nextInt(15)-0;
				 System.out.println(result);
				 break;
			case"D16":
				 result = number.nextInt(17)-0;
				 System.out.println(result);
				 break;
			case"D18":
				 result = number.nextInt(19)-0;
				 System.out.println(result);
				 break;
			case"D20":
				 result = number.nextInt(21)-0;
				 System.out.println(result);
				 break;
			case"D100":
				result = number.nextInt(101)-0;
				System.out.println(result);
			default:
				System.out.println("Sorry but we don't have that type of Dice yet. ");
		}
		

	}

}
