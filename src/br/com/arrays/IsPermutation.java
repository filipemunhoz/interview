package br.com.arrays;

import java.util.Arrays;

public class IsPermutation {
	
	public static void main(String[] args) {
		IsPermutation i = new IsPermutation();
		System.out.println(i.isPermutation("ovo", "voo"));
		System.out.println(i.isPermutation("apos", "sopa"));
		System.out.println(i.isPermutation("ame", "ema"));
		System.out.println(i.isPermutation("cat", "doggo"));
	}
	
	public boolean isPermutation(String s1, String s2) {
		if(s1.length() != s2.length()) {
			return false;
		}
		
		if (sort(s1).equals(sort(s2))) {
			return true;
		}
		return false;
	}

	String sort(String s) {
		char[] c = s.toCharArray();
		Arrays.sort(c);
		return new String(c);
		
	}
}
