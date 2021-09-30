/**
 * Program to find the mean quantity of die rolls needed to land on a 2.
 * @author Will Brown
 * @version 1.0
 * Fall 2021
 */
public class RecDieRollerMean {

	/**
	 * Rolls the die 1000 times and reports the mean quantity of
	 * die rolls needed to land a 2. The result should be around 6.
	 * @param args
	 */
	public static void main(String[] args) {
		RecDieRoller myDieRoller = new RecDieRoller();
		int completeRollCount = 0;
		int instanceRollCount;
		
		for (int i = 1; i <= 1000; i++) {
			instanceRollCount = myDieRoller.roll();
			System.out.println("Roll count for instance " + i + ": " + instanceRollCount);
			completeRollCount += instanceRollCount;
		}
		
		System.out.println("Total roll count: " + completeRollCount);
		System.out.println("Mean roll count per instance: " + (double) completeRollCount / 1000);
	}

}
