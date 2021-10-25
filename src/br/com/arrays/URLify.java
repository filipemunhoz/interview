package br.com.arrays;

public class URLify {

	public static void main(String[] args) {

		URLify u = new URLify();

		String s = "Mr John Smith       ";
		System.out.println(u.replace(s.toCharArray(), 13));

	}

	public String replace(char[] chars, int trueLength) {

		int spaces = 0;
		for(int i=0; i<trueLength; i++) {
			if(chars[i] == ' ') {
				spaces++;
			}
		}
		
		int index = trueLength + spaces * 2 - 1; 
		System.out.println(index);
		for (int i = trueLength - 1; i >= 0; i--) {
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
