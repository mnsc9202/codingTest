package programmers.level1;


public class 내적 {

	public static void main(String[] args) {
		// 0. 준비사항
		int[][][] solutionArgs = {{{1,2,3,4},{-3,-1,0,2}}, {{-1,0,1}, {1,0,-1}}};
		
		// 1. 실행
		Solution solution = new 내적().new Solution();
		
		for(int[][] solutionArg : solutionArgs) {
			System.out.println(solution.solution(solutionArg[0], solutionArg[1]));
		}

	}
	
	class Solution {
	    public int solution(int[] a, int[] b) {
	        
	    	// 0. 준비사항
	    	int dotProduct = 0;
	    	
	    	// 1. 내적 계산
	    	for(int i = 0; i < a.length; i++) {
	    		dotProduct += a[i] * b[i];
	    	}
	    	
	        return dotProduct;
	    }
	}

}
