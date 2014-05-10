package algo.graph;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class TestMazeCrawler {
    private final Maze maze = new MazeImpl();
    private MazeCrawler mazeCrawler;
    private int start;
    private int finish;

    private final int[] SIMPLE_PATH = { 0, 1 };
    private final int[] PATH1 = { 0, 2, 1 };
    private final int[] PATH3 = { 0, 2, 3, 1 };

    @Test
    public void testPathForSimpleMaze() {
        initSimpleMaze();
        mazeCrawler = new MazeCrawler(maze);
        mazeCrawler.run(start, finish);
        assertArrayEquals(SIMPLE_PATH, mazeCrawler.getPath());
    }

    @Test
    public void testPathForMaze1() {
        initMaze1();
        mazeCrawler = new MazeCrawler(maze);
        mazeCrawler.run(start, finish);
        assertArrayEquals(PATH1, mazeCrawler.getPath());
    }

    @Test
    public void testPathForMaze2() {
        initMaze2();
        mazeCrawler = new MazeCrawler(maze);
        mazeCrawler.run(start, finish);
        // Path should not be changed
        assertArrayEquals(PATH1, mazeCrawler.getPath());
    }

    @Test
    public void testPathForMaze3() {
        initMaze3();
        mazeCrawler = new MazeCrawler(maze);
        mazeCrawler.run(start, finish);
        assertArrayEquals(PATH3, mazeCrawler.getPath());
    }

    private void initSimpleMaze() {
        start = maze.addPoint("Start");
        finish = maze.addPoint("Finish");
        maze.connectPoints(start, finish);
    }

    private void initMaze1() {
        start = maze.addPoint("Start");
        finish = maze.addPoint("Finish");
        int middle = maze.addPoint("Middle");
        maze.connectPoints(start, middle);
        maze.connectPoints(middle, finish);
    }

    private void initMaze2() {
        start = maze.addPoint("Start");
        finish = maze.addPoint("Finish");
        int middle = maze.addPoint("Middle");
        int deadEnd = maze.addPoint("Dead End");
        maze.connectPoints(start, middle);
        maze.connectPoints(middle, deadEnd);
        maze.connectPoints(middle, finish);
    }

    private void initMaze3() {
        start = maze.addPoint("Start");
        finish = maze.addPoint("Finish");
        int middle1 = maze.addPoint("Middle 1");
        int middle2 = maze.addPoint("Middle 2");
        int deadEnd = maze.addPoint("Dead End");
        maze.connectPoints(start, middle1);
        maze.connectPoints(middle1, deadEnd);
        maze.connectPoints(middle1, middle2);
        maze.connectPoints(middle2, finish);
    }
}
