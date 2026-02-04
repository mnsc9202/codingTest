package programmers.level1;

import java.util.ArrayList;

public class 정수내림차순으로배치하기 {

	public static void main(String[] args) {
		
		// 0. 준비사항
		long[] solutionArgs = {118372};
		
		// 1. 실행
		Solution solution = new 정수내림차순으로배치하기().new Solution();
		
		for(long solutionArg : solutionArgs) {
			System.out.println(solution.solution(solutionArg));
		}

	}
	
	
	class Solution {
	    public long solution(long n) {
	    	
	    	// 0. 준비사항
	    	ArrayList<Long> digits = new ArrayList<>(); // 각 자리 숫자 목록
	       
	    	// 1. 자리수 숫자 확인
	    	while(n > 0) {
	    		// 1.1 자리수 숫자 추가
	    		digits.add(n % 10);
		   
	    		// 1.2 설정
	    		n /= 10;
	    	}
	    
	    	// 2. 정렬
	    	digits.sort((a, b) -> a>b ? -1 : 1);
		   
	    	// 3. 결과 만들기
	    	long result = 0;
	    	for(Long digit : digits) {
	    		result = result * 10 + digit;
	    	}	       
		    return result;
	    }
	}

}
