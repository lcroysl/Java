package Uppgifter;

import java.util.Scanner;

public class spavanac {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		
		int H = inp.nextInt();
		int M = inp.nextInt();
		
		
		if (M > 44) {
			M = M - 45;
		}
		else {
			H = H - 1;
			M = M + 60;
			M = M - 45;
		}
		if (H < 0){
			H = H + 24;
		}
		
		
		System.out.println(H + " " + M);
		
	}

}
