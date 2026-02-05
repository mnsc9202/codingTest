package programmers.level1;

import java.util.Arrays;

public class 제일작은수제거하기 {

	public static void main(String[] args) {
		// 0. 준비사항
		int[][] solutionArgs = {{4,3,2,1}, {10}};
		
		// 1. 실행
		Solution solution = new 제일작은수제거하기().new Solution();
		
		for(int[] solutionArg : solutionArgs) {
			System.out.println(Arrays.toString(solution.solution(solutionArg)));
		}

	}
	
	class Solution {
	    public int[] solution(int[] arr) {
	    	
	    	
	    	/*
	        // 1. 가장 작은 수 확인
	        int minNum = Arrays.stream(arr).min().getAsInt();
	        
	        // 2. 가장 작은 수 제외
	        int[] arrangeArr =  Arrays.stream(arr).filter(n -> n != minNum).toArray();
	        
	        
	        return arrangeArr.length == 0 ? new int[] {-1} : arrangeArr;
	        */
	    	
	    	// 1. 가장 작은 수 확인
	    	int minNum = arr[0];
	    	for(int n : arr) if(minNum > n) minNum = n;
	    	
	    	// 2. 가장 작은 수 제외
	    	int[] arrangeArr = new int[arr.length - 1];
	    	int index = 0;
	    	boolean isRemove = false;
	    	for(int n : arr) {
	    		if(!isRemove && n == minNum) {
	    			isRemove = true;
	    			continue;
	    		}
	    		arrangeArr[index++] = n;
	    	}
	    	
	    	return arrangeArr.length == 0 ? new int[] {-1} : arrangeArr;
	    }
	}

}
