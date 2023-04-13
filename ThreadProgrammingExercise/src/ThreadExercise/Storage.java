package ThreadExercise;

public class Storage {
	
	int val;
	boolean printed = true;
	public void setValue(int value) {
		this.val = value;
	}
	public int getValue() {
		return this.val;
	}
	public boolean isPrinted() {
		return printed;
	}
	public void setPrinted(boolean print) {
		printed = print;
	}
}
