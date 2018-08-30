import java.util.Scanner;

public class practice {

	public static void main(String[] args) {
		int result = gcd(40,100);
		System.out.println(result);
		
		print("tower");
		
		 
	}

	// 변수 i, j의 최대공약수를 구하는 재귀함수 
	public static int gcd(int i, int j) {
		if (j==0)
			return	i;
		else
			return gcd(j, j%i);
	}
	// 문자형 변수 str을 거꾸로 프린트하는 
	public static void print (String str) {
		if(str.equals(""))
			return;
		else
			print(str.substring(1));
			System.out.print(str.charAt(0));
			
	}
	
}
