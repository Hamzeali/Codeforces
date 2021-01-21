import java.util.Arrays;
import java.util.Scanner;
 
	public class GiftsFixing {		
		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			int t = in.nextInt();
			while(t-- > 0) {
				int n = in.nextInt();
				int a[] = new int[n];
				int a1[] = new int[n];
				int b[] = new int[n];
				int b1[] = new int[n];
				long ans = 0;
				for(int i = 0; i < n; i++) {
					a[i] = in.nextInt();
					a1[i] = a[i];
				}
				for(int i = 0; i < n; i++) {
					b[i] = in.nextInt();
					b1[i] = b[i];
				}
				Arrays.sort(a1);
				Arrays.sort(b1);
				long mina = a1[0];
				long minb = b1[0];
				long x = 0;
				long y = 0;
				for(int i = 0; i < n; i++) {
					x = a[i] - mina;
					y = b[i] - minb;
					ans += Math.max(x, y);
				}
				System.out.println(ans);
			}
		}
	}