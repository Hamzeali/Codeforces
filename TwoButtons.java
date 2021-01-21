import java.util.Scanner;

	public class TwoButtons {
		
		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			int n = in.nextInt();
			int m = in.nextInt();
			int res = 0;
			if(n == m)
				res = 0;
			else {
				while(m > n) {
					if(m % 2 == 0) {
						m = m / 2;
						res++;
					}
					else {m++; res++;}
				}
			}
			if(n > m) res = res + (n - m);
			System.out.println(res);
		}
	}
	