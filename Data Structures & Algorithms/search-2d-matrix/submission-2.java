class Solution {

    public static boolean binSearch(int[] nums, int target){
        int low = 0;
        int high = nums.length - 1;

        while(low <= high){
            int mid = low + (high - low)/2;

            if(nums[mid] == target){
                return true;
            }else if(target < nums[mid]){
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }

        return false;
    }

    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int rowNum = 0;

        for (int i = 0; i < rows; i++) {
            int rowFirst = matrix[i][0];
            int rowLast = matrix[i][cols - 1];
            
            if (target >= rowFirst && target <= rowLast) {
                rowNum = i;
                break;
            }
        }

        boolean isFound = binSearch(matrix[rowNum], target);
        return isFound;
    }
}
