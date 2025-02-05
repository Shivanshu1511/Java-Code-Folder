class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        for(int i =0 ;i<nums.length;i++){
            if(nums[i] == target){
                return i;
            }
            else{
                if(nums[i]>target){
                    return i;
                }
            }
        }
        return nums.length;
    }
         public static void main(String[] args){ 
        Scanner sc = new Scanner(System.in);
        int target =sc.nextInt();
        int n = sc.nextInt();
        int nums[] =new int[n];
        for(int i = 0 ; i<n ;i++){
        nums[i] = sc.nextInt();
        }
       SearchInsertPosition getd =new SearchInsertPosition  ();
       getd. searchInsert(nums,target);
    }
}

--------------------------------------------------------------------------------------------------------------------------------
/* Intuition 
-------------------------------
 Simply we Perform Searching in the given Array thorugh which we identify the target element and its index .

Approach 
-------------------------
1) initiated an pointer  [ i ] in a given array which iterate from staring to end of an array
2) if nums[i] is equal to the target then simply return its index .
3) if not then we try to find if nums[i] is greater than target than we return its index as index where we can place targeted value in the gievn array  

   Continue this process until all elements in the array have been processed.
4) Finally, if  target Element is greater than the last element of the array then return the length of an array .
*/ 