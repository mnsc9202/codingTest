package programmers.level1;

import java.util.ArrayList;
import java.util.Arrays;

public class 나누어떨어지는숫자배열 {

	public static void main(String[] args) {
		// 0. 준비사항
		int[][][] solutionArgs = {{{5,9,7,10}, {5}}, {{2,36,1,3}, {1}}, {{3,2,6}, {10}}};
		
		// 1. 실행
		Solution solution = new 나누어떨어지는숫자배열().new Solution();
		
		for(int[][] solutionArg : solutionArgs) {
			System.out.println(Arrays.toString(solution.solution(solutionArg[0], solutionArg[1][0])));
		}
	}
	
	class Solution {
	    public int[] solution(int[] arr, int divisor) {
	    	
	    	// 0. 준비사항
	    	ArrayList<Integer> result = new ArrayList<>();
	    	
	    	// 1. 확인
	    	for(int num : arr) {
	    		if(num % divisor == 0) result.add(num);
	    	}
	    	
	    	// 2. 결과
	    	if(result.isEmpty()) return new int[]{-1}; 
	    	result.sort(Integer::compareTo);
    		return result.stream().mapToInt(Integer::intValue).toArray();
	    }
	}

}
