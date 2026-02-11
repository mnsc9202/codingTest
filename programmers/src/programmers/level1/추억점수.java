package programmers.level1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class 추억점수 {

	public static void main(String[] args) {
		// 0. 준비사항
		String[][] names = {{"may", "kein", "kain", "radi"}, {"kali", "mari", "don"}, {"may", "kein", "kain", "radi"}};
		int[][] yearnings = {{5, 10, 1, 3}, {11, 1, 55}, {5, 10, 1, 3}};
		String[][][] photos = {
								{{"may", "kein", "kain", "radi"},{"may", "kein", "brin", "deny"}, {"kon", "kain", "may", "coni"}},
								{{"kali", "mari", "don"}, {"pony", "tom", "teddy"}, {"con", "mona", "don"}},
								{{"may"}, {"kein", "deny", "may"}, {"kon", "coni"}}
								};
		
		// 1. 실행
		Solution solution = new 추억점수().new Solution();
		
		for(int i = 0; i < names.length; i++) {
			System.out.println(Arrays.toString(solution.solution(names[i], yearnings[i], photos[i])));
		}

	}
	
	
	class Solution {
	    public int[] solution(String[] name, int[] yearning, String[][] photo) {
	        // 0. 준비사항
	    	int[] result = new int[photo.length];
	    	Map<String, Integer> persons = new HashMap<>();
	    	
	    	// 1. 사람 정보 저장
	    	for(int i = 0; i <name.length; i++) {
	    		persons.put(name[i], yearning[i]);
	    	}
	    	
	    	// 2. 그리움 계산
	    	for(int i = 0; i < photo.length; i++) {
	    		for(int j = 0; j < photo[i].length; j++) {
	    			result[i] += persons.getOrDefault(photo[i][j], 0);
	    		}
	    	}
	    	
	        return result;
	    }
	}

}
