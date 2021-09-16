package br.com.arrays;

public class IsUnique {

	public static void main(String[] args) {

		IsUnique i = new IsUnique();
		System.out.println(i.isUnique("Aloha"));
		System.out.println(i.isUnique("Teste"));
		System.out.println(i.isUnique("Filipe"));
	}

	public boolean isUnique(String str) {
		
		if(str.length() > 128) return false;
		
		boolean[] charExists = new boolean[128];
		for(int i=0; i < str.length(); i++) {
			int val = str.charAt(i);
			
			if(charExists[val]) { ///Already found this char in string
				return false;
			}			
			charExists[val] = true;			
		}
		return true;
	}
}
