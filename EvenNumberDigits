class EvenNumberDigits {
    public int findNumbers(int[] nums) {
        int result = 0;
		for(int i=0; i<nums.length; i++) {
			int digits = getDigits(nums[i]);
			if(digits%2 == 0)
				result++;
		}
        return result;
    }
    
    private static int getDigits(int num) {
		int digits = 1;
		for(;;) {
			num = num/10;
			if(num >= 1)		
				digits++;
			else
				break;
		}
		return digits;
	}
}
