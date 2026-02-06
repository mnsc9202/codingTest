package programmers.level1;


public class 부족한금액계산하기 {

	public static void main(String[] args) {
		// 0. 준비사항
		int[][] solutionArgs = {{3,20,4}};
		
		// 1. 실행
		Solution solution = new 부족한금액계산하기().new Solution();
		
		for(int[] solutionArg : solutionArgs) {
			System.out.println(solution.solution(solutionArg[0], solutionArg[1], solutionArg[2]));
		}

	}
	
	class Solution {
	    public long solution(int price, int money, int count) {
	    	
	    	// 0. 준비사항
	        long expense = 0;
	       
	        // 1. 이용료 지출 계산
	        expense = price * ((long) ((count + 1) * count) / 2);

	        return money - expense > 0 ? 0 : expense - money;
	    }
	}

}
