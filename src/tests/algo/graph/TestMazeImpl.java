package algo.graph;

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
}
