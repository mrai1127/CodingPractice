package com.rai.interview.challenge;

import java.util.Scanner;

public class ReverseAString {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String input = scanner.nextLine();
		
		String reversed = reverseAString(input);
		System.out.println("Reversed String: " + reversed);
	}

	private static String reverseAString(String input) {
		StringBuilder sb = new StringBuilder(input);
		return sb.reverse().toString();
	}

}
