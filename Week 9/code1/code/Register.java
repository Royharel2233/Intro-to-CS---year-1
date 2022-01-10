/** Represents a register.
 *  A register is the basic storage unit of the Vic computer. */

public class Register {

    private int value;  // the current value of this register
    
    /** Constructs a register and sets its value to 0. */
    public Register() {
        // Put your code here
        setValue(0);
    }
    
    /** Sets the value of this register.
     * @param v the value to which the register will be set. */
    public void setValue(int val) {
        value = val;
        // Put your code here
    }
    
    /** Increments the value of this register by 1. */
    public void addOne() {
        setValue(getValue() + 1);
        // Put your code here
    }

    /** Returns the value of this register.
     * @return the current value of this register, as an int. */
    public int getValue() {
        // Put your code here
        return value;
    }
    
    /** Returns a textual representation of the value of this register.
     * @return Returns the value of this register, as a String. */
    public String toString() {
        // Put your code here
        return "" + value;
    }
}
