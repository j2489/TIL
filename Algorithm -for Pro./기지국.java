import java.util.Scanner;
import java.io.FileInputStream;

/*
   사용하는 클래스명이 Solution 이어야 하므로, 가급적 Solution.java 를 사용할 것을 권장합니다.
   이러한 상황에서도 동일하게 java Solution 명령으로 프로그램을 수행해볼 수 있습니다.
 */
class Solution_default_clear_0907_2 {
	
	static int N;
	static int B;

	static int[] Row, Col;
	
	static int Answer;   // 답을 저장하는 공간

	public static void main(String args[]) throws Exception {

		System.setIn(new FileInputStream("C:\\Users\\SDS\\Downloads\\package_8\\sample_input.txt"));

		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++) {
			/*
			   각 테스트 케이스를 표준 입력에서 읽어옵니다.
			 */
			N = sc.nextInt();
			B = sc.nextInt();
			
			Row = new int[B];
			Col = new int[B];
			
			// 좌표 입력
			for(int i = 0; i < B; i++) {
				Row[i] = sc.nextInt();
				Col[i] = sc.nextInt();
			}
			
			int[][] gijigook = new int [N][N];
			
			for(int i = 0; i < B; i++) {
				if(Row[i]-2>0) {
						gijigook[Row[i]-3][Col[i]-1]++;
				}
				if(Row[i]-1>0) {
						gijigook[Row[i]-2][Col[i]-1]++;
				}
				if(Row[i]+1<=N) {
						gijigook[Row[i]][Col[i]-1]++;
				}
				if(Row[i]+2<=N) {
						gijigook[Row[i]+1][Col[i]-1]++;
				}
				
				if(Col[i]-2>0) {
						gijigook[Row[i]-1][Col[i]-3]++;
				}
				if(Col[i]-1>0) {
						gijigook[Row[i]-1][Col[i]-2]++;
				}
				if(Col[i]+1<=N) {
						gijigook[Row[i]-1][Col[i]]++;
				}
				if(Col[i]+2<=N) {
						gijigook[Row[i]-1][Col[i]+1]++;
				}
			}
			
			Answer = 0;
			for(int i = 0; i<N; i++) {
				for(int j = 0; j<N;j++) {
					if(Answer <gijigook[i][j])
						Answer = gijigook[i][j];
				}
			}
			
			
			// 표준출력(화면)으로 답안을 출력합니다.
			System.out.println("#" + test_case + " " + Answer);
		}
	}
}

