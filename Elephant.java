import java.util.Scanner;
	
	public class Elephant {
		
		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			int n = in.nextInt();
			int res = n % 5;
			int res1 = n / 5;
			int a;
			if(res == 0)
				a = res1;
			else
				a = res1 + 1;
			System.out.println(a);
		}
	}