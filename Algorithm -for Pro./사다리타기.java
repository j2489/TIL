import java.util.Scanner;
import java.io.FileInputStream;

class Solution_default_clear_0904
{
	static int N, B, M;
	static int[] R1, C1, R2, C2;
	static int Answer;

	public static void main(String args[]) throws Exception
	{
		System.setIn(new FileInputStream("C:\\Users\\SDS\\Downloads\\package_2\\eval_input.txt"));

		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{
			N = sc.nextInt();  // 사원의 수
			B = sc.nextInt();  // 폭탄의 위치 (0 base가 아닌 1 base)
			M = sc.nextInt();  // 가로선(사다리)의 수 
			R1 = new int [M];
			C1 = new int [M];
			R2 = new int [M];
			C2 = new int [M];
			for(int i = 0; i < M; i++)
			{
				R1[i] = sc.nextInt();
				C1[i] = sc.nextInt();
				R2[i] = sc.nextInt();
				C2[i] = sc.nextInt();
			}
			
			Answer = 0;
			int sawon = 1;
			int r = 1;
			int c = 1;
			
			while(sawon<=N) {
				for(int i=0; i<M;i++) {
					if(r == R1[i]&&c == C1[i]) {
						c=C2[i];
						break;
					}
					else if(r == R2[i]&&c == C2[i]) {
						c=C1[i];
						break;
					}
				}
				
				r++;
				if(r<N) {
					continue;
				}
				else if(r ==N && c==B) {
					Answer = sawon;
					break;
				}
				sawon++;
				r = 1;
				c = sawon;
			}
				
			System.out.println("#" + test_case + " " + Answer);
		}
	}
}

