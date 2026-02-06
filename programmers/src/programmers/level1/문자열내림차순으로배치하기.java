package programmers.level1;

import java.util.Arrays;

public class 문자열내림차순으로배치하기 {

	public static void main(String[] args) {
		// 0. 준비사항
		String[] solutionArgs = {"Zbcdefg"};
		
		// 1. 실행
		Solution solution = new 문자열내림차순으로배치하기().new Solution();
		
		for(String solutionArg : solutionArgs) {
			System.out.println(solution.solution(solutionArg));
		}

	}
	
	class Solution {
	    public String solution(String s) {
	    	
	    	// 0. 준비사항
	    	char[] arr = s.toCharArray();
	    	
	    	// 1. 오름차순 정렬
	    	Arrays.sort(arr);
	    	
	    	// 2. 내림차순 정렬
	    	StringBuilder sb =  new StringBuilder(new String(arr)).reverse();
	    	
	    	return sb.toString();

	    }
	}

}
