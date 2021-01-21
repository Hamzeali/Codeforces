import java.util.Scanner;
 
public class NextRound {
		
	public static void main(String[] args) {
		 
		Scanner in = new Scanner(System.in);
		int n, k;
		n = in.nextInt();
		k = in.nextInt();
		int cnt = 0;
		int l = 0;
		int a[] = new int[n];
		for(int i = 0; i < n; i++) {
			a[i] = in.nextInt();
		}
		for(int i = 0; i < n; i++) {
			if(a[i] >= a[k-1] && a[i] > 0)
				cnt++;
		}
		for(int i = 0; i < n; i++) {
			if(a[i] == 0) {
				l++;
			}
		}
		if(l == n)
			System.out.println(0);
		else
			System.out.println(cnt);
	}
}