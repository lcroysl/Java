package test;

import java.util.Scanner;

public class Kattis_r2 {
	public static void main(String[] args) {
		
		Scanner inp = new Scanner(System.in);
		
		
		int r1 = inp.nextInt();
		int S = inp.nextInt();
		int r2 = (-r1 + S*2);
		System.out.println(r2);
	}
	

}
