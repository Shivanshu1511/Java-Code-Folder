import java.util.Scanner;

public class MissingNumber {
    public static int missingNumber(int[] nums) {
        int n =nums.length;
        int sum = (n*(n+1))/2;
      //  Arrays.sort(nums);
        for(int i =0;i<nums.length;i++){
            sum -= nums[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nums[]={0,2,3};
        // MissingNumber call = new MissingNumber();
        int result = MissingNumber.missingNumber(nums);
        System.out.println("Missing Number is : "+result);
    }
    
}
