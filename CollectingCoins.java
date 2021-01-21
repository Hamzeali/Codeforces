import java.util.Arrays;
import java.util.Scanner;
 
	public class CollectingCoins {		
		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			int t = in.nextInt();
			while(t-- > 0) {
				int a[] = new int[3];
				for(int i = 0; i < a.length; i++) {
					a[i] = in.nextInt();
				}
				int n = in.nextInt();
				Arrays.sort(a);
				int max = a[a.length-1];
				int num = max - a[0];
				int num2 = num + (max - a[1]);
				n = n - num2;
				System.out.println((n % 3 == 0 && n >= 0)? "YES" : "NO");
			}
		}
	}