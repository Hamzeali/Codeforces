import java.util.Scanner;
 
public class StonesOnTheTable {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String s = in.next();
		int cnt = 0;
		if(s.length() == n) {
		for(int i = 0; i < s.length()-1; i++) {
			if(s.charAt(i) == s.charAt(i+1))
				cnt++;
		}
		System.out.println(cnt);
		}
	}
}