import java.util.Scanner;
 
	public class CalculatingFunction {		
		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			long n = in.nextLong();
			long res;
			
			if(n % 2 == 0)
				res = n/2;
			else
				res = -(n+1)/2;
			System.out.println(res);
		}
	}
	