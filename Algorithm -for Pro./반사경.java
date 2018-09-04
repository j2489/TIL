import java.util.Scanner;
import java.io.FileInputStream;

/*
   사용하는 클래스명이 Solution 이어야 하므로, 가급적 Solution.java 를 사용할 것을 권장합니다.
   이러한 상황에서도 동일하게 java Solution 명령으로 프로그램을 수행해볼 수 있습니다.
 */
class Solution_default_clear_0903
{
	static int N, AnswerN;
	static int[][] map = new int[100][100];
	public static void main(String args[]) throws Exception
	{
		int T;
//		System.setIn(new FileInputStream("C:\\Users\\SDS\\Downloads\\package_1\\eval_input.txt"));

		Scanner sc = new Scanner(System.in);

		T = sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{
			/*
		     각 테스트 케이스를 표준 입력에서 읽어옵니다.
			 */		
			N = sc.nextInt();
			for(int i=0; i<N; i++){
				for(int j=0; j<N; j++){
					map[i][j]=sc.nextInt();
				}
			}			
			
		AnswerN = 0;	 //초기화
		String way = "w"; 	//처음에는 0,0에서 오른쪽으로 쏘므로 서쪽으로 들어간다고 가정	
		int x = 0;
		int y = 0;
		
		for(int k=0; k<10000; k++){
//			for(int y=0; y<N; y++){
//				System.out.println(way+", "+x +", " + y);
				if(x>=N || y>=N || x<0 || y<0) {
					break;
				}else if(map[x][y] == 0){
					if(way == "e") {
						y = y-1;
					} else if(way == "w") {
						y = y+1;
					} else if(way == "s") {
						x = x-1;
					} else if(way == "n") {
						x = x+1;
					}
				}else if(map[x][y] == 1) {
					AnswerN++;
					if(way == "e") {
						way = "n";
						x = x+1;
					} else if(way == "w") {
						way = "s";
						x = x-1;
					} else if(way == "s") {
						way = "w";
						y = y+1;
					} else if(way == "n") {
						way = "e";
						y = y-1;
					}
				}else if(map[x][y] == 2) {
					AnswerN++;
					if(way == "e") {
						way = "s";
						x = x-1;
					} else if(way == "w") {
						way = "n";
						x = x+1;
					} else if(way == "s") {
						way = "e";
						y = y-1;
					} else if(way == "n") {
						way = "w";
						y = y+1;
					}
				}
				
//			}
		}
			
			// 표준출력(화면)으로 답안을 출력합니다.
			System.out.println("#" + test_case+" "+AnswerN);
		}
	}
}

