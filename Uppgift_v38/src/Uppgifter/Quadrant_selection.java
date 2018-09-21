package Uppgifter;

import java.util.Scanner;

public class Quadrant_selection {
	public static void main(String[] args) {
		
		Scanner inp = new Scanner(System.in);
		
		int x = inp.nextInt();
		int y = inp.nextInt();
		
		if(x > 0 && y > 0) {
			System.out.println("Quadrant 1");
		}
		if(x < 0 && y > 0) {
			System.out.println("Quadrant 2");
		}
		if(x < 0 && y < 0) {
			System.out.println("Quadrant 3");
		}
		if(x > 0 && y < 0) {
			System.out.println("Quadrant 4");
		}
	}

}
