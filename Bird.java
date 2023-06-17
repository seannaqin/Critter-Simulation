
/* Seanna Qin P.1
 * Programming Assignment #9, 2/13/23
 * The purpose of this program is to create a class for the Bird critter.
 * Birds move in a random direction before moving in another random direction.
 */

import java.util.*;

// Bird is a critter
public class Bird implements Critter {
	// Declare private fields
	private Random r = new Random();
	private int[] direction = {NORTH, SOUTH, EAST, WEST};

	// Assign Bird to character B
	public char getChar() {
		return 'B';
	}
	
	public int getMove(CritterInfo info) {
		// Return a random direction
		return direction[r.nextInt(4)];
		
	}
}
