package programmers.level1;

import java.util.Arrays;

public class 행렬의덧셈 {

	public static void main(String[] args) {
		// 0. 준비사항
		int[][][][] solutionArgs = {
									{{{1,2}, {2,3}}, {{3,4}, {5,6}}},
									{{{1},{2}}, {{3},{4}}}
									};
		
		// 1. 실행
		Solution solution = new 행렬의덧셈().new Solution();
		
		for(int[][][] solutionArg : solutionArgs) {
			System.out.println(Arrays.deepToString(solution.solution(solutionArg[0], solutionArg[1])));
		}

	}
	
	class Solution {
	    public int[][] solution(int[][] arr1, int[][] arr2) {
	        
	    	// 0. 준비사항
	    	int row = arr1.length;
	    	int col = arr1[0].length;
	    	int[][] result = new int[row][col];
	    		    	
	    	
	    	// 1. 행렬 덧셈
	    	for(int i = 0; i < row; i++) {
	    		for(int j = 0; j < col; j ++) {
	    			result[i][j] = arr1[i][j] + arr2[i][j];
	    		}
	    	}
	    	
	    	
	    	return result;
	    }
	}

}
