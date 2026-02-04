package programmers.level1;

import java.util.ArrayList;

public class 하샤드수 {

	public static void main(String[] args) {
		// 0. 준비사항
		int[] solutionArgs = {10,12,11,13};
		
		// 1. 실행
		Solution solution = new 하샤드수().new Solution();
		
		for(int solutionArg : solutionArgs) {
			System.out.println(solution.solution(solutionArg));
		}

	}
	
	
	class Solution {
	    public boolean solution(int x) {
	    	
	    	// 0. 준비사항
	    	int sumDigits = 0;
	    	int originX = x;
	       
	    	// 1. 자리수 합 계산
	    	while(x > 0) {
	    		// 1.1 자리수 숫자 더하기
	    		sumDigits += x % 10;
		   
	    		// 1.2 설정
	    		x /= 10;
	    	}
	    	
	    	
	    	// 2. 하샤드 수 확인
	        return originX % sumDigits == 0;
	    }
	}

}
