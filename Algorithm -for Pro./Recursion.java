import java.util.Scanner;

public class practice {

	public static void main(String[] args) {
		int result = gcd(40,100);
		System.out.println(result);
		
		print("tower");
		
		 
	}

	
	public static int gcd(int i, int j) {
		if (j==0)
			return	i;
		else
			return gcd(j, j%i);
	}
	
	public static void print (String str) {
		if(str.equals(""))
			return;
		else
			print(str.substring(1));
			System.out.print(str.charAt(0));
			
	}
	
}
