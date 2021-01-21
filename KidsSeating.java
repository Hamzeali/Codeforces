import java.util.Scanner;
 
	public class KidsSeating {		
		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			int t = in.nextInt();
			int count = 0;
			while(t-- > 0) {
				int n = in.nextInt();
				int a = 4*n;
				int b = a - 2;
				for(int i = b; true; i-=2) {
					System.out.print(i + " ");
					count++;
					if(count == n) break;
				}
				System.out.println();
				count = 0;
			}
		}
	}