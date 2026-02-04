package programmers.level1;


public class 자릿수더하기 {

	public static void main(String[] args) {
		// 0. 준비사항
		int[] solutionArgs = {123, 987};
		
		// 1. 실행
		Solution solution = new 자릿수더하기().new Solution();
		
		for(int solutionArg : solutionArgs) {
			System.out.println(solution.solution(solutionArg));
		}

	}
	
	
	public class Solution {
	    public int solution(int n) {	        
	
	        return new StringBuilder(String.valueOf(n)).chars().map(c -> c - '0').sum();
	    }
	}

}
