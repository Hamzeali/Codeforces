import java.util.Scanner;
 
	public class NewYearAndHurry {		
		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			int n = in.nextInt();
			int k = in.nextInt();
			int time = 240 - k;
			int a = 0;
			int count = 0;
			for(int i = 1; i <= n; i++) {
				a += (5*i);
				count++;
				if(a > time) {count--; break;}
			}
			System.out.println(count);
		}
	}