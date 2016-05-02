import java.util.Random;

public class DiceClass {

	private int rolls;
	private int guess;
	private int trackOfThrows=0;
	private int wins=0;
	private int losses=0;
	
	public DiceClass() {
		
	}
	
	public DiceClass(int rolls, int guess) {

		this.rolls = rolls;
		this.guess = guess;
	}
	
	public void trackOfResults(int realNumberRolled, int guess){
		if(realNumberRolled == guess)
			this.wins = this.wins+1;
		else
			this.losses = this.losses+1;
	}
	
	public void trackOfThrows(int numberOfThrows){
	
		this.trackOfThrows =  this.trackOfThrows + numberOfThrows;
	}
	

	public void setRolls(int rolls){
		this.rolls = rolls;
	}

	public int numberRolled(int rolls){
		int result;
		int fresult = 0;
		Random random = new Random();
		
		for(int i = 0; i<rolls; i++)
		{
			result = random.nextInt(6);
			result++;
			fresult = fresult + result;
		}
		
		
		return fresult;
		
	}

	public void saying(int fresult, int guess){
		if(fresult == guess)
			{
				
				System.out.printf("You guessed correct! %d Lets hit up the Craps tables!\n\n", fresult);
			}
		else
		{
			
			System.out.printf("You guessed wrong! %d Stay away from the Craps tables!\n\n", fresult);
		}
	}
	
	public void sayNumOfThrowsAndWins(){
		System.out.printf("Your total number of rolls was %d and you won %d games while losing %d games.", this.trackOfThrows, this.wins, this.losses);
		}
	}


// Good job...please try and implement the toString method
