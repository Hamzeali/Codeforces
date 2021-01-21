import java.util.Scanner;
 
	public class UltraFastMathematician {		
		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			String s1 = in.next();
			String s2 = in.next();
			for(int i = 0; i < s1.length(); i++) {
				int a = Character.getNumericValue(s1.charAt(i));
				int b = Character.getNumericValue(s2.charAt(i));
				System.out.print(a^b);
			}
		}
	}
	