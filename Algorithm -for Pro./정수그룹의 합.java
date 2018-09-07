import java.util.Scanner;
import java.io.FileInputStream;
/*
   사용하는 클래스명이 Solution 이어야 하므로, 가급적 Solution.java 를 사용할 것을 권장합니다.
   이러한 상황에서도 동일하게 java Solution 명령으로 프로그램을 수행해볼 수 있습니다.
 */
class Solution_default_clear_0905_1
{
	static int[] A = new int[6];
	static int Sum1, Sum2;

	public static void main(String args[]) throws Exception {
		int test_case, T;

		System.setIn(new FileInputStream("C:\\Users\\SDS\\Downloads\\package_3\\eval_input.txt"));
		Scanner sc = new Scanner(System.in);

		T = sc.nextInt();
		
		for(test_case = 1; test_case <= T; test_case++) {

			for(int i = 0; i < 6; i++) {
				A[i] = sc.nextInt();
			}

			int totalSum = 0;
			int tmpSum1;
			
			// 전체합
			for(int i = 0; i < 6; i++) {
				totalSum = totalSum + A[i];
			}
			
			int CMR = 0;
			int NMR;
			int times = 1;
			
			for(int i = 0; i < 4; i++) {
				for(int j = i+1;j <  5; j++) {
					for(int k = j+1; k < 6; k++) {
						tmpSum1 = A[i]+A[j]+A[k];
						NMR = totalSum-2*tmpSum1;
						
						if(NMR<0)
							NMR = NMR * -1;
						
						if(times==1) {
							CMR = NMR;
						}else if(NMR<=CMR) {
							CMR = NMR;
							Sum1 = tmpSum1;
							Sum2 = totalSum-Sum1;
						}
						times++;
					}
				}
			}

			System.out.println("#" + test_case + " " + Sum1 + " " + Sum2);
		}
	}
}

