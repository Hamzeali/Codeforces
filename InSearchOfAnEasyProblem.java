import java.util.Scanner;
 
	public class InSearchOfAnEasyProblem {		
		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			int n = in.nextInt();
			int a[] = new int[n];
			int cnt = 0;
			for(int i = 0; i < n; i++) {
				a[i] = in.nextInt();
				if(a[i] == 1) cnt++;
			}
			if(cnt > 0) System.out.println("HARD");
			else System.out.println("EASY");
		}
	}
	