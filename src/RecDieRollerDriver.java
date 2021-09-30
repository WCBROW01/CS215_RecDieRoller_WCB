/**
 * Driver for the die roller.
 * @author Will Brown
 * @version 1.0
 * Fall 2021
 */
public class RecDieRollerDriver {

	/**
	 * Calls the die roller once and prints the number of rolls
	 * needed to land a 2.
	 * @param args
	 */
	public static void main(String[] args) {
		RecDieRoller myDieRoller = new RecDieRoller();
		System.out.println("Total roll count: " + myDieRoller.roll());
	}

}
