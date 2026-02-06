package programmers.level1;

public class 문자열다루기기본 {

	public static void main(String[] args) {
		// 0. 준비사항
		String[] solutionArgs = {"1111Z4", "1234"};
		
		// 1. 실행
		Solution solution = new 문자열다루기기본().new Solution();
		
		for(String solutionArg : solutionArgs) {
			System.out.println(solution.solution(solutionArg));
		}

	}
	
	
	class Solution {
	    public boolean solution(String s) {
	        
	    	
	    	// 1. 문자 길이 확인
	    	if (!(s.length() == 4 || s.length() == 6)) return false;
	        
	    	// 2. 숫자 구성 확인
	    	return s.chars().allMatch(Character::isDigit);
	    }
	}

}
