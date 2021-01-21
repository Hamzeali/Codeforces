import java.util.Scanner;
 
	public class BoringApartments {		
		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			int t = in.nextInt();
			int b = 0;
			for(int i = 0; i < t; i++) {
				int x = in.nextInt();
				String s = Integer.toString(x);
				int n = s.length();
				char c = s.charAt(0);
				int d = Character.getNumericValue(c);
				for(int j = 1; j <= n; j++) {
					b = b + j;
				}
				b = b + 10 * (d - 1);
				System.out.println(b);
				b = 0;
			}
		}
	}
	