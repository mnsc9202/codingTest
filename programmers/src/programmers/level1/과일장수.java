package programmers.level1;

import java.util.Arrays;

public class 과일장수 {

	public static void main(String[] args) {
		// 0. 준비사항
		int[][][] solutionArgs = {
								{{3},{4},{1, 2, 3, 1, 2, 3, 1}},
								{{4},{3},{4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2}},
								};
		
		// 1. 실행
		Solution solution = new 과일장수().new Solution();
		
		for(int[][] solutionArg : solutionArgs) {
			System.out.println(solution.solution(solutionArg[0][0], solutionArg[1][0], solutionArg[2]));
		}

	}
	
	class Solution {
	    public int solution(int k, int m, int[] score) {
	    	// 0. 준비사항
	    	int profit = 0;
	    	int boxCnt = score.length / m;
	    	Arrays.sort(score);
	    	
	    	// 1. 계산
	    	for(int i = 1; i <= boxCnt; i++) {
	    		profit += score[score.length -1 - (m * i) + 1] * m;
	    	}
	    	
	        return profit;
	    }
	}

}
