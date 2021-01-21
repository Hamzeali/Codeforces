import java.util.Scanner;
	
	public class BookReading {
		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			int q = in.nextInt();
			long k;
			long mod;
			long ans;
			long ans1 = 0;
			long ans2 = 0;
			for(int i = 0; i < q; i++) {
				long n = in.nextLong();
				long m = in.nextLong();
				k = n / m;
				mod = k % 10;
				for(int j = 0; j < 10; j++) {
					ans1 = ans1 + m * (j+1) % 10;
				}
				ans1 = ans1 * (k/10);
				for(int j = 0; j < mod; j++) {
					ans2 = ans2 + m * (j+1) % 10;
				}
				ans = ans1 + ans2;
				System.out.println(ans);
				ans1 = 0;
				ans2 = 0;
				ans = 0;
			}
			
		}
		
	}