public class Solution {
    public void solve(char[][] board) {
        if (board == null || board.length == 0 || board[0].length == 0) {
            return;
        }
        
        int m = board.length;
        int n = board[0].length;
        
        // Step 1: DFS from all border 'O' cells
        // First row
        for (int j = 0; j < n; j++) {
            if (board[0][j] == 'O') {
                dfs(board, 0, j);
            }
        }
        
        // Last row
        for (int j = 0; j < n; j++) {
            if (board[m-1][j] == 'O') {
                dfs(board, m-1, j);
            }
        }
        
        // First column
        for (int i = 0; i < m; i++) {
            if (board[i][0] == 'O') {
                dfs(board, i, 0);
            }
        }
        
        // Last column
        for (int i = 0; i < m; i++) {
            if (board[i][n-1] == 'O') {
                dfs(board, i, n-1);
            }
        }
        
        // Step 2: Flip the board
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 'O') {
                    board[i][j] = 'X';  // Captured region
                } else if (board[i][j] == '#') {
                    board[i][j] = 'O';  // Uncaptured region
                }
            }
        }
    }
    
    private void dfs(char[][] board, int i, int j) {
        int m = board.length;
        int n = board[0].length;
        
        // Base cases
        if (i < 0 || i >= m || j < 0 || j >= n || board[i][j] != 'O') {
            return;
        }
        
        // Mark as '#' (temporary marker for uncaptured)
        board[i][j] = '#';
        
        // Recurse in 4 directions
        dfs(board, i+1, j);   // down
        dfs(board, i-1, j);   // up
        dfs(board, i, j+1);   // right
        dfs(board, i, j-1);   // left
    }
}