public class Dice {

	// -- attributes -----------------------
	private int eyeCount;

	// -- constructor ----------------------
	public Dice() {
		eyeCount = 1;
	}

	// -- methods ---------------------------
	public void throw() {
		/* randomize a new eye count between 1-6
		    using ?random? a class method of the Math class */
		eyeCount = (int)(Math.random()*6+1);
	}

	public int checkEyeCount() {
		return eyeCount;
	}
}