package programmers.level1;


public class 핸드폰번호가리기 {

	public static void main(String[] args) {
		// 0. 준비사항
		String[] solutionArgs = {"01033334444", "027778888"};
		
		// 1. 실행
		Solution solution = new 핸드폰번호가리기().new Solution();
		
		for(String solutionArg : solutionArgs) {
			System.out.println(solution.solution(solutionArg));
		}

	}
	
	class Solution {
	    public String solution(String phoneNumber) {
	    	
	    	// 0. 준비사항
	    	StringBuilder sb = new StringBuilder();
	    	int phoneNumberCnt = phoneNumber.length();
	    	int maskingEndIndex = Math.max(phoneNumberCnt - 4, 0);
	    	
	    	// 1. 마스킹
	    	for(int i = 0; i < phoneNumberCnt; i++) {
	    		sb.append(i < maskingEndIndex ? "*" : phoneNumber.charAt(i));
	    	}
	    	
	    	// 2. 결과
	        return sb.toString();
	    }
	}

}
