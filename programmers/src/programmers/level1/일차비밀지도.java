package programmers.level1;

import java.util.Arrays;

public class 일차비밀지도 {

	public static void main(String[] args) {
		// 0. 준비사항
		int[][][] solutionArgs = {
								{{5}, {9, 20, 28, 18, 11}, {30, 1, 21, 17, 28}},
								{{6}, {46, 33, 33 ,22, 31, 50}, {27 ,56, 19, 14, 14, 10}},
								};
		
		// 1. 실행
		Solution solution = new 일차비밀지도().new Solution();
		
		for(int[][] solutionArg : solutionArgs) {
			System.out.println(Arrays.toString(solution.solution(solutionArg[0][0], solutionArg[1], solutionArg[2])));
		}

	}
	
	
	class Solution {
	    public String[] solution(int n, int[] arr1, int[] arr2) {
	    	// 0. 준비사항
	        String[][] secretMap = new String[n][n];
	        
	        // 1. 지도 확인
	        checkSecretMap(secretMap, arr1);
	        checkSecretMap(secretMap, arr2);
	        
	        // 2. 결과 생성
	        return Arrays.stream(secretMap).map(el -> String.join("", el)).toArray(String[]::new);
	    }
	    
	    public void checkSecretMap(String[][] secretMap, int[] arr) {
	    	 for(int i = 0; i < arr.length; i++) {
	        	// 이진수 변환
	    		String binaryStr = Integer.toBinaryString(arr[i]);
	    		
	    		// 자리수 확인
	    		String arrangeBinaryStr = "0".repeat(arr.length - binaryStr.length()) + binaryStr;
	    		
	        	
	        	// 지도 표시
	        	for(int j = 0; j < arrangeBinaryStr.length(); j++) {
	        		if("#".equals(secretMap[i][j])) continue;
	        		secretMap[i][j] = arrangeBinaryStr.charAt(j) == '1' ? "#" : " ";
	        	}
	        }
	    }
	}

}
