package programmers.level1;


public class 정수제곱근판별 {

	public static void main(String[] args) {
		// 0. 준비사항
		long[] solutionArgs = {121,3};
		
		// 1. 실행
		Solution solution = new 정수제곱근판별().new Solution();
		
		for(long solutionArg : solutionArgs) {
			System.out.println(solution.solution(solutionArg));
		}

	}

	
	class Solution {
	    public long solution(long n) {
	    	
	    	// 1. 제곱근 확인
	    	for(long i = 0 ; i*i <= n ; i++) {
	    		
	    		// 1.2 제곱근 찾은 경우
	    		if (i * i == n) {
	    			return (i + 1) * (i + 1);
	    		}
	    	}

	    	// 1.2 제곱근 못찾은 경우
	        return -1;
	    }
	}
}
