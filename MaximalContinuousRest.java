import java.util.Arrays;
import java.util.Scanner;
	
	public class MaximalContinuousRest {
		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			int n = in.nextInt();
			int a[] = new int[n];
			int cnt = 0;
			for(int i = 0; i < n; i++) {
				a[i] = in.nextInt();
			}
			for(int i = 0; i < n; i++) {
				if(a[i] == 0)
					break;
				else 
					cnt++;
			}
			int arr[] = new int[cnt];
			for(int i = 0; i < cnt; i++) {
				arr[i] = a[i];
			}
			int res = 0;
			int fa[] = new int[a.length + arr.length];
			int r[] = new int[fa.length];
			System.arraycopy(a, 0, fa, 0, a.length);
			System.arraycopy(arr, 0, fa, a.length, arr.length);
			for(int i = 0; i < fa.length; i++) {
				if(fa[i] == 1)
					res++;
				else res = 0;
				r[i] = res;
			}
			Arrays.sort(r);
			int final_Result = r[r.length - 1];
			System.out.println(final_Result);
		}
		
	}