import java.util.Scanner;
 
 
public class YoungPhysicist {
	
	public static void main(String[] args) {
		
			Scanner input = new Scanner(System.in);
			
			int n = input.nextInt();
			int xx = 0;
			int yy = 0;
			int zz = 0;
			
			for(int i = 0; i < n; i++){
				int x, y, z;
				x = input.nextInt();
				y = input.nextInt();
				z = input.nextInt();
				
				xx += x;
				yy += y;
				zz += z;
			}
			if(xx == 0 && yy == 0 && zz == 0)
			System.out.print("YES");
			else System.out.print("NO");
			
		}
	}