import java.util.*; 
class FindTargetIndicesAfterSortingArray {// Slef bulid logic and code
  // sorting
    public void targetIndices(int nums[] ) {
        for(int i = 0; i<nums.length ;i++){
            for(int j=i+1 ; j<nums.length ; j++){
                if(nums[i]>nums[j]){
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] =temp ;
                }
            }
        }
        for(int i =1;i<nums.length; i++){
        System.out.print(nums[i]+" "); 
        } 
    }
    // Bineary Search
        public int sort_Target(int nums[], int target){
          int start = 0; 
        int end = nums.length-1 ;
        while(start<= end){
          int mid = (start + end) /2 ;
          if(nums[mid]==target){
             return  mid ;
          }
          if (nums[mid] > target){
            end = mid -1 ;
          }
          else{
            start = mid+1;
          }
        } 
        return -1;
     } // printing and calling
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
    int nums[] = {1,2,5,2,3};
    int target =  sc.nextInt();
    Solution sort =new Solution();
    sort.targetIndices(nums);
    int targetIndex = sort.sort_Target(nums, target);
        System.out.println("\nTarget Element Index: " + targetIndex);


    }
}// Given Solution
/*class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> AL = new ArrayList();
        Arrays.sort(nums);
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == target) {
                AL.add(i);
            }
        }
        return AL;
    }
}*/