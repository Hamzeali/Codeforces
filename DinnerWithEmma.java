	import java.util.Scanner;
	
	public class DinnerWithEmma {
		
		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			int n = in.nextInt();
			int m = in.nextInt();
			int a[] = new int[m];
			int arr[] = new int[n];
			int min = 0;
			int max = 0;
			for(int i = 0; i < n; i++) {
				for(int j = 0; j < m; j++) {
					a[j] = in.nextInt();
				}
				min = a[0];
				for(int j = 0; j < m - 1; j++) {
					if(a[j+1] < min)
						min = a[j+1];
				}
				arr[i] = min;	
			}
			max = arr[0];
			for(int l = 0; l < n-1; l++) {
				if(arr[l+1] > max)
					max = arr[l+1];
			}
			System.out.println(max);
		}
	}