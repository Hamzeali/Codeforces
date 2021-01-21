import java.util.Scanner;
 
	public class NearlyLuckyNumber {		
		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			String s = in.next();
			int cnt = 0;
			for(int i = 0; i < s.length(); i++) {
				if(s.charAt(i) == '4' || s.charAt(i) == '7')
					cnt++;
			}
			String s1 = Integer.toString(cnt);
			int c = 0;
			for(int i = 0; i < s1.length(); i++) {
				if(s1.charAt(i) == '4' || s1.charAt(i) == '7')
					c++;
			}
			if(c == s1.length())
				System.out.println("YES");
			else System.out.println("NO");
		}
	}
	