package data_object;

import data_interface.MathAction;

public class Calculation implements MathAction {
	public double area(int r) {
		return pi*Math.pow(r,2);
	}
	
	public double round(int r) {
		return pi*2*r;
	}
}
