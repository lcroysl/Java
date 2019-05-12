package Uppgifter;

import java.util.Scanner;

public class Hangman_game {

	
	
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		
		//inneh�ller liv, ord och utskrift/input i b�rjan av programmet
		int liv = 7;
		String[] ord = {"cykel", "datormus", "gata", "tr�nare", "golv", "strumpa", "t�g", "tr�d", "racket", "godis", "linux", "f�nster", "kvart", "ovanf�r", "st�l", "kalcium", "magnesium", "salt", "reaktion", "kusin","stad","t�cka","t�lamod"};
		System.out.println("V�lkommen till H�nga Gubben!");
		System.out.println("Skriv in n�got f�r att b�rja!");
		String c = inp.nextLine();
		System.out.println("Gissa ordet! Skriv in en bokstav");
		
		//slumpar ett ord from arrayen och skriver ut det g�mda ordet och g�r om ordet till en char array
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
		
		//l�ter anv�ndaren gissa bokst�ver och j�mf�r om de har r�tt eller inte och skriver ut meddelande beroende p� om de har r�tt eller fel
		while(liv != -1) {
			char input1 = inp.next().toLowerCase().charAt(0);
			boolean kk = true;
			System.out.println("�terst�end liv: " + liv);
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
				System.out.println("Du f�rlorade!");
				System.out.println("Ordet var: " + wordfail);
				break;
			}
			//omvandlar char array till en string och j�mf�r de f�r att kolla om de st�mmer
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
