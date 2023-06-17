/* Seanna Qin P.1
 * Programming Assignment #9, 2/13/23
 * The purpose of this program is to create a class for the Wolf critter.
 * Wolves spin in a circle of a random radius and moves a random number of spaces East after each spin.
 */
import java.util.Random;

// Wolf is a Critter
public class Wolf implements Critter {
	// Declare private fields
	private int[] counter = {1, 0, 0, 0, 0};
	private Random r = new Random();
	private int radius = r.nextInt(2) + 2;
	private int move = r.nextInt(radius*2) + 3;
	private int[] direction = {NORTH, EAST, SOUTH, WEST, NORTH, EAST};
	
	// Assign Wolf character to W
	public char getChar() {
		return 'W';
	}
	
	public int getMove(CritterInfo info) {
		// Reset the counter array if necessary
		if (counter[counter.length - 2] > radius*2 - 1) {
			for (int i = 0; i < counter.length; i++) {
				counter[i] = 0;
			}
			// Decrement first variable in counter to move further
			counter[0] = 1 - move;
		}
		
		// Run through direction array starting East (second variable) and ending North (second to last variable)
		for (int i = 1; i < direction.length - 1; i++) {
			// Keep going in the same direction if diameter has not been reached
			if (counter[i-1] < radius*2 - 1) {
				counter[i-1]++;
				return direction[i];
			}
			
			// Move in the next direction 1 step before reaching the diameter to create an angle
			else if (counter[i-1] == radius*2 - 1 && counter[i] == 0) {
				counter[i]++;
				return direction[i+1];
			}
			
			// If the angle has been made, take one more step to finish one side of the circle
			else if (counter[i-1] == radius*2 - 1) {
				counter[i-1]++;
				return direction[i];
			}
		}
		
		// Return statement if something fails
		return direction[0];
		
	}
}
