package programmers.level1;


public class 카드뭉치 {

	public static void main(String[] args) {
		// 0. 준비사항
		String[][][] solutionArgs = {
				{{"i", "drink", "water"}, {"want", "to"}, {"i", "want", "to", "drink", "water"}},
				{{"i", "water", "drink"}, {"want", "to"}, {"i", "want", "to", "drink", "water"}}
		};
		
		// 1. 실행
		Solution solution = new 카드뭉치().new Solution();
		
		for(String[][] solutionArg : solutionArgs) {
			System.out.println(solution.solution(solutionArg[0], solutionArg[1], solutionArg[2]));
		}

	}
	
	
	class Solution {
	    public String solution(String[] cards1, String[] cards2, String[] goal) {
	    	// 0. 준비사항
	    	int usedIndexOfCard1 = 0;
	    	int usedIndexOfCard2 = 0;
	    	
	    	// 1. 확인
	    	for(String goalStr : goal) {
	    		if(usedIndexOfCard1 < cards1.length && cards1[usedIndexOfCard1].equals(goalStr)) {
	    			usedIndexOfCard1++;
	    		}else if(usedIndexOfCard2 < cards2.length && cards2[usedIndexOfCard2].equals(goalStr)) {
	    			usedIndexOfCard2++;
	    		} else {
	    			return "No";
	    		}
	    	
	    	}
	        return  "Yes";
	    }
	}

}
