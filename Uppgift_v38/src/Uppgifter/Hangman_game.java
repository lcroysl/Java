package Uppgifter;

import java.util.Scanner;

public class Hangman_game {

	
	
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		
		//innehåller liv, ord och utskrift/input i början av programmet
		int liv = 7;
		String[] ord = {"cykel", "datormus", "gata", "tränare", "golv", "strumpa", "tåg", "träd", "racket", "godis", "linux", "fönster", "kvart", "ovanför", "stål", "kalcium", "magnesium", "salt", "reaktion", "kusin","stad","täcka","tålamod"};
		System.out.println("Välkommen till Hänga Gubben!");
		System.out.println("Skriv in något för att börja!");
		String c = inp.nextLine();
		System.out.println("Gissa ordet! Skriv in en bokstav");
		
		//slumpar ett ord from arrayen och skriver ut det gömda ordet och gör om ordet till en char array
		int index = (int) (Math.random()*ord.length);
		String ordet = ord[index];
		char[] guessword = new char[ordet.length()];
		for (int i = 0; i <= guessword.length -1; i++) {
			guessword[i] = '_' + ' ';
		}
		for (int i = 0; i <= ordet.length() -1; i++) {
			System.out.print("_ ");
		}
		char[] Ordet = ordet.toCharArray();
		String wordfail = new String(Ordet);
		
		//låter användaren gissa bokstäver och jämför om de har rätt eller inte och skriver ut meddelande beroende på om de har rätt eller fel
		while(liv != -1) {
			char input1 = inp.next().toLowerCase().charAt(0);
			boolean kk = true;
			System.out.println("Återståend liv: " + liv);
			for (int i = 0; i <= ordet.length() -1; i++) {
				if(input1 == ordet.charAt(i)) {
					kk = false;
					guessword[i] = input1;
					System.out.println("Bra gissat! Gissa igen!");
				}
			}
				if(kk) {
					liv--;
				System.out.println("Oof! Gissa igen!");
				}
				if(liv == 6) {
					System.out.println("  +---+\r\n" + 
							"  |   |\r\n" + 
							"      |\r\n" + 
							"      |\r\n" + 
							"      |\r\n" + 
							"      |");
				}
				if(liv == 5) {
					System.out.println("  +---+\r\n" + 
							"  |  \\|\r\n" + 
							"      |\r\n" + 
							"      |\r\n" + 
							"      |\r\n" + 
							"      |");
				}
				if(liv == 4) {
					System.out.println("  +---+\r\n" + 
							"  |  \\|\r\n" + 
							"  O   |\r\n" + 
							"      |\r\n" + 
							"      |\r\n" + 
							"      |");
				}
				if(liv == 3) {
					System.out.println("  +---+\r\n" + 
							"  |  \\|\r\n" + 
							"  O   |\r\n" + 
							"  |   |\r\n" + 
							"      |\r\n" + 
							"      |");
				}
				if(liv == 2) {
					System.out.println("  +---+\r\n" + 
							"  |  \\|\r\n" + 
							"  O   |\r\n" + 
							" /|   |\r\n" + 
							"      |\r\n" + 
							"      |");
				}
				if(liv == 1) {
					System.out.println("  +---+\r\n" + 
							"  |  \\|\r\n" + 
							"  O   |\r\n" + 
							" /|\\  |\r\n" + 
							"      |\r\n" + 
							"      |");
				}
				if(liv == 0) {
					System.out.println("  +---+\r\n" + 
							"  |  \\|\r\n" + 
							"  O   |\r\n" + 
							" /|\\  |\r\n" + 
							" /    |\r\n" + 
							"      |");
				}
			if(liv == -1) {
				System.out.println("  +---+\r\n" + 
						"  |  \\|\r\n" + 
						"  O   |\r\n" + 
						" /|\\  |\r\n" + 
						" / \\  |\r\n" + 
						"      |");
				System.out.println("Du förlorade!");
				System.out.println("Ordet var: " + wordfail);
				break;
			}
			//omvandlar char array till en string och jämför de för att kolla om de stämmer
			String Ordet1 = new String(Ordet);
			String Ordet2 = new String(guessword);
			System.out.println(guessword);
			if(Ordet1.equals(Ordet2)) {
				System.out.println("Grattis! Du vann!");
				break;
			}
		}
		inp.close();
}
	
	
}
