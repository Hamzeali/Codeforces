import java.util.Scanner;
	public class VotingForPhotos {
		
		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			int n = in.nextInt();
			int a[] = new int[1000001];
			int max = 0;
			int res = 0;
			for(int i = 0; i < n; i++) {
				int b = in.nextInt();
				a[b] += 1;
				if(a[b] > max) {
					max = a[b];
					res = b;
				}
			}
			System.out.println(res);
		}
	}
	