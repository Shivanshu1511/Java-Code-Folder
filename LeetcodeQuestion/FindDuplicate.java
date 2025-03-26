import java.util.Scanner;

class FindDuplicate{
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
          
                if (nums[i]==nums[i+1]){
                    return nums[i];
                }
          
        }
        return -1;
    }
     public static void main(String[] args){ 
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] =new int[n+1];
        for(int i = 0 ; i<n+1 ;i++){
        nums[i] = sc.nextInt();
        }
        FindDuplicate getd =new FindDuplicate();
       getd.findDuplicate(nums);
    }   
}