import java.util.Scanner;
 
	public class VanyaAndFence {		
		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			int n = in.nextInt();
			int h = in.nextInt();
			int a[] = new int[n];
			int cnt = 0;
			for(int i = 0; i < n; i++) {
				a[i] = in.nextInt();
				if(a[i] <= h)
					cnt += 1;
				else
					cnt += 2;
			}
			System.out.println(cnt);
		}
	}
	