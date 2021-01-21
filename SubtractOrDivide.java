import java.util.Scanner;
 
	public class SubtractOrDivide {		
		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			int t = in.nextInt();
			while(t-- > 0) {
				int n = in.nextInt();
				int ans = 0;
				if(n == 2) ans = 1;
				else if(n == 1) ans = 0;
				else if(n == 3) ans = 2;
				else {
					if(n % 2 == 0) ans = 2;
					else if(n % 3 == 0) ans = 3;
					else ans = 3;
				}
				System.out.println(ans);
			}
		}
	}