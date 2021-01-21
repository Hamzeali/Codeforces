import java.util.Scanner;
 
 
public class StringTask {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String s = input.next();
		String x = s.toLowerCase();
		
		x = x.replace("a", "");
		x = x.replace("o", "");
		x = x.replace("y", "");
		x = x.replace("e", "");
		x = x.replace("u", "");
		x = x.replace("i", "");
		
		for(int i = 0; i < x.length(); i++){
		
		System.out.print("."+x.charAt(i));
		}
	}
}