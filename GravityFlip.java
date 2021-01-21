import java.util.Scanner;
	
	public class GravityFlip {
	
		public static void main(String[] args) {
			
			Scanner in = new Scanner(System.in);
			int n = in.nextInt();
			int a[] = new int[n];
			int res1;
			
			for(int i = 0; i < n; i++) {
				a[i] = in.nextInt();
			}
			for(int i = 0; i < n; i++) {
				for(int j = i+1; j < n; j++) {
					res1 = a[i] - a[j];
					if(res1 > 0) {
						a[i] = a[i] - res1;
						a[j] = a[j] + res1;
					}
				}
				System.out.print(a[i] + " ");
			}
		}
		
	}