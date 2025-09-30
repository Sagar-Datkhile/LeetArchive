class Solution {
    public boolean isValidSudoku(char[][] board) {
        // Using hash sets for row, column, and box validation
        HashSet<String> seen = new HashSet<>();
        
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char num = board[i][j];
                
                if (num != '.') {
                    // Encode uniqueness constraints as strings
                    String rowKey = num + " in row " + i;
                    String colKey = num + " in col " + j;
                    String boxKey = num + " in box " + (i/3) + "-" + (j/3);

                    // If already present, Sudoku is invalid
                    if (!seen.add(rowKey) || !seen.add(colKey) || !seen.add(boxKey)) {
                        return false;
                    }
                }
            }
        }
        
        return true;
    }
}
