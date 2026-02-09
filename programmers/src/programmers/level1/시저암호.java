package programmers.level1;


public class 시저암호 {

	public static void main(String[] args) {
		// 0. 준비사항
		Object[][] solutionArgs = {{"AB", 1}, {"z", 1}, {"a B z", 4}};
		
		// 1. 실행
		Solution solution = new 시저암호().new Solution();
		
		for(Object[] solutionArg : solutionArgs) {
			System.out.println(solution.solution((String) solutionArg[0], (Integer) solutionArg[1]));
		}

	}
	
	class Solution {
	    public String solution(String s, int n) {
	    	
	    	// 0. 준비사항
	    	StringBuilder sb = new StringBuilder();
	    	
	    	
	    	// 1. 시저 암호
	    	/**
	    	 * 'A' = 65
	    	 * 'Z' = 90
	    	 * 'a' = 97
	    	 * 'z' = 122
	    	 */
	    	for(int i = 0; i < s.length(); i++) {
	    		char sChar = s.charAt(i);
	    		char arrangeSChar  = ' ';
    			int sCharNum = (int) sChar + n;
	    		
	    		if(Character.isUpperCase(sChar)) {
	    			arrangeSChar = sCharNum > 'Z' ? (char) ((sCharNum - 'Z') + ('A' - 1) ): (char) sCharNum;
	    		}else {
	    			arrangeSChar = sCharNum > 'z' ? (char) ((sCharNum - 'z') + ('a' - 1) ): (char) sCharNum;
	    		}
	    		sb.append(sChar == ' ' ? sChar : arrangeSChar);	    		
	    	}
	    	
	    	
	        return sb.toString();
	    }
	}

}
