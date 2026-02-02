package programmers.level1;

import java.util.Arrays;

public class 평균구하기 {

	public static void main(String[] args) {
		// 0. 준비사항
		int[] solutionArgs = {1,2,3,4};
		
		// 1. 실행
		Solution solution = new 평균구하기().new Solution();
		
		System.out.println(solution.solution(solutionArgs));
	}
	
	class Solution {
	    public double solution(int[] arr) {
	        	        
	        return Arrays.stream(arr).average().orElse(0);
	    }
	}

}
