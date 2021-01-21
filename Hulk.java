import java.util.Scanner;
 
	public class Hulk {		
		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			int n = in.nextInt();
			for(int i = 1; i <= n; i++) {
				if(i != n) {
					if(i % 2 != 0)
						System.out.print("I hate that ");
					else
						System.out.print("I love that ");
				}
				else {
					if(i % 2 != 0)
						System.out.print("I hate it ");
					else
						System.out.print("I love it ");
				}
			}
		}
	}
	