import java.util.Scanner;
 
public class WordCapitalization {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		char c = s.charAt(0);
		if(c >= 97) {
			c -= 32;
		}
		System.out.println(c + s.substring(1, s.length()));
	}
}