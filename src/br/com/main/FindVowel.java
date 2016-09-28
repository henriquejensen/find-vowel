package br.com.main;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindVowel {
	
	/* Funcao verifica se encontrou uma vogal apos uma consoante, 
	 * se sim, verifica se o array com caracteres unicos contem a vogal,
	 * se contem, remove ela do array de unicos
	 * se nao, verifica se a vogal ja foi lida e armazenada no array de repetidos
	 * se nao foi armazenada entao armazena no array de vogais unicas */
	public static void addORemoveChar(List<Character> characterUniques, Set<Character> characterRepeated, boolean vowel, boolean consonant, char letter) {		
		if(vowel) {			
			if(characterUniques.contains(letter)) {
				int i = characterUniques.indexOf(letter);
				characterUniques.remove(i);
			} else {
				if(!characterRepeated.contains(letter) && consonant)
					characterUniques.add(letter);
			}
			
			/*Adiciona ao array de repetidas para que nao seja adicionada ao array de unicos*/
			characterRepeated.add(letter);
		}
	}

	public static char firstChar(Stream input){
		
		/*flags para verificar se é uma vogal e se tem uma consoante antes*/
		boolean consonant = false;
		boolean vowel = false;
		
		/*Arrays para armazenar os caracteres unicos encontrados e os repetidos.
		 * Ao final da funcao o primeiro elemento do array de unicos deve ser a
		 * primeira vogal lida apos uma consoante sem se repetir na stream*/
		List<Character> characterUniques = new ArrayList<>();
		Set<Character> characterRepeated = new HashSet<>();
		
		while(input.hasNext()) {
			
			char letter = input.getNext();
			
			switch (letter) {
				case 'a':
					vowel = true;
					
					addORemoveChar(characterUniques, characterRepeated, vowel, consonant, letter);
					
					consonant = false;
					break;
				case 'e':
					vowel = true;
					
					addORemoveChar(characterUniques, characterRepeated, vowel, consonant, letter);
					
					consonant = false;
					break;
				case 'i':
					vowel = true;
					
					addORemoveChar(characterUniques, characterRepeated, vowel, consonant, letter);
					
					consonant = false;
					break;
				case 'o':
					vowel = true;
					
					addORemoveChar(characterUniques, characterRepeated, vowel, consonant, letter);
					
					consonant = false;
					break;
				case 'u':
					vowel = true;
					
					addORemoveChar(characterUniques, characterRepeated, vowel, consonant, letter);
					
					consonant = false;
					break;
	
				default:
					vowel = false;					
					consonant = true;
					break;
			}
		}
		
		try {
			return characterUniques.get(0);
		} catch (Exception e) {
			System.out.println("Não foi encontrato caracter com apenas uma ocorrência.");
			return '#';
		}
	}
}
