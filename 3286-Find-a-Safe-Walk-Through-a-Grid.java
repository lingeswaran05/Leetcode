class Solution {

    int[][] dir = {
        {1, 0},
        {-1, 0},
        {0, 1},
        {0, -1}
    };

    public boolean backtrack(List<List<Integer>> grid, int x, int y, int health, boolean[][] visited) {

        int n = grid.size();
        int m = grid.get(0).size();

        if (x < 0 || x >= n || y < 0 || y >= m)
            return false;

        if (visited[x][y])
            return false;

        if (grid.get(x).get(y) == 1)
            health--;

        if (health <= 0)
            return false;

        if (x == n - 1 && y == m - 1)
            return true;

        visited[x][y] = true;

        for (int[] d : dir) {
            int nx = x + d[0];
            int ny = y + d[1];

            if (backtrack(grid, nx, ny, health, visited))
                return true;
        }

        visited[x][y] = false;

        return false;
    }

    public boolean findSafeWalk(List<List<Integer>> grid, int health) {

        boolean[][] visited = new boolean[grid.size()][grid.get(0).size()];

        return backtrack(grid, 0, 0, health, visited);
    }
}