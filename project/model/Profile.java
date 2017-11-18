package model;

/**
 * 
 * @author Clederson Cruz
 *  User profile. This model has information about test results.
 *
 */

public class Profile {
	/*
	 * Each letter means an animal.
	 * Each animal means a behavioral profile.
	 * Both means a brain region used on test.
	 * 
	 * */

	final public int A;
	final public int C;
	final public int I;
	final public int O;
	final public int EAGLE;
	final public int CAT;
	final public int SHARK;
	final public int WOLF;
	final public int RIGHT;
	final public int LEFT;
	final public int BACK;
	final public int FRONT;

	public Profile(String choices) {
		A = choices.length() - choices.replace("A", "").length();
		C = choices.length() - choices.replace("C", "").length();
		I = choices.length() - choices.replace("I", "").length();
		O = choices.length() - choices.replace("O", "").length();
		EAGLE = I * 4;
		CAT = C * 4;
		SHARK = A * 4;
		WOLF = O * 4;
		RIGHT = (I * 4) + (C * 4);
		LEFT = (O * 4) + (A * 4);
		BACK = (O * 4) + (I * 4);
		FRONT = (C * 4) + (A * 4);
	}
}
