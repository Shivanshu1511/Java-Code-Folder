class   RemoveElement{
    public int removeElement(int[] nums, int val) {
        int i =0 ;
        for(int j =0;j<nums.length;j++){    // two pointer approach is applied
          if (nums[j] != val) {  
              nums[i] = nums[j];   
              i++;
               }
            }
            return i ;  //return the no of not trageted value 
        }
         public static void main(String[] args){ 
        Scanner sc = new Scanner(System.in);
        int val =sc.nextInt();
        int n = sc.nextInt();
        int nums[] =new int[n];
        for(int i = 0 ; i<n ;i++){
        nums[i] = sc.nextInt();
        }
        RemoveElement getd =new RemoveElement ();
       getd. removeElement(nums,val);
    }
        
}


----------------------------------------------------------------------------------------------------------------------------------------------

/*Intuition
------------------------
The intuition behind this solution is to iterate through the array and keep track of two pointers: index and i. The index pointer represents the position        where the next non-target element should be placed, while the i pointer iterates through the array elements. By overwriting the target elements with non-   target elements, the solution effectively removes all occurrences of the target value from the array.

Approach
------------------------
1) Initialize index to 0, which represents the current position for the next non-target element.
    Iterate through each element of the input array using the i pointer.
2)   For each element nums[i], check if it is equal to the target value.
3)   If nums[i] is not equal to val, it means it is a non-target element.
      Set nums[index] to nums[i] to store the non-target element at the current index position.
      Increment index by 1 to move to the next position for the next non-target element.

    Continue this process until all elements in the array have been processed.

4)   Finally, return the value of index, which represents the length of the modified array.*/
