package br.com.main;

public class TestFindVowel {
	
	public static void testCharAtFirstPosition(FindVowel findVowel) {
		StreamImpl input = new StreamImpl("aXcc");
		
		findVowel.findVowel(input);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindVowel findVowel = new FindVowel();
		
		testCharAtFirstPosition(findVowel);
		
	}

}
