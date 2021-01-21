import java.util.Scanner;
 
public class LifeWithoutZeros {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		
		int num1 = s.nextInt();
		int num2 = s.nextInt();
		int result = num1 + num2;
		int result1=0;
		int x=0;
		String n1 = "";
		String t="";
		String c="";
		
		String n = String.valueOf(num1)+"+"+String.valueOf(num2)+"="+String.valueOf(result);
		
		for(int i=0;i<n.length();i++) {
			c = String.valueOf(n.charAt(i));
			
			if(!c.equals("0"))
				t = t+c;
		}
		
		for(int i=0;i<t.length();i++) {
			c = String.valueOf(t.charAt(i));
			if(c.equals("+")) {
			n1 = t.substring(x, i);
			num1 = Integer.parseInt(n1);
			x = i+1;
			}
			else if(c.equals("=")) {
				n1 = t.substring(x, i);
				num2 = Integer.parseInt(n1);
				x=i+1;
				}
			else if(i==t.length()-1) {
				n1 = t.substring(x, i+1);
				result1 = Integer.parseInt(n1);
			}
			
		}
		
		int r = num1 + num2;
		if(r==result1)
			System.out.println("YES");
		else
			System.out.println("NO");
 
	}
 
}