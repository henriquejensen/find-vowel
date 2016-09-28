package br.com.main;

public class TestFindVowel {
	
	public static void testCharAtFirstPosition(FindVowel findVowel) {
		Stream input = new StreamImpl("aAbBABacfe".toLowerCase());
		
		findVowel.findVowel(input);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindVowel findVowel = new FindVowel();
		
		testCharAtFirstPosition(findVowel);
		
	}

}
