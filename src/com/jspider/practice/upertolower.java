package com.jspider.practice;

import java.util.Scanner;

public class upertolower {
	
	static Scanner scanner = new Scanner(System.in);
	static String result;
	static char cast;
	public static void main(String[] args) {
		
		System.out.println("enter string ");
		String userInput= scanner.next();
		
		for(int i = 0; i<userInput.length(); i++) {
			int output=userInput.charAt(i);
			
			if (output>64 && output<97) {
				cast = (char) (output +32);
				System.out.print(cast);
			} else {
				cast = (char) (output -32);
				System.out.print(cast);
			}
			
			
			
		}
		
	}

}
