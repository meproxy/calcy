package com.Calculators.model;

public class Calculation {
	public int addition(int x, int y) {
		return x + y;
	}

	public int multiplication(int x, int y) {
		return x * y;
	}

	public int subtraction(int x, int y) {
		return x - y;
	}

	public int divison(int x, int y) {
		return x / y;
	}

	public String invalidOperator() {
		String io = "Invalid Operator Entered";
		return io;
	}
}
