import java.util.Scanner;
	
	public class HighSchoolBecomeHuman {
		
		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			long x = in.nextLong();
			long y = in.nextLong();
			if(y * Math.log(x) > x * Math.log(y))
				System.out.println(">");
			else if(y * Math.log(x) < x * Math.log(y))
				System.out.println("<");
			else
				System.out.println("=");
		}
	}