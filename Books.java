import java.util.Scanner;
	
	public class Books {
		
		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			int n = in.nextInt();
			int t = in.nextInt();
			int counter = 0;
			int a[] = new int[n];
			for(int i = 0; i < n; i++) {
				a[i] = in.nextInt();
			}
			int sum = 0; int x = 0;
			for(int i = 0; i < n; i++) {
				sum = sum + a[i];
				if(sum <= t)
					counter++;
				else {
					sum = sum - a[x];
					x++;
				}
			}
			System.out.println(counter);
			
		}
	}