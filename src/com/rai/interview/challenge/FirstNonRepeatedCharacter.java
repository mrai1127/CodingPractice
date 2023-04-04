package com.rai.interview.challenge;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FirstNonRepeatedCharacter {
	
	public static void main(String[] args) {
			
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a String: ");
		String input = scanner.nextLine();
		
		Character firstNonRepeated = findFirstNonRepeatedCharacter(input);
		if(firstNonRepeated == null) {
			System.out.println("No non-repeated character found.");
		}else {
			System.out.println("First non-repeated character: " + firstNonRepeated);
		}
		
		}

	private static Character findFirstNonRepeatedCharacter(String input) {
		Map<Character, Integer> charCounts = new LinkedHashMap<>();
		
		for(int i = 0; i < input.length(); i++) {
			char c = input.charAt(i);
			charCounts.put(c, charCounts.getOrDefault(c, 0) + 1);
		}
		for(Map.Entry<Character, Integer> entry: charCounts.entrySet()) {
			if(entry.getValue() == 1) {
				return entry.getKey();
			}
		}
		return null;
	}
}
