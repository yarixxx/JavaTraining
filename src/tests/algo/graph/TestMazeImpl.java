package algo.graph;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TestMazeImpl {

    private final Maze maze = new MazeImpl();

    @Test
    public void testThatStartDirectlyConnectedToFinish() {
        int start = maze.addPoint("Start");
        int finish = maze.addPoint("Finish");
        maze.connectPoints(start, finish);
        maze.hasDirectConnection(start, finish);
        maze.hasDirectConnection(finish, start);
    }

    @Test
    public void testThatPointCanBeVisited() {
        int start = maze.addPoint("Start");
        int finish = maze.addPoint("Finish");
        maze.connectPoints(start, finish);
        assertFalse(maze.isVisited(start));
        maze.visit(start);
        assertTrue(maze.isVisited(start));
    }
}
