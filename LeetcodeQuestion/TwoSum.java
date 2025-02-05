class TwoSum {
    public int[] twoSum(int[] nums, int target) {
       for(int i =0 ;i<nums.length-1;i++){
           for(int j =i+1; j<nums.length;j++){
               if(nums[i] + nums[j] == target){
                 return new int[] { i,j};
           }
       }
    }
    return new int[]{};
}
     public static void main(String[] args){ // main method 
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] =new int[n];
        for(int i = 0 ; i<n ;i++){
        nums[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        TwoSum getd =new TwoSum();
       getd.twoSum(nums,target);
    }


}