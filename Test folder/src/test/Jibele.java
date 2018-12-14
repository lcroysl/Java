package test;

import java.util.Scanner;

public class Jibele {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		
		int king = inp.nextInt();
		int queen = inp.nextInt();
		int rook = inp.nextInt();
		int bishop = inp.nextInt();
		int knight = inp.nextInt();
		int pawn = inp.nextInt();
		
		if(king == 1) {
			king = 0;
		}
		else if(king > 1) {
			king = king +1 - (king*2);
		}
		else if(king == 0) {
			king = king +1;
		}
		
		if(queen == 1) {
			queen = 0;
		}
		else if(queen > 1) {
			queen = queen +1 - (queen*2);
		}
		else if(queen == 0) {
			queen = queen +1;
		}
		
		if(rook == 2) {
			rook = 0;
		}
		else if(rook > 2) {
			rook = rook +2 - (rook*2);
		}
		else if(rook == 1) {
			rook = rook +0;
		}
		else {
			rook = rook +2;
		}
		
		if(bishop == 2) {
			bishop = 0;
		}
		else if(bishop > 2) {
			bishop = bishop +2 - (bishop*2);
		}
		else if(bishop == 1) {
			bishop = bishop +0;
		}

		else {
			bishop = bishop +2;
		}
		
		if(knight == 2) {
			knight = 0;
		}
		else if(knight > 2) {
			knight = knight +2 - (knight*2);
		}
		else if(knight == 1) {
			knight = knight +0;
		}
		else {
			knight = knight +2;
		}
		
		if(pawn == 8) {
			pawn = 0;
		}
		else if(pawn > 8) {
			pawn = pawn +8 - (pawn*2);
		}
		else if(pawn < 8){
			pawn = pawn +8 - (pawn*2);
		}
		else {
			pawn = pawn +8;
		}
		System.out.println(king + " " + queen + " " + rook + " " + bishop + " " + knight + " " + pawn);
	}

}
