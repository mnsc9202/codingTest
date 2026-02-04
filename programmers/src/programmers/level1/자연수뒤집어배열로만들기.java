package programmers.level1;

import java.util.ArrayList;
import java.util.Arrays;

public class 자연수뒤집어배열로만들기 {

	public static void main(String[] args) {
		// 0. 준비사항
		long[] solutionArgs = {12345};
		
		// 1. 실행
		Solution solution = new 자연수뒤집어배열로만들기().new Solution();
		
		for(long solutionArg : solutionArgs) {
			System.out.println(Arrays.toString(solution.solution(solutionArg)));
		}

	}
	
	
	class Solution {
	    public int[] solution(long n) {
	    	// 0. 준비사항
	    	ArrayList<Integer> digits = new ArrayList<>(); // 각 자리 숫자 목록
	       
	    	// 1. 자리수 숫자 확인
	    	while(n > 0) {
	    		// 1.1 자리수 숫자 추가
	    		digits.add((int) (n % 10));
		   
	    		// 1.2 설정
	    		n /= 10;
	    	}
	
	    	// 2. 결과 생성
	        return digits.stream().mapToInt(Integer::intValue).toArray();
	    }
	}

}
