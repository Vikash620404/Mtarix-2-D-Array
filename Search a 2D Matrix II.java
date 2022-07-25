Input: matrix = [[1,4,7,11,15],[2,5,8,12,19],[3,6,9,16,22],[10,13,14,17,24],[18,21,23,26,30]], target = 5
Output: true

  
  
  
  
  
  
  class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(matrix[i][j]==target) return true;
            }
        }
return false;
    }
}


//O(N*M)



class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row=0;
int col=matrix[0].length-1;
while(row<matrix.length&&col>=0){
    if(matrix[row][col]==target) return true;
else if(matrix[row][col]<target){
row++;}
else{ col--;}
}
return false;
    }
}

//O(N+M)




