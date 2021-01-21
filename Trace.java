import java.util.Arrays;
import java.util.Scanner;
	
	public class Trace {
		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			int n = in.nextInt();
			int a[] = new int[n];
			double res1 = 0;
			double res2 = 0;
			double result;
			for(int i = 0; i < n; i++) {
				a[i] = in.nextInt();
			}
			Arrays.sort(a);// 1 2 3 4
			if(n % 2 != 0) {
				for(int i = n-1; i >= 0; i -= 2) {
					res1 = res1 +  Math.PI * a[i]*a[i];
				}
				for(int i = n-2; i > 0; i -= 2) {
					res2 = res2 + Math.PI * a[i]*a[i];
				}
			}
			else {
				for(int i = n-1; i > 0; i -= 2) {
					res1 = res1 +  Math.PI * a[i]*a[i];
				}
				for(int i = n-2; i >= 0; i -= 2) {
					res2 = res2 + Math.PI * a[i]*a[i];
				}
			}
			result = res1 - res2;
			System.out.println(result);
		}
		
	}