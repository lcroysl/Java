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
				double medelv�rde = total_value / 10.0;
				int h�gstav�rde = tal1;
				int l�gstatal = tal9;
				
				System.out.println("Medelv�rde:" + total_value);
				System.out.println("Maxv�rde:" + h�gstav�rde);
				System.out.println("Minstav�rde:" + l�gstatal);
		
		
		
		
		lol.close();
	}
	
}