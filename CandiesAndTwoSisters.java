import java.util.Scanner;
 
	public class CandiesAndTwoSisters {		
		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			int t = in.nextInt();
			while(t-- > 0) {
				int n = in.nextInt();
				int result = n-(n/2)-1;
				System.out.println(result);
			}
		}
	}