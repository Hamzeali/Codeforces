import java.util.Scanner;
 
	public class ShortSubstrings {		
		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			int t = in.nextInt();
			while(t-- > 0) {
				String s = in.next();
				String s1 = s.substring(0, 2);
				String s2 = s.substring(2);
				int len = s.length() - 2;
				for(int i = 0; i < len; i++) {
					if(i%2 != 0) {
						s1 = s1 + s2.charAt(i);
					}
				}
				System.out.println(s1);
			}
		}
	}