
/* Seanna Qin P.1
 * Programming Assignment #9, 2/13/23
 * The purpose of this program is to create a class for the Frog critter.
 * Frogs move in a random direction 3 spaces at a time before moving in another random direction.
 */

import java.util.*;

// Frog is a critter
public class Frog implements Critter {
	// Declare private fields
	private int[] counter = new int[4];
	private int[] direction = {NORTH, SOUTH, EAST, WEST};
	private Random r = new Random();
	
	// Assign Frog to character F
	public char getChar() {
		return 'F';
	}
	
	public int getMove(CritterInfo info) {
		// Check if counter is full or not to determine if frog will move in a new direction or continue in the old direction
		for (int i = 0; i < counter.length; i++) {
			if (counter[i] != 0) {
				counter[i]++;
				// Reset counter if frog has moved 3 consecutive spaces in the same direction
				if (counter[i] == 3) {
					counter[i] = 0;
				}
				return direction[i];
			}
		}
		// Get a random direction if counter is 0
		int rand = r.nextInt(4);
		counter[rand]++;
		return direction[rand];
	}
}