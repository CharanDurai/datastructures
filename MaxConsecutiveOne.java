class MaxConsecutiveOne {
    public int findMaxConsecutiveOnes(int[] nums) {
        int result = 0;
		int currentWinsize = 0;
        for(int i=1; i<nums.length; i++) {
        	if(nums[i] ==1 && nums[i-1] ==1) {
        		currentWinsize++;
        	} else {
        		if(currentWinsize > 0 && currentWinsize > result) {
        			result = currentWinsize;         			
        		}
        		if(currentWinsize > 0)
        		   currentWinsize = 0;
        	}        		
        }
        result++;
        return result;
    }
}
