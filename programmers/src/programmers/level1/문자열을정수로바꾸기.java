package programmers.level1;


public class 문자열을정수로바꾸기 {

	public static void main(String[] args) {
		// 0. 준비사항
		String[] solutionArgs = {"+1","-2","-3","+4"};
		
		// 1. 실행
		Solution solution = new 문자열을정수로바꾸기().new Solution();
		
		for(String solutionArg : solutionArgs) {
			System.out.println(solution.solution(solutionArg));
		}

	}

	
	class Solution {
	    public int solution(String s) {
	        return Integer.parseInt(s);
	    }
	}
}
