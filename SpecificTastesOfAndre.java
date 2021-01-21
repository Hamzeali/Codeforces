import java.util.Scanner;
 
	public class SpecificTastesOfAndre {		
		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			int t = in.nextInt();
			while(t-- > 0) {
				int n = in.nextInt();
				for(int i = 0; i < n; i++) {
					System.out.print(n + " ");
				}
				System.out.println();
			}
		}
	}