import java.util.Arrays;
import java.util.Scanner;
 
	public class BalancedArray {		
		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			int t = in.nextInt();
			int sum1 = 0;
			int sum2 = 0;
			while(t-- > 0) {
				int n = in.nextInt();
				for(int i = 1; i <= n; i++) {
					if(i % 2 == 0)
						sum1 += i;
				}
				for(int i = 1; i <= n-2; i++) {
					if(i % 2 != 0) 
						sum2 += i;
				}
				if((sum1-sum2) % 2 != 0) {
					System.out.println("YES");
					for(int i = 1; i <= n; i++) {
						if(i % 2 == 0)
							System.out.print(i + " ");
					}
					for(int i = 1; i <= n-2; i++) {
						if(i % 2 != 0)
							System.out.print(i + " ");
					}
					System.out.println(sum1 - sum2);
				}
				else System.out.println("NO");
				sum1 = 0;
				sum2 = 0;
			}
		}
	}