import java.util.Scanner;
	public class MakeProductEqualOne {
		
		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			int n = in.nextInt();
			int a[] = new int[n];
			long cnt = 0;
			for(int i = 0; i < n; i++) {
				a[i] = in.nextInt();
				if(a[i] > 0) {
					cnt = cnt + (a[i] - 1);
					a[i] = a[i] - (a[i] - 1);
				}
				
				else if(a[i] < 0){
					cnt = cnt + (Math.abs(a[i]) - 1);
					a[i] = a[i] + (Math.abs(a[i]) - 1);
				}
			}
			int pos = 0;
			int neg = 0;
			int zero = 0;
			for(int i = 0; i < n; i++) {
				if(a[i] < 0) {
					neg++;
				}
				else if(a[i] > 0) {
					pos++;
				}
				else zero++;
			}
			if(neg % 2 != 0 && zero == 0) {
				for(int i = 0; i < n; i++) {
					if(a[i] == -1) {
						a[i] += 2; cnt += 2; break;
					}
				}
			}
			else if(neg % 2 != 0 && zero > 0) {
				for(int i = 0; i < n; i++) {
					if(a[i] == 0) {a[i]--; cnt++; break;}
				}
			}
			for(int i = 0; i < n; i++) {
				if(a[i] == 0) {a[i]++; cnt++;}
			}
			System.out.println(cnt);
		}
	}