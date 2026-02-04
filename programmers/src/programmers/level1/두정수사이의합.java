package programmers.level1;


public class 두정수사이의합 {

	public static void main(String[] args) {
		// 0. 준비사항
		int[][] solutionArgs = {{3,5},{3,3},{5,3}};
		
		// 1. 실행
		Solution solution = new 두정수사이의합().new Solution();
		
		for(int[] solutionArg : solutionArgs) {
			System.out.println(solution.solution(solutionArg[0], solutionArg[1]));
		}

	}
	
	class Solution {
	    public long solution(int a, int b) {
	    	// 0. 준비사항
	    	long A = a;
	    	long B = b;
	    	
	    	// 1. 두 수 사이의 개수
	        long cnt = Math.abs(A - B) + 1;
	        
	        // 2. 두 수 사이 합 계산
	        return ((A + B) * cnt) / 2;
	    }
	}

}
