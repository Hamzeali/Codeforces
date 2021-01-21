import java.util.Scanner;
 
public class BeautifulMatrix {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a[][] = new int [5][5];
		int cnt = 0;
		for(int i = 0; i < 5 ; i++) {
			for(int j = 0; j < 5; j++) {
				a[i][j] = in.nextInt();
			}
		}
		
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				if(a[i][j] == 1) {
					cnt = cnt + Math.abs(2 - i);
					cnt  = cnt + Math.abs(2 - j);
				}
			}
		}
		System.out.println(cnt);
	}
}