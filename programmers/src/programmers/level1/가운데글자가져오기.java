package programmers.level1;

public class 가운데글자가져오기 {

	public static void main(String[] args) {
		// 0. 준비사항
		String[] solutionArgs = {"abcde", "qwer"};
		
		// 1. 실행
		Solution solution = new 가운데글자가져오기().new Solution();
		
		for(String solutionArg : solutionArgs) {
			System.out.println(solution.solution(solutionArg));
		}

	}
	
	class Solution {
	    public String solution(String s) {
	    	
	    	// 0. 준비사항
	    	boolean isEven = s.length() % 2 == 0;
	    	int middleIndex = s.length() / 2;
	    	
	    	// 1. subString 구간 계산
	    	int startIndex = isEven ? middleIndex - 1 : middleIndex;
	    	int endIndex = middleIndex + 1;
	    	
	    	// 2. 결과
	        return s.substring(startIndex, endIndex);
	    }
	}

}
