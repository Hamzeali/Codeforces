import java.util.Scanner;
 
	public class I_WannaBeTheGuy {		
		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			int n = in.nextInt();
			int p = in.nextInt();
			int a[] = new int[p];
			int cnt = 0;
			for(int i = 0; i < p; i++) {
				a[i] = in.nextInt();
			}
			int q = in.nextInt();
			int b[] = new int[q];
			for(int i = 0; i < q; i++) {
				b[i] = in.nextInt();
			}
			int[] arr = new int[a.length + b.length];
			System.arraycopy(a, 0, arr, 0, a.length);
			System.arraycopy(b, 0, arr, a.length, b.length);
			for(int i = 1; i <= n; i++) {
				for(int j = 0; j < arr.length; j++) {
					if(arr[j] == i) {
						cnt++; break;
					}
				}
			}
			if(cnt == n)
				System.out.println("I become the guy.");
			else
				System.out.println("Oh, my keyboard!");
		}
	}