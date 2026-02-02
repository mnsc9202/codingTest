package programmers.level1;

import java.util.stream.IntStream;

public class 약수의합 {

	public static void main(String[] args) {
		// 0. 준비사항
		int[] solutionArgs = {1,2,3,4};
		
		// 1. 실행
		Solution solution = new 약수의합().new Solution();
		
		for(int solutionArg : solutionArgs) {
			System.out.println(solution.solution(solutionArg));
		}

	}
	
	class Solution {
	    public int solution(int n) {
//	        return IntStream.iterate(n, x -> x-1).limit(n).filter(x -> n % x == 0).sum();
	    	int sum = 0;
	        for (int i = 1; i * i <= n; i++) {
	            if (n % i == 0) {
	                sum += i;
	                if (i != n / i) {
	                    sum += n / i;
	                }
	            }
	        }
	        return sum;
	    }
	}

}
