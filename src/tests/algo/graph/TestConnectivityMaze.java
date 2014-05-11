package algo.graph;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TestConnectivityMaze {
    private final ConnectivityMaze maze = new ConnectivityMaze();
    private int start;
    private int finish;
    private int middle;
    private int disconnected;

    @Test
    public void testConnectivity() {
        initMaze();
        assertTrue(maze.hasConnection(start, finish));
        assertFalse(maze.hasConnection(start, disconnected));
    }

    private void initMaze() {
        start = maze.addPoint("Start");
        finish = maze.addPoint("Finish");
        middle = maze.addPoint("Middle");
        disconnected = maze.addPoint("Disconnected");
        maze.connectPoints(start, middle);
        maze.connectPoints(middle, finish);
    }
}
