import java.util.Scanner;
 
	public class Square {		
		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			int t = in.nextInt();
			while(t-- > 0) {
				int a1 = in.nextInt();
				int b1 = in.nextInt();
				int a2 = in.nextInt();
				int b2 = in.nextInt();
				if((a1+a2) == b1) {
					if(b1 == b2)
						System.out.println("YES");
					else System.out.println("NO");
				}
				else if((a1+b2) == b1) {
					if(a2 == b1)
						System.out.println("YES");
					else System.out.println("NO");
				}
				else if((b1+a2) == a1) {
					if(b2 == a1)
						System.out.println("YES");
					else System.out.println("NO");
				}
				else if((b1+b2) == a1) {
					if(a2 == a1)
						System.out.println("YES");
					else System.out.println("NO");
				}
				else
					System.out.println("NO");
			}
		}
	}
	