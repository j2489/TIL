import java.util.Scanner;
import java.io.FileInputStream; // System.setIn 사용을 위해 추가적으로 필요한 메소드
import java.nio.charset.Charset;

/*
   사용하는 클래스명이 Solution 이어야 하므로, 가급적 Solution.java 를 사용할 것을 권장합니다.
   이러한 상황에서도 동일하게 java Solution 명령으로 프로그램을 수행해볼 수 있습니다.
*/
class Solution_default_clear_0905_2
{
	static int Answer;
	static int N;
	static int Target;
	static String Text;

	public static void main(String args[]) throws Exception
	{
		long start = System.currentTimeMillis(); //시작하는 시점 계산
		
		int T; // 테스트케이스 총 개수를 저장하는 변수
		
		System.setIn(new FileInputStream("C:\\Users\\SDS\\Downloads\\package_4\\sample_input.txt"));
		Scanner sc = new Scanner(System.in);
		
		T = sc.nextInt();
		
		for(int test_case = 1; test_case <= T; ++test_case)
		{
			N = sc.nextInt(); // 문자열 길이
			Target = sc.nextInt(); // 매칭 시킬 열린 괄호의 위치
			Text = sc.next(); // 열린 괄호 닫힌 괄호 나열
			
			int sum = 0;
			for(int i = 0; i<N; i++){
				if(Text.charAt(i) == '(') {
					sum++;
				}else if(Text.charAt(i) == ')') {
					sum--;
				}
			}
			
			if(sum != 0) {
				Answer = 0;
				System.out.println("#" + test_case + " " + Answer);
				continue;
			}
				
			int tmp = Target;
			for(int i = Target; i<N; i++){
				if(Text.charAt(i) == '(') {
					tmp++;
				}else if(Text.charAt(i) == ')') {
					tmp--;
				}
				
				if(tmp == Target-1) {
					Answer = i+1;
					break;
				}
			}
			
			System.out.println("#" + test_case + " " + Answer);
		}
		
		long end = System.currentTimeMillis(); //프로그램이 끝나는 시점 계산
		System.out.println( "실행 시간 : " + (( end - start )/1000.0) + "초"); //실행 시간 계산 및 출력

	}

}
