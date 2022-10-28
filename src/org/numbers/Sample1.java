package org.numbers;

import java.util.Scanner;

public class Sample1 {
public static void main(String[] args) {
	Scanner q=new Scanner(System.in);
	String a =" Sakthivel";
	int i;
	for (i=1;i<a.length();i++) {
		char b = a.charAt(i);
		System.out.println("Enter a Word");
		System.out.println(b);
	}
	String nextLine = q.nextLine();
	System.out.println(nextLine);
	System.out.println("The Name is: Sakthivel");
}
}
