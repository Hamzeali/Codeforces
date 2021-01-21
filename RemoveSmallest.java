import java.util.Arrays;
import java.util.Scanner;
 
	public class RemoveSmallest {		
		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			int t = in.nextInt();
			int count = 0;
			while(t-- > 0) {
				int n = in.nextInt();
				int a[] = new int[n];
				for(int i = 0; i < n; i++) {
					a[i] = in.nextInt();
				}
				Arrays.sort(a);
				if(n == 1)
					System.out.println("YES");
				else {
					int b[] = new int[n];
					b[0] = Math.abs(a[1] - a[0]);
					for(int i = 1; i < n; i++) {
						b[i] = Math.abs(a[i] - a[i-1]);
					}
					for(int i = 0; i < n; i++) {
						if(b[i] <= 1)
							count++;
					}
					if(count == n)
						System.out.println("YES");
					else
						System.out.println("NO");
					count = 0;
				}
			}
		}
	}