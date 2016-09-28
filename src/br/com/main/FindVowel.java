package br.com.main;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindVowel {
	
	/* each position represent a vowel
	 * pos[0] == a, pos[1] == b ...
	 * the vector will store the quantity of vowels
	 * in input stream
	*/
	
	public void addORemoveChar(List<Character> characterUniques, Set<Character> characterRepeated, boolean vowel, boolean consonant, char letter) {		
		if(vowel) {			
			if(characterUniques.contains(letter)) {
				int i = characterUniques.indexOf(letter);
				characterUniques.remove(i);
			} else {
				if(!characterRepeated.contains(letter) && consonant)
					characterUniques.add(letter);
			}
			
			characterRepeated.add(letter);
		}
	}

	public char findVowel(Stream input){
		
		boolean consonant = false;
		boolean vowel = false;
		
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
			// TODO: handle exception
			System.out.println("Não encontrado");
			return '#';
		}
	}
}
