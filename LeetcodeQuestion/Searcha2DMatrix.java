class Searcha2DMatrix{
public boolean searchMatrix(int matrix[][], int target) {
        int low = 0;
        int high = matrix.length*matrix[0].length-1;
        int n = matrix.length; 
        int m = matrix[0].length; 

        while(low<=high){
            int mid =(low + high)/2;
            int midValue = matrix[mid / matrix[0].length][mid % matrix[0].length];
            if (midValue== target){
                return true;
            }else if (midValue>target){
                high = mid-1;
            } else{
                low = mid+1;
            }
        }

     return false;   
    }
    public  static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        int n = sc.nextInt();
        int m = sc.nextInt();
        int matrix[][] =new int[n][m];
        for(int i=0;i<n;i++){
            for(int j =0;j<m;j++){
                matrix[i][j] =sc.nextInt();
            }
        }
        Searcha2DMatrix gt = new Searcha2DMatrix();
        gt.searchMatrix( matrix,  target) ;

    }
}