import java.util.Scanner;
	
	public class BeautifulYear {
		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			int n = in.nextInt();
			int a, b, c, d;
			for(int i = n+1; true; i++) {
				int x = i;
				a = x % 10;
				x = x / 10;
				b = x % 10;
				x = x / 10;
				c = x % 10;
				x = x / 10;
				d = x % 10;
				if(a != b && a != c && a != d && b != c && b != d && c != d) {
					System.out.println(i);
					break;
				}
			}
			
		}
		
	}