import java.util.Scanner;
 
	public class VasyaTheHipster {		
		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			int a = in.nextInt();
			int b = in.nextInt();
			int x, y;
			x = Math.min(a, b);
			y = Math.abs((a-b)/2);
			System.out.println(x + " " + y);
		}
	}