import java.util.Scanner;
 
	public class YetAnotherTwoIntegersProblem {		
		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			int t = in.nextInt();
			int count = 0;
			while(t-- > 0) {
				int a = in.nextInt();
				int b = in.nextInt();
				int res = Math.abs(a - b);
				if(res > 0) {
					for(int i = 10; i > 0; i--) {
					count += res/i;
					res = res%i;
					}
					System.out.println(count);
				}
				else
					System.out.println(0);
				count = 0;
			}
		}
	}