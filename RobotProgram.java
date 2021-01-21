import java.util.Scanner;
 
	public class RobotProgram {		
		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			int t = in.nextInt();
			while(t-- > 0) {
				int x = in.nextInt();
				int y = in.nextInt();
				int ans;
				if(x == y)
					ans = x+y;
				else
					ans = (2 * Math.max(x, y)) - 1;
				System.out.println(ans);
			}
		}
	}