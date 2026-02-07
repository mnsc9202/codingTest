package programmers.level1;

import java.util.Arrays;

public class 최대공약수와최소공배수 {

	public static void main(String[] args) {
		// 0. 준비사항
		int[][] solutionArgs = {{3, 12}, {2, 5}};
		
		// 1. 실행
		Solution solution = new 최대공약수와최소공배수().new Solution();
		
		for(int[] solutionArg : solutionArgs) {
			System.out.println(Arrays.toString(solution.solution(solutionArg[0], solutionArg[1])));
		}

	}
	
	
	class Solution {
		/*
	    public int[] solution(int n, int m) {
	        
	        // 0. 준비사항
	        int greatestCommonDivisor = 0; // 최대공약수
	        int leastCommonMultiple = 0; // 최소공배수
	        
	        
	        // 1. 최대공약수 확인
	        for(int i = 1; i <= Math.min(n, m); i ++) {
	        	if(n % i == 0 && m % i == 0) greatestCommonDivisor = i;
	        }
	        
	        // 2. 최소공배수 확인
	        for(int i = Math.min(n, m), j = 1; i <= n * m; j++) {
	        	if(i == 1) continue;
	        	int product = i * j;
	        	if(product % n == 0 && product % m == 0) {
	        		leastCommonMultiple = product;
	        		break;
	        	}
	        }
	        
	        
	        return new int[]{greatestCommonDivisor, leastCommonMultiple};
	    }
	    	*/
		public int[] solution(int n, int m) {
	        int gcd = gcd(n, m);
	        int lcm = n / gcd * m;
	        return new int[]{gcd, lcm};
	    }

	    private int gcd(int a, int b) {
	        while (b != 0) {
	            int r = a % b;
	            a = b;
	            b = r;
	        }
	        return a;
	    }
	}

		

}
