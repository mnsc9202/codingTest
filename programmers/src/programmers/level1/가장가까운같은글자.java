package programmers.level1;

import java.util.Arrays;
import java.util.HashMap;

public class 가장가까운같은글자 {

	public static void main(String[] args) {
		// 0. 준비사항
		String[] solutionArgs = {"banana"};
		
		// 1. 실행
		Solution solution = new 가장가까운같은글자().new Solution();
		
		for(String solutionArg : solutionArgs) {
			System.out.println(Arrays.toString(solution.solution(solutionArg)));
		}
	}
	
	class Solution {
	    public int[] solution(String s) {
	    	// 0. 준비사항
	        int[] result = new int[s.length()];
	        HashMap<Character, Integer> position = new HashMap<>();
	        
	        // 1. 확인
	        for(int i = 0; i < s.length(); i++) {
	        	
	        	Character sChar = s.charAt(i);
	        	
	        	// 1.1 위치 확인
	        	Integer sCharPosition = position.getOrDefault(sChar, -1);
	        	result[i] = sCharPosition == -1 ? sCharPosition : i - sCharPosition;

	        	
	        	// 1.2 위치 갱신
	        	position.put(sChar, i);
	        }
	        return result;
	    }
	}

}
