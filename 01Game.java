import java.util.Scanner;
 
	public class 01Game {
		
		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			int n = in.nextInt();
			int cnt = 0;
			int c0 = 0;
			int c1 = 0;
			String s[] = new String[n];
			for(int i = 0; i < n; i++) {
				s[i] = in.next();
			}
			for(int i = 0; i < n; i++) {
				for(int j = 0; j < s[i].length(); j++) {
					if(s[i].charAt(j) == '0')
						c0++;
					else c1++;
				}
				if(c0 != 0 && c1 != 0) {
					for(;true;) {
						c0--;
						c1--;
						cnt++;
						if(c0 == 0 || c1 == 0) break;
					}
				}
				
				if(cnt % 2 != 0)
					System.out.println("DA");
				else if(cnt % 2 == 0 || cnt == 0)
					System.out.println("NET");
				c0 = 0; c1 = 0; cnt = 0;
			}
		}
	}
	