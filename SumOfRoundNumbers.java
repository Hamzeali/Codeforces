import java.util.ArrayList;
import java.util.Scanner;
 
	public class SumOfRoundNumbers {		
		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			int t = in.nextInt();
			int count = 0;
			while(t-- > 0) {
				int n = in.nextInt();
				String s = Integer.toString(n);
				for(int i = 0; i < s.length(); i++) {
					if(s.charAt(i) != '0') {
						count++;
					}
				}
				System.out.println(count);
				int a = s.length() - 1;
				for(int i = 0; i < s.length(); i++) {
					if(s.charAt(i) != '0')
					System.out.print(Character.getNumericValue(s.charAt(i)) * (int) Math.pow(10, a) + " ");
					a--;
				}
				System.out.println();
				count = 0;
			}
		}
	}