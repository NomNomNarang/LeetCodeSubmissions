class Solution {
    public int smallestIndex(int[] nums) {
        //BASICALLY THE INDEX SHOULD MATCH WITH THE SUM OF DIGITS
        for(int i=0;i<nums.length;i++){
            if(i==sumOfDigit(nums[i])){
                return i;
            }

        }
        return -1;
    }

    static int sumOfDigit(int num){
        int sum = 0;
        while (num > 0) {
        sum=sum+ num % 10;
        num=num/10;
        }
        return sum;
    }
}