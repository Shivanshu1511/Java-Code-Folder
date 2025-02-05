
public class Solution {
    public int funNcR(int n, int r) {
        int res = 1;
        for (int i = 0; i < r; i++) {
            res = res * (n - i);
            res = res / (i + 1);
        }
        return res;
    }

    public int[][] printtriangle(int r) {
        int ans[][] = new int[r][];
        for (int i = 0; i < r; i++) {
            ans[i] = new int[i + 1];
            for (int j = 0; j <= i; j++) {
                ans[i][j] = funNcR(i, j);
            }
        }
        return ans;
    }
     public  static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int r= sc.nextInt();
    
        Solution gt = new Solution();
        gt. printtriangle( r);
     }
}