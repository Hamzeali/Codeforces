import java.util.Scanner;
 
	public class Magnets {		
		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			int n = in.nextInt();
			int cnt = 1;
			String s[] = new String[n];
			for(int i = 0; i < n; i++) {
				s[i] = in.next();
			}
			for(int i = 0; i < n-1; i++) {
				if(!s[i].equals(s[i+1]))
					cnt++;
			}
			System.out.println(cnt);
		}
	}
	