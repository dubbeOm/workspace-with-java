package P_constractor;

public class parameterizedConstractor {

	private int value;
	
	
	
	public parameterizedConstractor(int value) {
		this.setValue(value);  //using setter method
	}

	public int getValue() { //using getter method
		return value;
	}
//parameterized Constractor
	
	public void setValue(int value) {
		this.value = value;
	}
	
}
