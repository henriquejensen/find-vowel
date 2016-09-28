package br.com.main;

public class TestFindVowel {
	
	public static void testWithInputQuestionExample(FindVowel findVowel) {
		Stream input = new StreamImpl("aAbBABacfe".toLowerCase());
		
		char result = findVowel.findVowel(input);
		
		if(Character.compare('e', result) == 0) {
			System.out.println("Teste Valido: " + result);
		} else
			System.out.println("Teste Invalido: " + result);
	}
	
	public static void testWithCharInFirstPosition(FindVowel findVowel) {
		Stream input = new StreamImpl("cuaAbBABacf".toLowerCase());
		
		char result = findVowel.findVowel(input);
		
		if(Character.compare('u', result) == 0) {
			System.out.println("Teste Valido: " + result);
		} else
			System.out.println("Teste Invalido: " + result);
	}
	
	public static void testWithTwoCharUniques(FindVowel findVowel) {
		Stream input = new StreamImpl("cacacice".toLowerCase());
		
		char result = findVowel.findVowel(input);
		
		if(Character.compare('i', result) == 0) {
			System.out.println("Teste Valido: " + result);
		} else
			System.out.println("Teste Invalido: " + result);
	}
	
	public static void testWithNoCharUnique(FindVowel findVowel) {
		Stream input = new StreamImpl("eaba".toLowerCase());
		
		char result = findVowel.findVowel(input);
		
		if(Character.compare('#', result) == 0) {
			System.out.println("Teste Valido: " + result);
		} else
			System.out.println("Teste Invalido: " + result);
	}
	
	public static void testWithCharUniqueWithoutConsonant(FindVowel findVowel) {
		Stream input = new StreamImpl("eaba".toLowerCase());
		
		char result = findVowel.findVowel(input);
		
		if(Character.compare('#', result) == 0) {
			System.out.println("Teste Valido: " + result);
		} else
			System.out.println("Teste Invalido: " + result);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindVowel findVowel = new FindVowel();
		
		testWithInputQuestionExample(findVowel);
		testWithCharInFirstPosition(findVowel);
		testWithTwoCharUniques(findVowel);
		testWithNoCharUnique(findVowel);
		testWithCharUniqueWithoutConsonant(findVowel);
		
	}

}
