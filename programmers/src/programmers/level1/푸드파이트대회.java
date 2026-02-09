package programmers.level1;


public class 푸드파이트대회 {

	public static void main(String[] args) {
		// 0. 준비사항
		int[][] solutionArgs = {{1,3,4,6}, {1,7,1,2}};
		
		// 1. 실행
		Solution solution = new 푸드파이트대회().new Solution();
		
		for(int[] solutionArg : solutionArgs) {
			System.out.println(solution.solution(solutionArg));
		}

	}
	
	class Solution {
	    public String solution(int[] foods) {
	        // 0. 준비사항
	    	StringBuilder sb = new StringBuilder();
	        
	    	// 1. 음식 사용 개수 확인
	        for(int i = 1; i < foods.length; i++) {
	        	int food = foods[i];
	        	
	        	int eatCnt = food / 2;
	        	
	        	for(int j = 1; j <= eatCnt; j++) {
	        		sb.append(i);
	        	}
	        }
	        
	        // 2. 물 사용
	        sb.append("0");
	        
	        // 3. 상대방 음식 사용 개수 확인
	        sb.append(new StringBuilder(sb.substring(0, sb.length()-1)).reverse());
	        
	        return sb.toString();
	        
	        /*
             StringBuilder left = new StringBuilder();

	        for (int i = 1; i < foods.length; i++) {
	            for (int k = 0; k < foods[i] / 2; k++) left.append(i);
	        }
	
	        StringBuilder right = new StringBuilder(left).reverse();
	        return left.toString() + "0" + right.toString();
	         */
	    }
	}

}
