public class missingNumber {
     public static int mn(int[] nums) {
        // int n = nums.length;
        // int expectedSum = n * (n + 1) / 2;
        // int actualSum = 0;
        
        // for (int i = 0; i < n; i++) {
        //     actualSum += nums[i];
        // }

        // return expectedSum - actualSum;
        int sum  =0;
        int count =0;
        for(int i=0;i<nums.length;i++){
            sum += nums[i];
            if(nums[i]!=0){

                count ++;
            }

        }
        System.out.println(count);
        
        int missing = sum/count;
        return missing;

    }
    public static void main(String[] args) {
        int nums[] = {1,0,3};
        System.out.println(mn(nums));
    }
    
}
