package hashtableintlab;

import java.util.*;
import java.io.*;
import static java.lang.System.*;

public class HashTableRunner {
	public static void main (String[] args) throws IOException {
		
		/* Create scanner object and read file */
		Scanner bum = new Scanner(new File("numbers.dat"));

		try {
			/* Create lists */
			ArrayList<LinkedList<Number>> pancake = new ArrayList<LinkedList<Number>>();
			for (int i = 0; i < 10; i++) {
				pancake.add(new LinkedList<Number>());
			}
			
			/* Read from the file */
			int numLines = 31;
			ArrayList<Number> nums = new ArrayList<Number>();
			for (int i = 0; i < numLines; i++) {
				nums.add(new Number(Integer.parseInt(bum.nextLine())));
				//System.out.print(nums.get(i) + " ");
			}
			/* Load stuff into the table */
			for (Number num : nums) {
			    int temp = num.hashCode();
			    LinkedList<Number> temp2 = pancake.get(temp);
			    if (!temp2.contains(num)) {
			        temp2.add(num);
			    }
			}

			
			/* Print out the table */
			System.out.println("HASHTABLE");
			for (int i = 0; i < pancake.size(); i++) {
				System.out.print("bucket " + i + " ");
				for (Number num : pancake.get(i)) {
					System.out.print(num + " ");
				}
				System.out.println();
			}
			
			/* Sample output
			 * HASHTABLE
			 * bucket 0 10
			 * bucket 1 21 1 11
			 * bucket 2 12 2
			 * bucket 3 23 43 3
			 * bucket 4 34 54 4
			 * bucket 5 45 65 5
			 * bucket 6 56 76 6
			 * bucket 7 7
			 * bucket 8 78 98 8
			 * bucket 9 9 */
		}
		
		/* Exception caught, explanation given */
		catch(Exception e) {
			System.out.println("Houston, we have a problem!");
			System.out.println(e.getMessage());
		}
		
	}
}
