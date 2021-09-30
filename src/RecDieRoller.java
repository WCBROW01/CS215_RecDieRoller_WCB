import java.util.Random;

/**
 * Recursive die roller that rolls until it lands a 2.
 * @author Will Brown
 * @version 1.0
 * Fall 2021
 */
public class RecDieRoller {

	private Random dieGenerator = new Random();
	
	/**
	 * Rolls the die until a 2 is landed.
	 * @return the total count of rolls needed to land a 2
	 */
	public int roll() {
		int rollCount = 1;
		int dieResult = dieGenerator.nextInt(6) + 1;
		System.out.println(dieResult);
		
		if (dieResult != 2)
			/*
			 * Add the return value of the next instance of roll() to rollCount.
			 * As the stack is emptied, the value of rollCount will increase.
			 */
			rollCount += roll();
		
		/* 
		 * This return value basically represents the distance of the current
		 * instance from the top of the stack until we reach the bottom of the
		 * stack, where rollCount will actually represent the total number of rolls.
		 */
		return rollCount;
	}
	
}
