package programmers.level1;



public class 서울에서김서방찾기 {

	public static void main(String[] args) {

		// 0. 준비사항
		String[][] solutionArgs = {{"Jane", "Kim"}};
		
		// 1. 실행
		Solution solution = new 서울에서김서방찾기().new Solution();
		
		for(String[] solutionArg : solutionArgs) {
			System.out.println(solution.solution(solutionArg));
		}
	}
	
	class Solution {
	    public String solution(String[] seoul) {
	    	
	    	// 1. 확인
	    	for(int i = 0; i < seoul.length; i++) {
	    		if("Kim".equals(seoul[i])) {
	    			return "김서방은 " + i + "에 있다";
	    		}
	    	}
	    	return "";
	    	
	    }
	}

}
