import java.util.Scanner;
 
	public class GeorgeAndAccommodation {		
		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			int n = in.nextInt();
			int cnt = 0;
			for(int i = 0; i < n; i++) {
				int p = in.nextInt();
				int q = in.nextInt();
				int res = q-p;
				if(res >= 2)
					cnt++;
			}
			System.out.println(cnt);
		}
	}