package test;

import java.util.Scanner;

public class test_class {
	public static void main(String[] args) {
		
		Scanner lol = new Scanner(System.in);
		
		System.out.println("Skriv in 10 tal");
		
		        int tal1 = lol.nextInt();
				double max = tal1;
				double min = tal1;
		        
				int tal2 = lol.nextInt();
		        if (tal2 > max) { max = tal2;
		        		
		        }
		        if (tal2 <min) { min = tal2;
		        		
		        }
				
		        int tal3 = lol.nextInt();
		        if (tal3 > max) {max = tal3;
		        		
		        }
		        if (tal3 < min) {min = tal3;
		        		
		        }
				int tal4 = lol.nextInt();
				if (tal4 > max) {max = tal4;
        		
		        }
		        if (tal4 < min) {min = tal4;
		        		
		        }
				int tal5 = lol.nextInt();
				if (tal5 > max) {max = tal5;
        		
		        }
		        if (tal5 < min) {min = tal5;
		        		
		        }
				int tal6 = lol.nextInt();
				if (tal6 > max) {max = tal6;
        		
		        }
		        if (tal6 < min) {min = tal6;
		        		
		        }
				int tal7 = lol.nextInt();
				if (tal7 > max) {max = tal7;
        		
		        }
		        if (tal7 < min) {min = tal7;
		        		
		        }
				int tal8 = lol.nextInt();
				if (tal8 > max) {max = tal8;
        		
		        }
		        if (tal8 < min) {min = tal8;
		        		
		        }
				int tal9 = lol.nextInt();
				if (tal9 > max) {max = tal9;
        		
		        }
		        if (tal9 < min) {min = tal9;
		        	
		        }
				int tal10 = lol.nextInt();
				if (tal10 > max) {max = tal10;
        		
		        }
		        if (tal10 < min) {min = tal10;
		        		
		        }
				
				double total_value = tal1 + tal2 + tal3 + tal4 + tal5 + tal6 + tal7 + tal8 + tal9 + tal10;
				double medelvärde = total_value / 10.0;
				double högstavärde = max;
				double lägstatal = min;
				
				System.out.println("Info om dina tal:");
				System.out.println("Medelvärde:" + medelvärde);
				System.out.println("Maxvärde:" + högstavärde);
				System.out.println("Minstavärde:" + lägstatal);
		
		
		
		
		lol.close();
	}
	
}