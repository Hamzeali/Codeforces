import java.util.Arrays;
import java.util.Scanner;
 
	public class YetAnotherBookshelf {		
		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			int t = in.nextInt();
			int cnt = 0;
			int c = 0;
			int b = 0;
			for(int i = 0; i < t; i++) {
				int n = in.nextInt();
				int a[] = new int[n];
				for(int j = 0; j < n; j++) {
					a[j] = in.nextInt();
				}
				String s = Arrays.toString(a);
				for(int j = 0; j < s.length(); j++) {
					if(s.charAt(j) == '1') {
						b = j;
						break;
					}
				}
				for(int j = s.length()-1; j >= 0; j--) {
					if(s.charAt(j) == '1') {
						c = j;
						break;
					}
				}
				s = s.substring(b, c);
				for(int j = 0; j < s.length(); j++) {
					if(s.charAt(j) == '0')
						cnt++;
				}
				System.out.println(cnt);
				c = 0;
				b = 0;
				cnt = 0;
			}
		}
	}
	
