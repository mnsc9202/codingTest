package programmers.level1;


public class 짝수와홀수 {

	public static void main(String[] args) {
		
		// 0. 준비사항
		int[] solutionArgs = {1,2,3,4};
		
		// 1. 실행
		Solution solution = new 짝수와홀수().new Solution();
		
		for(int solutionArg : solutionArgs) {
			System.out.println(solution.solution(solutionArg));
		}
	}

	
	class Solution {
	    public String solution(int num) {
	        return (num % 2 == 0) ? "Even" : "Odd";
	    }
	}
}
