package test;

import java.util.Scanner;

public class test_class {
	public static void main(String[] args) {
		
		Scanner lol = new Scanner(System.in);
		
		        int tal1 = 89;
				int tal2 = 5;
				int tal3 = 3;
				int tal4 = 45;
				int tal5 = 9;
				int tal6 = 2;
				int tal7 = 7;
				int tal8 = 8;
				int tal9 = 1;
				int tal10 = 4;
				
				int total_value = tal1 + tal2 + tal3 + tal4 + tal5 + tal6 + tal7 + tal8 + tal9 + tal10;
				double medelvärde = total_value / 10.0;
				int högstavärde = tal1;
				int lägstatal = tal9;
				
				System.out.println("Medelvärde:" + total_value);
				System.out.println("Maxvärde:" + högstavärde);
				System.out.println("Minstavärde:" + lägstatal);
		
		
		
		
		lol.close();
	}
	
}