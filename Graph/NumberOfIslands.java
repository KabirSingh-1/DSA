import java.util.LinkedList;
import java.util.Queue;

public class NumberOfIslands {
    public static void byDfs(char[][] grid, int i, int j) {
        if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] == '0') {
            return;
        }
        grid[i][j] = '0';

        byDfs(grid, i + 1, j);
        byDfs(grid, i - 1, j);
        byDfs(grid, i, j + 1);
        byDfs(grid, i, j - 1);
    }

    public static int numberIslands1(char[][] grid) {
        if (grid == null || grid.length == 0) {
            return 0;
        }
        int islands = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1') {
                    islands++;
                    byDfs(grid, i, j);
                }
            }
        }
        return islands;
    }

    public static void bfs(char[][] grid, int i, int j) {
        int row = grid.length;
        int col = grid[0].length;
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[] { i, j });
        grid[i][j] = '0';
        int[][] directions = { { 1, 0 }, { -1, 0 }, { 0, 1 }, { 0, -1 } };
        while (!q.isEmpty()) {
            int curr[] = q.poll();
            int r = curr[0], c = curr[1];

            for (int[] d : directions) {
                int nr = r + d[0];
                int nc = c + d[1];

                if (nr >= 0 && nc >= 0 && nr < row && nc < col && grid[nr][nc] == '1') {
                    q.add(new int[] { nr, nc });
                    grid[nr][nc] = '0';
                }

            }

        }
    }

    public static int numberIslands2(char[][] grid) {
        if (grid == null || grid.length == 0) {
            return 0;
        }
        int islands = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1') {
                    islands++;
                    bfs(grid, i, j);
                }
            }
        }
        return islands;
    }

    public static void main(String[] args) {
        char[][] gridDFS = {
                { '1', '1', '0', '0', '0' },
                { '1', '1', '0', '0', '0' },
                { '0', '0', '1', '0', '0' },
                { '0', '0', '0', '1', '1' }
        };

        char[][] gridBFS = new char[gridDFS.length][gridDFS[0].length];
        for (int i = 0; i < gridDFS.length; i++) {
            gridBFS[i] = gridDFS[i].clone();
        }

        System.out.println("DFS Number of Islands = " + numberIslands1(gridDFS));
        System.out.println("BFS Number of Islands = " + numberIslands2(gridBFS));

    }
}
