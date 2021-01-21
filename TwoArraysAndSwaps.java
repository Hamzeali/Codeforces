import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
 
	public class TwoArraysAndSwaps {		
		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			int t = in.nextInt();
			while(t-- > 0) {
				int n = in.nextInt();
				int k = in.nextInt();
				int a[] = new int[n];
				Integer b[] = new Integer[n];
				for(int i = 0; i < n; i++) {
					a[i] = in.nextInt();
				}
				for(int i = 0; i < n; i++) {
					b[i] = in.nextInt();
				}
				Arrays.sort(a);
				Arrays.sort(b, Collections.reverseOrder());
				for(int i = 0; i < k; i++) {
					if(b[i] > a[i])
						a[i] = b[i];
				}
				int sum = 0;
				for(int i = 0; i < n; i++) {
					sum += a[i];
				}
				System.out.println(sum);
			}
		}
	}