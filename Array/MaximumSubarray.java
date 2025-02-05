class MaximumSubarray{
    public int maxSubArray(int[] nums) {
        int largest_sum = Integer.MIN_VALUE;
        int new_sum = 0;
        for(int i=0;i<nums.length;i++){
      // [ new_sum += nums[i];  //   new_sum =0;   //  changes requied for special case]
  // For each element, update new_sum to either the current element or the sum of the current element and new_sum
            new_sum = Math.max(nums[i], new_sum + nums[i]);
            
            // Update largest_sum if new_sum is greater                                                       //  if(new_sum<0){
                                                                   
                                                                         
            largest_sum =Math.max(new_sum,largest_sum);
        }
         
         return largest_sum ;
    }
    public static void main(String[] args ){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[]= new int[n];
        for(int i =0; i<n;i++){
            nums[i]= sc.nextInt();
         }  
         MaximumSubarray gt = new MaximumSubarray();
         gt.maxSubArray( nums);
    }
}