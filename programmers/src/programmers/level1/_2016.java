package programmers.level1;


public class _2016 {

	public static void main(String[] args) {
		// 0. 준비사항
		int[][] solutionArgs = {{5, 24}};
		
		// 1. 실행
		Solution solution = new _2016().new Solution();
		
		for(int solutionArg[] : solutionArgs) {
			System.out.println(solution.solution(solutionArg[0], solutionArg[1]));
		}
	}
	
	class Solution {
	    public String solution(int a, int b) {
	    	
	    	// 	0. 준비사항
	    	int day = b + 5 - 1; // 2016-01-01은 금요일(5);
	    	String[] dayOfWeek = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
	    	int[] monthDays = {31,29,31,30,31,30,31,31,30,31,30,31};
	    	
	    	// 1. 월 -> 일 계산
	    	for(int i = 1; i < a; i++) {
	    		day += monthDays[i-1];
	    	}
	    	
	    	// 2. 요일 계산
	        return dayOfWeek[day % 7];
	    }
	}

}
