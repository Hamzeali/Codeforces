import java.util.Scanner;
 
	public class ParkLighting {		
		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			int t = in.nextInt();
			while(t-- > 0) {
				int n = in.nextInt();
				int m = in.nextInt();
				int sec = n * m;
				int ans;
				if(sec % 2 == 0)
					ans = sec/2;
				else
					ans = (sec/2) + 1;
				System.out.println(ans);
			}
		}
	}