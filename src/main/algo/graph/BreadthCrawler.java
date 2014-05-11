package algo.graph;

import java.util.Arrays;

public class BreadthCrawler implements MazeCrawler {

    private final Maze maze;
    private final int[] queue;
    private int queueCursor = 0;

    public BreadthCrawler(Maze maze) {
        this.maze = maze;
        queue = new int[100];
    }

    @Override
    public boolean run(int start, int finish) {
        queue[queueCursor] = start;
        boolean doContinue = true;
        while (doContinue) {
            maze.visit(queue[queueCursor]);
            int[] connections = maze.getConnections(queue[queueCursor]);
            boolean isAdded = false;
            for (int i = 0; i < connections.length; i++) {
                if (connections[i] == finish) {
                    queueCursor++;
                    queue[queueCursor] = connections[i];
                    return true;
                }
                if (!maze.isVisited(connections[i])) {
                    queueCursor++;
                    queue[queueCursor] = connections[i];
                    isAdded = true;
                }
            }

            if (!isAdded) {
                queue[queueCursor] = 0;
                if (queueCursor > 0) {
                    queueCursor--;
                } else {
                    doContinue = false;
                }
            }

        }
        return false;
    }

    @Override
    public int[] getPath() {
        return Arrays.copyOfRange(queue, 0, queueCursor + 1);
    }

}
