package problems2;

import java.util.List;

public interface Subway {
    void addLine(List<String> stations);

    List<String> findPath(String station1, String station2);
}
