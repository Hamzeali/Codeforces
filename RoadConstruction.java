import java.util.Scanner;
	
	public class RoadConstruction {
		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			int n = in.nextInt();
			int m = in.nextInt();
			int a[] = new int[2*m];
			int arr[] = new int[n];
			int s = 0;
			for(int i = 0; i < 2*m; i++) {
				a[i] = in.nextInt();
			}
			for(int i = 0; i < n; i++) {
				arr[i] = i+1;
			}
			int c = 0;
			for(int i = 0; i < n; i++) {
				for(int j = 0; j < 2*m; j++) {
					if(arr[i] == a[j]) 
						c++;
				}
				if(c == 0) {
					s = arr[i];
					break;
				}
				c = 0;
			}
			int l = n-1;
			System.out.println(l);
			for(int i = 1; i <= l; i++) {
				if(i == s)
					System.out.println(n + " " + s);
				else
					System.out.println(i + " " + s);
			}
		}
		
	}