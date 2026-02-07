package programmers.level1;

public class 삼총사 {

	public static void main(String[] args) {
		
		// 0. 준비사항
		int[][] solutionArgs = {{-2, 3, 0, 2, -5},
								{-3, -2, -1, 0, 1, 2, 3},
								{-1, 1, -1, 1}};
		
		// 1. 실행
		Solution solution = new 삼총사().new Solution();
		
		for(int solutionArg[] : solutionArgs) {
			System.out.println(solution.solution(solutionArg));
		}
	}
	
	
	class Solution {
	    public int solution(int[] number) {
	    	// 0. 준비사항
	        int result = 0;
	        
	        // 1. 계산
	        for(int i = 0; i < number.length - 2; i++) {
	        	for(int j = i + 1; j < number.length -1; j++) {
	        		for(int k = j + 1; k < number.length; k++) {
	        			if(number[i] + number[j] + number[k] == 0) result++;
	        		}
	        	}
	        	
	        }
	        return result;
	    }
	}

}
