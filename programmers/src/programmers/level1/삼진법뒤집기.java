package programmers.level1;

import java.util.ArrayList;

public class 삼진법뒤집기 {

	public static void main(String[] args) {
		// 0. 준비사항
		int[] solutionArgs = {45, 125};
		
		// 1. 실행
		Solution solution = new 삼진법뒤집기().new Solution();
		
		for(int solutionArg : solutionArgs) {
			System.out.println(solution.solution(solutionArg));
		}

	}
	
	class Solution {
	    public int solution(int n) {
	        
	       // 0. 준비사항
	       ArrayList<Integer> nums = new ArrayList<>();
	       int answer = 0;
	       
	       /*
	        * 45 = 3 * 15	+ 0
	        * 15 = 3 * 5	+ 0
	        * 5 = 3 * 1		+ 2
	        * 1 = 3 * 0		+ 1
	        */
	       // 1. 3진법 계산 (역순 저장)
	       while(n != 0) {
	    	   nums.add(n % 3);
	    	   n = n / 3;
	       }
	       
	       // 2. 10진법 표현
	       int weight = 1; // 3^0
	       for(int i = nums.size() - 1; i >=0; i--) {
	    	   answer += nums.get(i) * weight;
	    	   weight *= 3;
	       }
	       
	        return answer;
	    }
	}

}
