package Uppgifter;

import java.util.Scanner;

public class Metoduppgifter {
	public static void main(String[] args) {
		
		volume();
		
	}



 public static double volume() {
	Scanner inp = new Scanner(System.in);
	
	double radius = inp.nextDouble();
	double volume = 0;
	volume = (4 * 3.14) * (radius * radius * radius) / 3;
	return volume;
	
}
 
}