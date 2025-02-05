// two pointers approach is implemented
 


class RemoveDuplicatesfromSortedArray {
    public int removeDuplicates(int[] nums) {
if (nums.length == 0) return 0;
int i = 0;
for (int j = 1; j < nums.length; j++) {
    if (nums[j] != nums[i]) {// if elements are not equals then loops begin 
        i++;//update i 
        nums[i] = nums[j];//updated value of updated i
    }
}
return i + 1; // no of unique elements
}
 public static void main(String[] args){ // main method 
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] =new int[n];
        for(int i = 0 ; i<n ;i++){
        nums[i] = sc.nextInt();
        }
 RemoveDuplicatesfromSortedArraygetd =newRemoveDuplicatesfromSortedArray();
       getd.removeDuplicates(nums);
    }

}