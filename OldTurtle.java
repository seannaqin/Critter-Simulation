
/* Seanna Qin P.1
 * Programming Assignment #9, 2/13/23
 * The purpose of this program is to create a class for the Old Turtle critter.
 * Old turtles move 5 spaces in a direction before turning 90 degrees clockwise. However, it stops after each step.
 */

// Old Turtle is a critter
public class OldTurtle implements Critter {
	// Declare private fields
	private int[] counter = new int[4];
	private boolean[] move = new boolean[1];
	private int[] direction = {SOUTH, WEST, NORTH, EAST};
	
	// Assign Old Turtle character to O
	public char getChar() {
		return 'O';
	}
	
	public int getMove(CritterInfo info) {
		// Reset the counter if a full box has been complete
		if (counter[3] == 5) {
			for (int i = 0; i < counter.length; i++) {
				counter[i] = 0;
			}
		}
		
		// Return a direction if the turtle did not move last turn
		if (!move[0]) {
			for (int i = 0; i < counter.length; i++) {
				// Check counters to determine which direction to move
				if (counter[i] != 5) {
					counter[i]++;
					move[0] = true;
					return direction[i];
				}
			}
		}
		// Reassign move boolean to false because turtle will not move this turn
		else {
			move[0] = false;
		}
		// Stay in place if the turtle did not move
		return CENTER;

	}
}