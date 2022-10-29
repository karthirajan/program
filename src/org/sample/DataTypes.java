package org.sample;

public class DataTypes {

	public static void main(String[] args) {
		System.out.println("********Primitive Data Types**********");
		int i = 33;
		long j = 45678;
		short s = 234;
		float f = 66.78f;
		double d = 45667.567;
		boolean b = false;
		byte y = 4;
		char c = 't';
		Object o = 0.5;// it is a super class of data type
		System.out.println("integer:" + i + '\n' + "double:" + d + '\n' + "boolean:" + b + '\n' + "byte:" + y + '\n'
				+ "character:" + c + '\n' + "Object:" + o);
		System.out.println("**************Non-Primitive Data Types*****************");
		String w = "aathi prakash";

		int[] n = { 11, 22, 33, 44, 55, 66, 77 };
		System.out.println("I'm String:" + w + '\n' + "I'm Array:" + n);

	}

}
