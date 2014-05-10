package algo.graph;

public class MazeImpl implements Maze {

    private final Point[] points = new Point[100];
    private int pointsCursor = 0;

    @Override
    public int getStart() {
        return 0;
    }

    @Override
    public int getFinish() {
        return 1;
    }

    @Override
    public boolean isVisited(int index) {
        return points[index].isVisited();
    }

    @Override
    public void markAsVisited(int index) {
        points[index].visit();
    }

    @Override
    public int[] getConnections(int index) {
        Point[] connectionPoints = points[index].getConnections();
        int[] connections = new int[connectionPoints.length];
        for (int i = 0; i < connectionPoints.length; i++) {
            connections[i] = connectionPoints[i].getIndex();
        }
        return connections;
    }

    @Override
    public boolean hasDirectConnection(int point1, int point2) {
        Point[] connectionPoints = points[point1].getConnections();
        for (int i = 0; i < connectionPoints.length; i++) {
            if (point2 == connectionPoints[i].getIndex()) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String getTitle(int index) {
        return points[index].getTitle();
    }

    @Override
    public int addPoint(String title) {
        points[pointsCursor] = new Point(pointsCursor, title);
        return pointsCursor++;
    }

    @Override
    public void connectPoints(int index1, int index2) {
        points[index1].connect(points[index2]);
        points[index2].connect(points[index1]);
    }

    private class Point {
        Point(int index, String title) {
            this.index = index;
            this.title = title;
        }

        private final String title;
        private final int index;
        private boolean isVisited = false;
        private final Point[] connections = new Point[10];
        private int connectionsCursor = 0;

        public Point[] getConnections() {
            return connections;
        }

        public void connect(Point point) {
            connections[connectionsCursor] = point;
            connectionsCursor++;
        }

        public String getTitle() {
            return title;
        }

        public int getIndex() {
            return index;
        }

        public boolean isVisited() {
            return isVisited;
        }

        public void visit() {
            isVisited = true;
        }
    }
}
