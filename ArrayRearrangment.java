import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
 
	public class ArrayRearrangment {		
		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			int t = in.nextInt();
			int sum = 0;
			int count = 0;
			while(t-- > 0) {
				int n = in.nextInt();
				int x = in.nextInt();
				Integer a[] = new Integer[n];
				int b[] = new int[n];
				for(int i = 0; i < n; i++) {
					a[i] = in.nextInt();
				}
				for(int i = 0; i < n; i++) {
					b[i] = in.nextInt();
				}
				Arrays.sort(a, Collections.reverseOrder());
				for(int i = 0; i < n; i++) {
					sum = a[i] + b[i];
					if(sum > x) break;
					count++;
				}
				if(count == n)
					System.out.println("YES");
				else
					System.out.println("NO");
				sum = 0;
				count = 0;
			}
		}
	}