class ValidMountainArray {
    public boolean validMountainArray(int[] nums) {
        	int i = 0;
	boolean result = false;
	while(i < nums.length-1 && nums[i] < nums[i+1]) {
		i++;
		result = true;
	}
	if(!result)
		return false;
	result = false;
	while(i < nums.length-1 && nums[i] > nums[i+1]) {
	    i++;
	    result = true;
	}
	return result && i+1 == nums.length;
    }
}
