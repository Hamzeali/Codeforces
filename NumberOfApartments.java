import java.util.Scanner;
	
	public class NumberOfApartments {
		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			int t = in.nextInt();
			int a = 0;
			int b = 0;
			int c = 0;
			for(int i = 0; i < t; i++) {
				int n = in.nextInt();
				int x = n;
					for(;true;) {
					if(n % 3 == 0) {
						a = (n/3) + a;
						break;
					}
					else if(n % 5 == 0) {
						b = (n/5) + b;
						break;
					}
					else if(n % 7 == 0) {
						c = (n/7) + c;
						break;
					}
					if(((n-3) % 5) == 0 || ((n-3) % 7) == 0) {
						a++; n -= 3;}
					else if(((n-5) % 3) == 0 || ((n-5) % 7) == 0) {
						b++; n -= 5;}
					else if(((n-7) % 3) == 0 || ((n-7) % 5) == 0) {
						c++; n -= 7;}
				}
					if(a < 0 || b < 0 || c < 0)
						System.out.println(-1);
					else
						System.out.println(a + " " + b + " " + c);
					a = 0; b = 0; c = 0; n = x;
			}
		}
	}