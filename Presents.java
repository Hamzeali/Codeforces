import java.util.Scanner;
 
	public class Presents {		
		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			int n = in.nextInt();
			int a[] = new int[n];
			int b[] = new int[n];
			for(int i = 0; i < n; i++) {
				a[i] = in.nextInt();
			}
			for(int i = 0; i < n; i++) {
				for(int j = 0; j < n; j++) {
					if(a[j] == (i+1)) b[i] = j+1;
				}
			}
			for(int i = 0; i < n; i++) {
				System.out.print(b[i] + " ");
			}
		}
	}
	