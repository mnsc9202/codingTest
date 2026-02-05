package programmers.level1;

public class 콜라츠추측 {

	public static void main(String[] args) {
		// 0. 준비사항
		int[] solutionArgs = {6, 16, 626331};
		
		// 1. 실행
		Solution solution = new 콜라츠추측().new Solution();
		
		for(int solutionArg : solutionArgs) {
			System.out.println(solution.solution(solutionArg));
		}

	}
	
	class Solution {
	    public int solution(long num) {
	    	
	    	// 0. 준비사항
	    	int maxExecuteCnt = 500;
	    	int executeCnt = 0;
	    	
	    	
	    	// 1. Collatz 작업
	    	while(num != 1 && executeCnt < maxExecuteCnt) {
	    		num = (num % 2 == 0) ? num / 2 : num * 3 + 1;
	    		executeCnt++;
	    	}
	    	
	    	
	    	return (num == 1) ? executeCnt :-1;
	    }
	}

}
