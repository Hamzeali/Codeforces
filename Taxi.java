import java.util.Scanner;
 
public class Taxi {
		
	public static void main(String[] args) {
		 
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int a[] = new int[n];
		int cnt = 0;
		int c3 = 0;
		int c1 = 0;
		int c2 = 0;
		int c4 = 0;
		for(int i = 0; i < n; i++) {
			a[i] = in.nextInt();
		}
		for(int i = 0; i < n; i++) {
			if(a[i] == 4) {
				cnt++;
				c4++;
			}
			if(a[i] == 3)
				c3++;
			if(a[i] == 1)
				c1++;
			if(a[i] == 2)
				c2++;
		}
		
		if(c2 == 1 && c1 == 0 && c3 == 0 && c4 == 0 || c1 == 1 && c2 == 0 && c3 == 0 && c4 == 0 ||
				c3 == 1 && c1 == 0 && c2 == 0 && c4 == 0)
			cnt = 1;
		else {
			if(c3 >= 1) {
				int res1 = c3 - c1;
				if(res1 >= 0) {
					cnt = cnt + c3;
					c1 = 0;
				}
				else if(res1 < 0) {
					cnt = cnt + c3;
					c1 = c1 - c3;
				}
			}
		
			if((c2*2) % 4 == 0 && c2 > 0) {
					cnt = cnt + ((c2*2)/4);
					c2 = 0;
			}
			
			if((c2*2) % 4 != 0 && c2 > 0) {
				double c22 = Math.ceil((c2*2)/4);
				cnt = cnt + (int) c22 + 1;
				c2 = 1;
				if((c2*2) <= (c1/2) || c2 == c1 || (c2*2) <= c1) {
					c1 = c1 - (c2*2);
				}
			}
			
			if(c1 % 4 == 0 && c1 > 0) {
				cnt = cnt + (c1 / 4);
				c1 = 0;
			}
			
			if(c1 % 4 != 0 && c1 > 0) {
				double c11 = Math.ceil(c1/4);
				cnt = cnt + (int) c11 + 1;
				
			}
		}
		
		System.out.println(cnt);
		
	}
}