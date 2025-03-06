package hashtableintlab;

public class Number {
	private int theValue;
	
	/* Parameterized constructor
	 * @param value			value for theValue*/
	public Number(int value) {
		theValue = value;
	}	
	
	/* Returns theValue
	 * @return int			theValue */
	public int getValue() {
		return theValue;
	}
	
	/* Checks if two number objects are equal
	 * @return true			objects equal
	 * @return false		objects not equal */
	public boolean equals(Number obj) {
		if (theValue == obj.getValue()) {
			return true;
		}
		else {
			return false;
		}
	} 
	
	/* Returns the generated hashCode value
	 * @return int			hashCode */
	public int hashCode() {
		return theValue%10;
	}

	/* Prints information about the Number object
	 * @return String		theValue */
	public String toString() {
		return "" + theValue;
	}
	
}
