package Uppgifter;

import java.util.Scanner;

public class Metoduppgifter3 {
	public static void main(String[] args) {
		
		count();
		
		
	}
public static int count() {
	
	Scanner inp = new Scanner(System.in);
	String str = inp.nextLine();
	char c = inp.next().charAt(0);
	int something = 0;
	
	for (int i = 0; i <= str.length() - 1; i++) {
		if(str.charAt(i) == c) {
			something++;
		}
		
	}
	return something;
		
	
}
}
