package programmers.level1;


public class 문자열내p와y의개수 {

	public static void main(String[] args) {
		// 0. 준비사항
		String[] solutionArgs = {"pPoooyY", "Pyy", "zxc"};
		
		// 1. 실행
		Solution solution = new 문자열내p와y의개수().new Solution();
		
		for(String solutionArg : solutionArgs) {
			System.out.println(solution.solution(solutionArg));
		}

	}

	
	class Solution {
	    boolean solution(String s) {
	    	// 0. 준비사항
	    	String lowerS = s.toLowerCase();
	    	long charCnt = lowerS.length();
	    	
	    	// 1. 계산
	    	long pCnt = charCnt - lowerS.replace("p", "").length();
	    	long yCnt = charCnt - lowerS.replace("y", "").length();

	        return pCnt == yCnt;
	    }
	}
}
