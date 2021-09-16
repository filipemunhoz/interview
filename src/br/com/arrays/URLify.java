package br.com.arrays;

public class URLify {

	public static void main(String[] args) {

		URLify u = new URLify();

		String s = "Mr John Smith       ";
		System.out.println(u.replace(s.toCharArray(), 13));
	}

	String replace(char[] chars, int len) {
		if (chars == null) {
			return "";
		}
		int spaceCount = 0;
		int index = 0;
		// first loop, locate last position
		for (int i = 0; i < len; i++) {
			if (chars[i] == ' ') {
				spaceCount++;
			}
		}
		System.out.println("[spaceCount] - " + spaceCount);
		
		index = len + spaceCount * 2 - 1;
		
		System.out.print("[index]-" + index);
		System.out.print(" [len]-" + len);
		System.out.print(" [spaceCount * 2]-" + spaceCount * 2);
		
		// second loop, replace spaces from the end
		for (int i = len - 1; i >= 0; i--) {
			System.out.println("c: " + chars[i]);
			if (chars[i] == ' ') {
				chars[index] = '0';
				chars[index - 1] = '2';
				chars[index - 2] = '%';
				index -= 3;
				System.out.println(chars);
			} else {
				chars[index] = chars[i];
				index--;
			}
		}
		return new String(chars).trim();
	}

}
