package Uppgifter;

import java.util.Scanner;

public class FizzBuzz {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		
		int fizz = inp.nextInt();
		int buzz = inp.nextInt();
		int antal = inp.nextInt();
		int fizzbuzz = (fizz * buzz);

		
		for (int i = 1; i <= antal; i++  ) {
			
			if (i % fizz == 0) {
				System.out.println("Fizz");
			}
			if (i % buzz == 0) {
				System.out.println("Buzz");
				if (6 % buzz == 0) {
					System.out.println(" ");
				}
			}
			if (i % fizzbuzz == 0) {
				System.out.println("Fizzbuzz");
			}
			
			System.out.println(i);
			
	        }
	}
}
