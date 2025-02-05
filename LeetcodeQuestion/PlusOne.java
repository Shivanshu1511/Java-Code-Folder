class Solution {
    public int[] plusOne(int[] digits) {
       for (int i = digits.length - 1; i >= 0; i--) {// iterate the loop from right to left in an array
	if (digits[i] < 9) {// if digit is less than 9 then it simpily increased its value by 1
		digits[i]++;
		return digits;
	}
	digits[i] = 0;// if digit is equals to 9 then its convert into 0
}
digits=new int[digits.length + 1];//new array is created if element=9 then its left most element is increased by 1 
digits[0] = 1;
return digits;
    }
    public static void main(String[] args){ 
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int digits[] =new int[n];
        for(int i = 0 ; i<n ;i++){
        digits[i] = sc.nextInt();
        }
       Solution getd =new Solution ();
        getd.plusOne(digits);

       
    }
}


I