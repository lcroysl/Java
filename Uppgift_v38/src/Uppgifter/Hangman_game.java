package Uppgifter;

import java.util.Scanner;

public class Hangman_game {

	//static hangmanconsolewindow JHO = new hangmanconsolewindow();
	
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		int liv = 11;
		
		String[] ord = {"cykel", "musplatta", "gata", "lampa", "klassrum"};
		String blank = "";
		
		System.out.println("Välkommen till Hänga Gubben!");
		System.out.println("Skriv in något för att börja!");
		String c = inp.nextLine();
		
		int index = (int) (Math.random()*ord.length);
		String w = ord[index];
		if (index == 0) {
			for (int i = 0; i < ord.length; i++) {
				
			
			System.out.print("_ ");
			}
		}
		if (index == 1) {
			for (int i = 0; i < ord.length+4; i++) {
				
			
			System.out.print("_ ");
			}
		}
		if (index == 2) {
			for (int i = 0; i < ord.length-1; i++) {
				
			
			System.out.print("_ ");
			}
		}
		if (index == 3) {
			for (int i = 0; i < ord.length; i++) {
				
			
			System.out.print("_ ");
			}
		}
		if (index == 4) {
			for (int i = 0; i < ord.length+2; i++) {
				
			
			System.out.print("_ ");
			}
		}
		System.out.println(w);
		
	}
	

}
