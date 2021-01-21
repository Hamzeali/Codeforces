import java.util.Arrays;
import java.util.Scanner;
	
	public class InterestingDrink {
		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			int n = in.nextInt();
			int arr[] = new int[n];
			for(int i = 0; i < n; i++) {
				arr[i] = in.nextInt();
			}
			Arrays.sort(arr);
			int q = in.nextInt();
			int mo = 0;
			while(q > 0) {
				mo = in.nextInt();
				int f = 0;
				int l = n - 1;
				int mi = (f + l) / 2;
				while(f <= l) {
					if(mo < arr[mi])
						l = mi - 1;
					else
						f = mi + 1;
					mi = (f + l) / 2;
				}
				System.out.println(l+1);
				q--;
			}
		}
		
	}