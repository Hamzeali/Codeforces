import java.util.Scanner;
	
	public class Games {
		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			int n = in.nextInt();
			int a[] = new int[n];
			int b[] = new int[n];
			int count = 0;
			int c = 0;
			for(int i = 0, j = 0; true;) {
				if(c % 2 == 0) {
					a[i] = in.nextInt();
					i++;
				}
				else {
					b[j] = in.nextInt();
					j++;
				}
				c++;
				if(c == n*2)break;
			}
			for(int i = 0; i < n; i++) {
				for(int j = 0; j < n; j++) {
					if(a[i] == b[j])
						count++;
				}
			}
			System.out.println(count);
		}
	}