package programmers.level1;

import java.util.Arrays;
import java.util.stream.LongStream;

public class x만큼간격이있는n개의숫자 {

	public static void main(String[] args) {
		// 0. 준비사항
		int[] solutionArgs = {1,2,3,4};
		
		// 1. 실행
		Solution solution = new x만큼간격이있는n개의숫자().new Solution();
		
		for(int i = 0; i < solutionArgs.length -1; i++) {
			System.out.println(Arrays.toString(solution.solution(solutionArgs[i], solutionArgs[i+1])));
		}
	}
	
	class Solution {
	    public long[] solution(int x, int n) {
	        return LongStream.iterate(x, y -> y + x).limit(n).toArray();
	    }
	}
}
