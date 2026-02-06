package programmers.level1;


public class 수박수박수박수박수박수 {

	public static void main(String[] args) {
		// 0. 준비사항
		int[] solutionArgs = {3,4};
		
		// 1. 실행
		Solution solution = new 수박수박수박수박수박수().new Solution();
		
		for(int solutionArg : solutionArgs) {
			System.out.println(solution.solution(solutionArg));
		}

	}
	
	class Solution {
	    public String solution(int n) {
	        return "수박".repeat(n % 2 == 0 ? n/2 : n/2 + 1).substring(0, n);
	    }
	}

}
