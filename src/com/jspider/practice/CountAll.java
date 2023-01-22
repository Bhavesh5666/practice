package com.jspider.practice;

import java.util.Scanner;

public class CountAll {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter String");
		String inputString = scanner.next();
		int lowerCase = 0;
		int uperCase = 0;
		int number = 0;
		int symbol = 0;
			
		for(int i = 0 ; i<inputString.length();i++) {
			if (inputString.charAt(i)>96 && inputString.charAt(i)<123) {
				lowerCase++;
				
			} else if (inputString.charAt(i)<97 && inputString.charAt(i)>63){
					uperCase++;
			} else if (inputString.charAt(i)>=0 && inputString.charAt(i)<=9) {
				number++;
			}else {
				symbol++;
			}
		}
		System.out.println("Uper case in String is :" + uperCase);
		System.out.println("lower case in String is :" + lowerCase);
		System.out.println("number case in String is :" + number);
		System.out.println("sysmbol case in String is :" + symbol);
	}
}
