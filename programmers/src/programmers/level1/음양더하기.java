package programmers.level1;


public class 음양더하기 {

	public static void main(String[] args) {
		// 0. 준비사항
		int[][] absolutes = {{4,7,12}, {1,2,3}};
		boolean[][] signs = {{true, false, true}, {false, false, true}};
		
		// 1. 실행
		Solution solution = new 음양더하기().new Solution();
		
		for(int i = 0; i < absolutes.length; i++) {
			System.out.println(solution.solution(absolutes[i], signs[i]));
		}


	}
	
	class Solution {
	    public int solution(int[] absolutes, boolean[] signs) {
	        // 0. 준비사항
	    	int sum = 0;
	    	
	    	// 1. 계산
	    	for (int i = 0; i < signs.length; i++) {
	    		sum += signs[i] ? absolutes[i] : -absolutes[i];
	    	}
	        return sum;
	    }
	}

}
