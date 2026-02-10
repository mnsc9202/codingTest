package programmers.level1;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

public class 명예의전당1 {

	public static void main(String[] args) {
		// 0. 준비사항
		int[][][] solutionArgs = {
								{{3}, {10, 100, 20, 150, 1, 100, 200}},
								{{4}, {0, 300, 40, 300, 20, 70, 150, 50, 500, 1000}}
								};
		
		// 1. 실행
		Solution solution = new 명예의전당1().new Solution();
		
		for(int[][] solutionArg : solutionArgs) {
			System.out.println(Arrays.toString(solution.solution(solutionArg[0][0], solutionArg[1])));
		}
	}
	
	
	class Solution {
	    public int[] solution(int k, int[] scores) {
	    	
	    	// 0. 준비사항
	    	Queue<Integer> scoreQueue = new PriorityQueue<>();
	    	int[] result = new int[scores.length];
	    	
	    	// 1. 점수 확인
	    	for(int i = 0; i < scores.length; i++) {
	    		// 명예의 전당 등록
	    		scoreQueue.offer(scores[i]);
	    		
	    		// 명예의 전당 점검
	    		if(scoreQueue.size() > k) {
	    			scoreQueue.poll();
	    		}
	    		
	    		// 최하위 점수 조회
	    		result[i] = scoreQueue.peek();
	    	}
	    	
	    	
	        return result;
	    }
	}

}
