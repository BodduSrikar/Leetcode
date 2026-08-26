public class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List result = new ArrayList<>();
        
        // Edge case handling for empty matrices
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return result;
        }
        
        // Initialize boundary pointers
        int top = 0;
        int bottom = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;
        
        // Loop until boundaries cross over each other
        while (top <= bottom && left <= right) {
            
            // 1. Traverse from left to right along the top boundary
            for (int j = left; j <= right; j++) {
                result.add(matrix[top][j]);
            }
            top++; // Compress the top boundary downward
            
            // 2. Traverse from top to bottom along the right boundary
            for (int i = top; i <= bottom; i++) {
                result.add(matrix[i][right]);
            }
            right--; // Compress the right boundary leftward
            
            // 3. Traverse from right to left along the bottom boundary
            if (top <= bottom) { // Check condition to avoid duplicate row processing
                for (int j = right; j >= left; j--) {
                    result.add(matrix[bottom][j]);
                }
                bottom--; // Compress the bottom boundary upward
            }
            
            // 4. Traverse from bottom to top along the left boundary
            if (left <= right) { // Check condition to avoid duplicate column processing
                for (int i = bottom; i >= top; i--) {
                    result.add(matrix[i][left]);
                }
                left++; // Compress the left boundary rightward
            }
        }
        
        return result;
    }
}
