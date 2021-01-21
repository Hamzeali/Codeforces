import java.util.Scanner;
 
public class FoxAndSnake {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n  = in.nextInt();
		int m = in.nextInt();
		boolean b = true;
		char c[][] = new char[n][m];
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
					c[i][j] = '#';
					if(i % 2 != 0 && b == true) {
						c[i][j] = '.';
						c[i][m-1] = '#';
					}
					else if(i % 2 != 0 && b == false) {
						c[i][j] = '.';
						c[i][0] = '#';
					}
				System.out.print(c[i][j]);
			}
			System.out.println();
			if(i % 2 != 0)
				b = !b;
		}
	}
}