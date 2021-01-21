import java.util.Scanner;
 
	public class PrimeSquare {		
		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			int t = in.nextInt();
			while(t-- > 0) {
				int n = in.nextInt();
				int a[][] = new int[n][n];
				for(int i = 0; i < n; i++) {
					for(int j = 0; j < n; j++) {
						if(i == j)
							a[i][j] = 1;
						else a[i][j] = 0;
					}
				}
				for(int i = 0; i < n; i++) {
					for(int j = n-1; j >= 0; j--) {
						if(i+j == n-1)
							a[i][j] = 1;
					}
				}
				if(n % 2 != 0) {
					int x = (n/2)-1;
					int y = ((n+1)/2)-1;
					a[x][y] = 1;
					a[y][y+1] = 1;
				}
				for(int i = 0; i < n; i++) {
					for(int j = 0; j < n; j++) {
						System.out.print(a[i][j] + " ");
					}
					System.out.println();
				}
			}
		}
	}