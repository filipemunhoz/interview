package br.com.misc;

import java.util.HashSet;
import java.util.Set;

//https://javarevisited.blogspot.com/2021/10/how-to-find-first-recurring-character.html#ixzz7ALKsGJP4
public class FirstRecurringCharacter {
	
	public static String get(String input) {
		
		Set<Character> recurr = new HashSet<>();
		
		char[] chars = input.toCharArray();
		for (char c : chars) {
			
			boolean isRecuu = recurr.add(c);
			if(!isRecuu) return Character.toString(c);
		}
		return null;
	}
}
