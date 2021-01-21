import java.util.Scanner;
 
	public class Reorder {		
		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			int t = in.nextInt();
			while(t-- > 0) {
				int n = in.nextInt();
				int m = in.nextInt();
				int a[] = new int[n];
				int sum = 0;
				for(int i = 0; i < n; i++) {
					a[i] = in.nextInt();
					sum += a[i];
				}
				if(sum == m)
					System.out.println("YES");
				else
					System.out.println("NO");
				sum = 0;
			}
		}
	}
	