package algo.graph;

public interface Maze {
    public int getStart();

    public int getFinish();

    public boolean isVisited(int index);

    public void markAsVisited(int index);

    public int[] getConnections(int index);

    public String getTitle(int index);

    public int addPoint(String title);

    public void connectPoints(int index1, int index2);

    public boolean hasDirectConnection(int point1, int point2);
}
