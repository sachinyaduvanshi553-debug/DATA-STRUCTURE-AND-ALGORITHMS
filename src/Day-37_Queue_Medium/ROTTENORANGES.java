import java.util.LinkedList;
import java.util.Queue;

public class ROTTENORANGES {

    public static int orangesRotting(int[][] grid) {
        
        if (grid == null || grid.length == 0) return 0;
        
        int rows = grid.length;
        int cols = grid[0].length;
        Queue<int[]> queue = new LinkedList<>();
        int freshCount = 0;
        
        // Add all rotten oranges to queue and count fresh oranges
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == 2) {
                    queue.offer(new int[]{i, j});
                } else if (grid[i][j] == 1) {
                    freshCount++;
                }
            }
        }
        
        if (freshCount == 0) return 0;
        
        int minutes = 0;
        int[][] dirs = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
        
        // Process BFS
        while (!queue.isEmpty()) {
            int size = queue.size();
            boolean rotted = false;
            
            for (int i = 0; i < size; i++) {
                int[] curr = queue.poll();
                
                for (int[] dir : dirs) {
                    int r = curr[0] + dir[0];
                    int c = curr[1] + dir[1];
                    
                    if (r >= 0 && r < rows && c >= 0 && c < cols && grid[r][c] == 1) {
                        grid[r][c] = 2;
                        queue.offer(new int[]{r, c});
                        freshCount--;
                        rotted = true;
                    }
                }
            }
            if (rotted) {
                minutes++;
            }
        }
        
        return freshCount == 0 ? minutes : -1;
    }

    public static void main(String[] args) {
        
        int[][] grid1 = {
            {2, 1, 1},
            {1, 1, 0},
            {0, 1, 1}
        };
        
        System.out.println("Minutes to rot all (grid1): " + orangesRotting(grid1)); // 4
        
        int[][] grid2 = {
            {2, 1, 1},
            {0, 1, 1},
            {1, 0, 1}
        };
        
        System.out.println("Minutes to rot all (grid2): " + orangesRotting(grid2)); // -1
    }
}
