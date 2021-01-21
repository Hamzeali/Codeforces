import java.util.Scanner;
 
	public class DivisibilityProblem {		
		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			int t = in.nextInt();
			while(t-- > 0) {
				int a = in.nextInt();
				int b = in.nextInt();
				int result = 0;
				if(a % b != 0)
					result = b - (a%b);
				System.out.println(result);
			}
		}
	}