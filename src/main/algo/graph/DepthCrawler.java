package algo.graph;

import java.util.Arrays;

public class DepthCrawler implements MazeCrawler {
    private final Maze maze;
    private final int[] path;
    private int pathIndex = 0;

    public DepthCrawler(Maze maze) {
        this.maze = maze;
        path = new int[100];
    }

    @Override
    public int[] getPath() {
        return Arrays.copyOfRange(path, 0, pathIndex);
    }

    @Override
    public boolean run(int current, int finish) {
        maze.visit(current);
        path[pathIndex] = current;
        pathIndex++;
        int[] connections = maze.getConnections(current);
        for (int i = 0; i < connections.length; i++) {
            if (connections[i] == finish) {
                path[pathIndex] = finish;
                pathIndex++;
                return true;
            }
            if (!maze.isVisited(connections[i])) {
                boolean result = run(connections[i], finish);
                if (result) {
                    return true;
                }
            }
        }
        path[pathIndex] = 0;
        pathIndex--;
        return false;
    }
}
