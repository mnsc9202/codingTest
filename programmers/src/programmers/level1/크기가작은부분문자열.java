package programmers.level1;

import java.util.ArrayList;

public class 크기가작은부분문자열 {

	public static void main(String[] args) {
		
		// 0. 준비사항
		String[][] solutionArgs = {{"3141592", "271"}, {"500220839878", "7"}, {"10203", "15"}};
		
		// 1. 실행
		Solution solution = new 크기가작은부분문자열().new Solution();
		
		for(String[] solutionArg : solutionArgs) {
			System.out.println(solution.solution(solutionArg[0], solutionArg[1]));
		}

	}
	
	class Solution {
	    public int solution(String t, String p) {
	    	/*
	        // 0. 준비사항
	    	ArrayList<String> subStrs = new ArrayList<>();
	    	int result = 0;
	    	
	    	// 1. 부분 문자열 구하기
	    	for(int i = 0; i <= t.length() - p.length(); i ++) {
	    		subStrs.add(t.substring(i, i + p.length()));
	    	}
	    	
	    	// 2. 결과 구하기
	    	for (String subStr : subStrs) {
	    		if(Long.parseLong(subStr) <= Long.parseLong(p)) result++; 
	    	}	    	
	    	
	    	return result;
	    	
	    	*/
	    	// 0. 준비사항
	    	int tLen = t.length();
	        int pLen = p.length();
	        int count = 0;

	        // 1. 확인
	        for (int i = 0; i <= tLen - pLen; i++) {
	            int cmp = compareRegion(t, i, p, pLen);
	            if (cmp <= 0) count++;
	        }
	        return count;
	    }
	    
	    private int compareRegion(String t, int tStart, String p, int len) {
	        for (int k = 0; k < len; k++) {
	            char a = t.charAt(tStart + k);
	            char b = p.charAt(k);
	            if (a != b) return a - b;
	        }
	        return 0;
	    }
	}

}
