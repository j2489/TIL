import java.util.Scanner;
import java.io.FileInputStream; // Method needed to use System.setIn

/*
  The class name has to be Solution, so we recomment using Solution.java.
  You can test your program with the command java Solution.
*/

class Solution_default_clear_0906 {	

	static int N; // 음의 개수 (최대 3000개)
	static int[] m = new int[3000];	  // 음계
	static int Answer;

	public static void main(String args[]) throws Exception {

		int test_case, T; // 테스트 케이스를 받는 변수
		System.setIn(new FileInputStream("C:\\Users\\SDS\\Downloads\\package_5\\eval_input.txt"));

		Scanner sc = new Scanner(System.in);

		T = sc.nextInt();

		for(test_case = 1; test_case <= T; test_case++){

			N = sc.nextInt();
			
			for(int i=0; i<N; i++) {
				m[i] = sc.nextInt();
			}
			
			
			int[] melodyCountList = new int[N];
			int tmpMelodyCount = 1;	
			int tmpMelodyLength = 1;
			
			for(int i =0; i<N; i++) {
				for(int k = tmpMelodyLength; k<N; k++) {
					for(int j =0; j<tmpMelodyLength; j++) {
						if(m[k+j] != m[j])
							break;
						if(j == tmpMelodyLength-1)
							tmpMelodyCount++;
					}
				}
				melodyCountList[i] = tmpMelodyCount;
				tmpMelodyLength++;
				tmpMelodyCount = 1;
			}
			
			int tmpBig = 0;
			for(int i = 0; i<N; i++) {
				if(melodyCountList[i]>=tmpBig) {
					tmpBig = melodyCountList[i];
					tmpMelodyCount = i+1; // -> 이게 무슨의미인지 전혀 모르겠다
				}
			}
			
			Answer = tmpMelodyCount;
			
			// Prints out the answer to standard output.
			System.out.println("#" + test_case + " " + Answer);
		}
	}
}
