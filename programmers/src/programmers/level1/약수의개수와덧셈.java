package programmers.level1;


public class 약수의개수와덧셈 {

	public static void main(String[] args) {
		// 0. 준비사항
		int[][] solutionArgs = {{13, 17,}, {24,27}};
		
		// 1. 실행
		Solution solution = new 약수의개수와덧셈().new Solution();
		
		for(int[] solutionArg : solutionArgs) {
			System.out.println(solution.solution(solutionArg[0], solutionArg[1]));
		}
	}
	
	
	class Solution {
	    public int solution(int left, int right) {
	        
	    	// 0. 준비사항
	    	int sum = 0;
	    	
	    	// 1. 정수 확인
	    	for(int i = left; i <= right; i++) {
	    		
	    		// 1.0 준비사항
	    		int factorCnt = 0;
	    		
	    		// 1.1 약수 개수 확인
	    		for(int j = 1; j * j <= i; j++) {
	    			if(i % j == 0) factorCnt += (i / j == j) ? 1 : 2;
	    		}
	    		
	    		// 1.2 합 계산
	    		sum += (factorCnt % 2 == 0) ? i : -i;
	    		
	    	}
	    	
	    	return sum;
	    }
	}

}
