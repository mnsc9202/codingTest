package programmers.level1;

import java.util.Arrays;

public class 기사단원의무기 {

	public static void main(String[] args) {
		// 0. 준비사항
		int[][] solutionArgs = {{5,3,2}, {10,3,2}};
		
		// 1. 실행
		Solution solution = new 기사단원의무기().new Solution();
		
		for(int[] solutionArg : solutionArgs) {
			System.out.println(solution.solution(solutionArg[0], solutionArg[1], solutionArg[2]));
		}
	}
	
	class Solution {
	    public int solution(int number, int limit, int power) {
	    	// 0. 준비사항
	        int[] divisors = new int[number];
	        
	        // 1. 약수 개수 확인
	        for(int i = 1; i <= number; i++) {
	        	int divisorCnt = getDivisorCnt(i);
	        	divisors[i - 1] = divisorCnt > limit ? power : divisorCnt;
	        }
	        
	        // 2. 합 계산
	        return Arrays.stream(divisors).sum();
	    }
	    
	    public int getDivisorCnt(int n) {
	    	int divisorCnt = 0;
	    	for(int i = 1; i * i <= n; i++) {
	    		if(n % i ==0) {
	    			divisorCnt++;
	    			if(i != n / i) {
	    				divisorCnt++;
	    			}
	    		}
	    	}	    	
	    	return divisorCnt;
	    }
	}

}
