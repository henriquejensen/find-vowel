package br.com.main;

public class TestFindVowel {
	
	public static void testWithInputQuestionExample() {
		Stream input = new StreamImpl("aAbBABacfe".toLowerCase());
		
		char result = FindVowel.firstChar(input);
		
		if(Character.compare('e', result) == 0) {
			System.out.println("Teste Valido: " + result);
		} else
			System.out.println("Teste Invalido: " + result);
	}
	
	public static void testWithCharInFirstPosition() {
		Stream input = new StreamImpl("cuaAbBABacf".toLowerCase());
		
		char result = FindVowel.firstChar(input);
		
		if(Character.compare('u', result) == 0) {
			System.out.println("Teste Valido: " + result);
		} else
			System.out.println("Teste Invalido: " + result);
	}
	
	public static void testWithTwoCharUniques() {
		Stream input = new StreamImpl("cacacice".toLowerCase());
		
		char result = FindVowel.firstChar(input);
		
		if(Character.compare('i', result) == 0) {
			System.out.println("Teste Valido: " + result);
		} else
			System.out.println("Teste Invalido: " + result);
	}
	
	public static void testWithNoCharUnique() {
		Stream input = new StreamImpl("eaba".toLowerCase());
		
		char result = FindVowel.firstChar(input);
		
		if(Character.compare('#', result) == 0) {
			System.out.println("Teste Valido: " + result);
		} else
			System.out.println("Teste Invalido: " + result);
	}
	
	public static void testWithCharUniqueWithoutConsonant() {
		Stream input = new StreamImpl("eaba".toLowerCase());
		
		char result = FindVowel.firstChar(input);
		
		if(Character.compare('#', result) == 0) {
			System.out.println("Teste Valido: " + result);
		} else
			System.out.println("Teste Invalido: " + result);
	}

	public static void main(String[] args) {		
		testWithInputQuestionExample();
		testWithCharInFirstPosition();
		testWithTwoCharUniques();
		testWithNoCharUnique();
		testWithCharUniqueWithoutConsonant();
		
	}

}
