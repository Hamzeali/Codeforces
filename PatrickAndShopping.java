import java.util.Scanner;
	
	public class PatrickAndShopping {
		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			int d1 = in.nextInt();
			int d2 = in.nextInt();
			int d3 = in.nextInt();
			int case1 = (2*d1) + (2*d2);
			int case2 = d1 + d3 + d2;
			int case3 = (2*d1) + (2*d3);
			int case4 = (2*d2) + (2*d3);
			int min1 = Math.min(case1, case2);
			int min2 = Math.min(case3, case4);
			int result = Math.min(min1, min2);
			
			System.out.println(result);
			
			
		}
		
	}