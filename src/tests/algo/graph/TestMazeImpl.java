package algo.graph;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TestMazeImpl {

    private final Maze maze = new MazeImpl();
    private int start;
    private int finish;

    @Test
    public void testThatStartDirectlyConnectedToFinish() {
        initSimpleMaze();
        assertTrue(maze.hasDirectConnection(start, finish));
        assertTrue(maze.hasDirectConnection(finish, start));
        assertEquals(1, maze.getConnections(start).length);
        assertEquals(1, maze.getConnections(finish).length);
    }

    @Test
    public void testThatPointCanBeVisited() {
        initSimpleMaze();
        assertFalse(maze.isVisited(start));
        assertFalse(maze.isVisited(finish));
        maze.visit(start);
        assertTrue(maze.isVisited(start));
        maze.visit(finish);
        assertTrue(maze.isVisited(finish));
    }

    private void initSimpleMaze() {
        start = maze.addPoint("Start");
        finish = maze.addPoint("Finish");
        maze.connectPoints(start, finish);
    }
}
