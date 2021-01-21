import java.util.Arrays;
import java.util.Scanner;
 
	public class I_LoveUsername {		
		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			int n = in.nextInt();
			int a[] = new int[n];
			int b[] = new int[n];
			int count = 0;
			int big = 0;
			int small = 0;
			for(int i = 0; i < n; i++) {
				a[i] = in.nextInt();
				b[i] = a[i];
			}
			for(int i = 1; i < n; i++) {
				for(int j = 0; j < i; j++) {
					if(a[i] > b[j]) 
						big++;
					else if(a[i] < b[j])
						small++;
				}
				if(big == i || small == i) 
					count++;
				big = 0;
				small = 0;
			}
			System.out.println(count);
		}
	}