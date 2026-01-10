class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        for(int i =0;i<matrix.length;i++){
            if (matrix[i][0]<=target && matrix[i][matrix[0].length-1]>=target){
                int left = 0,right =matrix[0].length-1 ;

                while(left<=right){
                    int mid=(left+right)/2;
                    if (matrix[i][mid]<target){
                        left=mid+1;
                    }else if(matrix[i][mid]==target){
                        return true;
                    }
                    else{
                        right=mid-1;
                    }
                }

            }
        }

        return false;
        
    }
}