import java.util.Scanner;
	
	public class LuckyDivision {
	
		public static void main(String[] args) {
			
			Scanner in = new Scanner(System.in);
			int n = in.nextInt();
			int cnt = 0;
			int cnt1 = 0;
			int cnt2 = 0;
			for(int i = 0; i < n; i++) {
				String s = Integer.toString(i);
				for(int j = 0; j < s.length(); j++) {
					if(s.charAt(j) == '4' || s.charAt(j) == '7') 
						cnt++;
					}
					if(cnt == s.length()) {
						if(n % i == 0)
						cnt1++;
					}
					cnt = 0;
			}
			String s1 = Integer.toString(n);
			for(int i = 0; i < s1.length(); i++) {
				if(s1.charAt(i) == '4' || s1.charAt(i) == '7')
					cnt2++;
			}
			if(cnt1 > 0 || cnt2 == s1.length())
				System.out.println("YES");
			else
				System.out.println("NO");
		}
		
	}