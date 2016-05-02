import java.util.Scanner;
import java.util.Random;

public class DiceGameMain {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random random = new Random();
		DiceClass user1 = new DiceClass();
		
		int choice;
		int totalNumRolled = 0;
		int wins=0;
		
		do{
		System.out.println("How many times would you like to roll? ");
		int timesRolled = input.nextInt();
		
		user1.setRolls(timesRolled);
		user1.trackOfThrows(timesRolled);
		
		int realNumberRolled = user1.numberRolled(timesRolled);
		
		
		
		System.out.println("What do you believe to have rolled? ");
		int guessRolled = input.nextInt();
		user1.saying(realNumberRolled, guessRolled);
		user1.trackOfResults(realNumberRolled, guessRolled);
		
		System.out.println("Want to play again? (Y=1/N=0): ");
		choice = input.nextInt();
		}while(choice==1);
		
		user1.sayNumOfThrowsAndWins();
		
		
		
		

	}

}