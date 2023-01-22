package com.jspider.practice;

import java.util.Scanner;

public class CountSameChar {
	static Scanner scanner = new Scanner(System.in);
	
	
	public static void main(String[] args) {
		int count = 0;
		System.out.println("enter string");
		String userInput = scanner.next();
		System.out.println("enter search char");
		String searchChar = scanner.next();
		for(int i = 0 ; i<userInput.length(); i++) {
			if (userInput.charAt(i)==searchChar.charAt(0)) {
				count++;
			}
		}
		System.out.println(count);
	}

}
