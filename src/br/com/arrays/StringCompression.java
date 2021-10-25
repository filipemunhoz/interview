package br.com.arrays;

public class StringCompression {

	public static void main(String[] args) {
		StringCompression s = new StringCompression();
		System.out.println(s.compress("aabcccccaaa"));

	}

	String compress(String s) {
		int count = 0;
		String c = "";
		
		for(int i=0; i < s.length(); i++) {
			count++;
			if(i + 1 >= s.length() || s.charAt(i) != s.charAt(i + 1)) {
				c += s.charAt(i) + "" + count;
				count=0;
			}
			
		}

		return c.length() < s.length() ? c : s;
	}

}
