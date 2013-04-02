package problems2;

import java.util.ArrayList;
import java.util.List;

public class SubwayImpl implements Subway {

    List<List<String>> lines = new ArrayList<List<String>>();

    @Override
    public void addLine(List<String> stations) {
        lines.add(stations);
    }

    @Override
    public List<String> findPath(String station1, String station2) {
        if (lines.size() == 1) {
            return filterSingleLine(station1, station2);
        }
        return null;
    }

    private List<String> filterSingleLine(String station1, String station2) {
        List<String> line = lines.get(0);
        return line.subList(line.indexOf(station1), line.indexOf(station2) + 1);
    }
}
