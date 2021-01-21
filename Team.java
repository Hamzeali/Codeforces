import java.util.Scanner;
 
public class Team {
		
	public static void main(String[] args) {
		 
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		int cnt = 0;
		int a, b, c;
		for(int i = 0; i < x; i++) {
			a = in.nextInt();
			b = in.nextInt();
			c = in.nextInt();
			if(a + b + c >= 2)
				cnt++;
		}
		System.out.println(cnt);
	}
}