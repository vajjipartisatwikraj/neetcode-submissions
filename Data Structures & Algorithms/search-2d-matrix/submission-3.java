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

        int low = 0;
        int high = rows - 1;
        int rowNum = -1;

        while(low <= high){
            int mid = low + (high - low)/2;

            if(matrix[mid][0] <= target && target <= matrix[mid][cols - 1]){
                rowNum = mid;
                break;
            } 
            else if(target < matrix[mid][0]){
                high = mid - 1;
            } 
            else {
                low = mid + 1;
            }
        }

        if(rowNum == -1) return false;

        return binSearch(matrix[rowNum], target);
    }
}