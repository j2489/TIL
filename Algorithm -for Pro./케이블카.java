import java.util.Scanner;
import java.io.FileInputStream;

/*
   사용하는 클래스명이 Solution 이어야 하므로, 가급적 Solution.java 를 사용할 것을 권장합니다.
   이러한 상황에서도 동일하게 java Solution 명령으로 프로그램을 수행해볼 수 있습니다.
 */
class Solution_default_clear_0907_1
{
	static public int N = 50;
	static int[][] matrix = new int[N][N];
	static int AnswerN,n;
	
	public static void main(String args[]) throws Exception
	{
		int T;
		System.setIn(new FileInputStream("C:\\Users\\SDS\\Downloads\\package_6\\eval_input.txt"));

		Scanner sc = new Scanner(System.in);

		T = sc.nextInt();
		for(int test_case = 1; test_case <= T; test_case++)
		{
		    /*
		          각 테스트 케이스를 표준 입력에서 읽어옵니다.
			 해발고도로 표시된 디지털 지도는 matrix 배열에 저장됩니다.
		    */
			n = sc.nextInt();
			for(int i=0;i<n;i++){
				for(int j=0;j<n;j++){
					matrix[i][j]=sc.nextInt(); 
				}
			}
			
			int tmpHigh = -1;
			int tmpLow = -1;
			int x1 = 0;
			int x2 = 0;
			int y1 = 0;
			int y2 = 0;
			
			for(int i=0;i<n;i++){
				for(int j=0;j<n;j++){
					if(i == 0 || j == 0 || i == (n-1) || j == (n-1))
						continue;
					if(matrix[i][j]<matrix[i-1][j+1]&&matrix[i][j]<matrix[i-1][j]&&	matrix[i][j]<matrix[i-1][j+1]&&
							matrix[i][j]<matrix[i][j+1]&&matrix[i][j]<matrix[i+1][j+1]&&matrix[i][j]<matrix[i+1][j]&&
							matrix[i][j]<matrix[i+1][j-1]&&	matrix[i][j]<matrix[i][j-1]) {
						
						if(matrix[i][j]<tmpLow) {
							tmpLow = matrix[i][j];
							x1 = i;
							y1 = j;
						}else if(tmpLow == -1) {
							tmpLow = matrix[i][j];
							x1 = i;
							y1 = j;
						}
						
					}else if(matrix[i][j]>matrix[i-1][j+1]&&matrix[i][j]>matrix[i-1][j]&&matrix[i][j]>matrix[i-1][j+1]&&
							matrix[i][j]>matrix[i][j+1]&&matrix[i][j]>matrix[i+1][j+1]&&matrix[i][j]>matrix[i+1][j]&&
							matrix[i][j]>matrix[i+1][j-1]&&	matrix[i][j]>matrix[i][j-1]) {
						
						if(matrix[i][j]>tmpHigh) {
							tmpHigh = matrix[i][j];
							x2 = i;
							y2 = j;
						}else if(tmpHigh == -1) {
							tmpHigh = matrix[i][j];
							x2 = i;
							y2 = j;
						}
						
					}
				}
			}
			AnswerN =(x1-x2)*(x1-x2)+(y1-y2)*(y1-y2)+(tmpHigh-tmpLow)*(tmpHigh-tmpLow);
			
			// 표준출력(화면)으로 답안을 출력합니다.
			System.out.println("#"+test_case+" "+AnswerN);
		}
	}
}

