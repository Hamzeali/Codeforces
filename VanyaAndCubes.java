import java.util.Scanner;
 
public class VanyaAndCubes {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int count = 0;
		int cube=0;
		int x=0;
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		for(int i=1;i<=num;i++) {
			cube = cube +i;
			count = count +cube;
			if(count > num) {
				//x--;
				break;
				}
			else
				x++;
		}
		
		System.out.println(x);
 
	}
 
}