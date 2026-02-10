package programmers.level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

public class 문자열내마음대로정렬하기 {

	public static void main(String[] args) {
		// 0. 준비사항
		String[][] stringsArgs = {
			    {"sun", "bed", "car"},
			    {"abce", "abcd", "cdx"}
			};

		int[] nArgs = {1, 2};

		// 1. 실행
		Solution solution = new 문자열내마음대로정렬하기().new Solution();

		for (int i = 0; i < stringsArgs.length; i++) {
		    System.out.println(Arrays.toString(solution.solution(stringsArgs[i], nArgs[i])));
		}
	}
	
	
	class Solution {
	    public String[] solution(String[] strings, int n) {
	    	// 0. 준비사항
	    	Queue<StringInfo> sortQueue = new PriorityQueue<>((a, b) -> {
								    						if (a.indexChar != b.indexChar) return a.indexChar - b.indexChar;
							    							return a.str.compareTo(b.str);}
	    													);
	    	ArrayList<String> sortList = new ArrayList<>();
	    	
	    	// 1. 추가
	    	for(String str : strings) {
	    		sortQueue.offer(new StringInfo(str.charAt(n), str));
	    	}
	    	
	    	// 2. 확인
	    	while(!sortQueue.isEmpty()) {
	    		sortList.add(sortQueue.poll().str);
	    	}
	    	
	        return sortList.stream().toArray(String[]::new);
	        
	        /*
	        Arrays.sort(strings, (s1, s2) -> {
			    if (s1.charAt(n) != s2.charAt(n)) return s1.charAt(n) - s2.charAt(n);
			    return s1.compareTo(s2);
			});
			return strings;
	         */
	    }
	    
		static class StringInfo {
			char indexChar;
			String str;
			public StringInfo(char indexChar, String str) {
				this.indexChar = indexChar;
				this.str = str;
			}
		}
	}
	


}
