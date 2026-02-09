package programmers.level1;

public class 콜라문제 {

	public static void main(String[] args) {
		// 0. 준비사항
		int[][] solutionArgs = {{2, 1, 20}, {3, 1, 20}};
		
		// 1. 실행
		Solution solution = new 콜라문제().new Solution();
		
		for(int[] solutionArg : solutionArgs) {
			System.out.println(solution.solution(solutionArg[0], solutionArg[1], solutionArg[2]));
		}

	}
	
	class Solution {
	    public int solution(int a, int b, int n) {
	    	// 0. 준비사항
	    	int totalReceiveCokeCnt = 0;
	    	
	    	// 1. 계산
	    	while(n >= a) {
	    		int consumeCokeCnt = (n / a) * a;
	    		int receiveCokeCnt = (n / a) * b;
	    		totalReceiveCokeCnt += receiveCokeCnt;
	    		n += (receiveCokeCnt - consumeCokeCnt);
	    	}
	    	
	    	
	        return totalReceiveCokeCnt;
	        
	        /*
			int total = 0;

	        while (n >= a) {
	            int exchanged = n / a;      // 교환 횟수
	            int receive = exchanged * b; // 새로 받는 콜라 수
	            total += receive;
	            n = (n % a) + receive;      // 남은 병 + 새로 생긴 병
	        }
	        return total;
	         */
	    }
	}

}
