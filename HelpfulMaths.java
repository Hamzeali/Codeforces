import java.util.Scanner;
 
public class HelpfulMaths {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		String s1 = s.replace("+", "");
		String sf = null;
		int min;
		char a[] = new char[s1.length()];
		int x[] = new int[a.length];
		for(int i = 0; i < s1.length(); i++) {
			a[i] = s1.charAt(i);
		}
		for(int i = 0; i < a.length; i++) {
			x[i] = Character.getNumericValue(a[i]);
		}	
		
		for(int i = 0; i < x.length; i++) {
			for(int j = i+1; j < x.length; j++) {
				if(x[i] > x[j]) {
					min = x[i];
					x[i] = x[j];
					x[j] = min;
				}
			}
		}
		for(int i = 0; i < x.length-1; i++) {
			sf = String.valueOf(x[i]) + "+";
			System.out.print(sf);
		}
		
	 System.out.print(x[x.length-1]);
	}
}