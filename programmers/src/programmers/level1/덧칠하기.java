package programmers.level1;

public class 덧칠하기 {

	public static void main(String[] args) {
		// 0. 준비사항
		int[][][] solutionArgs = {
								{{8}, {4}, {2,3,6}},
								{{5}, {4}, {1,3}},
								{{4}, {1}, {1,2,3,4}},
								};
		
		// 1. 실행
		Solution solution = new 덧칠하기().new Solution();
		
		for(int[][] solutionArg : solutionArgs) {
			System.out.println(solution.solution(solutionArg[0][0], solutionArg[1][0], solutionArg[2]));
		}

	}
	
	class Solution {
	    public int solution(int n, int m, int[] section) {
	    	
	    	// 	0. 준비사항
	        int paintingCnt = 0;
	        int lastPaintIndex = section[0] - 1;
	        
	        // 1. 페인트 칠하기
	        for(int i = 0; i < section.length; i++) {
	        	if(lastPaintIndex >= section[i]) continue;
	        	lastPaintIndex = section[i] + m - 1;
	        	paintingCnt++;
	        	if(lastPaintIndex >= n) return paintingCnt;
	        }
	        
	        return paintingCnt;
	    }
	}

}
