package problems3;

public interface Line {
    void setTitle(String title) throws Exception;

    String getTitle();

    boolean removeStation(Station station);

    boolean addStation(Station station);

    boolean removeStation(int index);

    boolean setStation(Station station, int index);

    Station getStation(int index);
}
