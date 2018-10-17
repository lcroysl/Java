package Uppgifter;
import java.util.Scanner;
public class Metoduppgifter4 {
	

	
		public static void main(String[] args) {
			sjorovare();

			
	}
		public static String sjorovare() {
			Scanner inp = new Scanner(System.in);
			String ny = "";
			String str = inp.nextLine();
			for (int i = 0; i < str.length() ; i++) {
				char c = str.charAt(i);
				if(c == 'b' || c == 'd' || c == 's' || c == 'q' || c == 'w' || c == 'r' || c == 't'|| c == 'p' || c == 'f' || c == 'g' || c == 'h' || c == 'j' || c == 'k' || c == 'l' || c == 'v' || c == 'b' || c == 'n' || c == 'm' || c == 'z') {
					ny += c + "o" + c ;
				}
				else if(c == 'x') {
					ny += "koksos";
				}
				else if(c == 'c') {
					ny += "kok";
				}
				else {
					ny += c;
				}
				
			}
	return ny;
		}
	
}
