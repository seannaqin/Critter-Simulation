
/* Seanna Qin P.1
 * Programming Assignment #9, 2/13/23
 * The purpose of this program is to create a class for the Turtle critter.
 * Turtles move 5 spaces in a direction before turning 90 degrees clockwise.
 */

// Turtle is a critter
public class Turtle implements Critter {
	// Declare private fields
	private int[] counter = new int[4];
	private int[] direction = {SOUTH, WEST, NORTH, EAST};
	
	// Assign Turtle to character T
	public char getChar() {
		return 'T';
	}
	
	public int getMove(CritterInfo info) {
		// Reset the counter if each direction is full (turtle has completed a box)
		if (counter[counter.length - 1] == 5) {
			for (int i = 0; i < counter.length; i++) {
				counter[i] = 0;
			}
		}
		
		// Determine which direction turtle should move by checking counter
		for (int i = 0; i < counter.length; i++) {
			if (counter[i] != 5) {
				counter[i]++;
				return direction[i];
			}
			
		}
		// Return statement if something fails
		return direction[0];

	}
}