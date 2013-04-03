package problems2;

import java.util.ArrayList;
import java.util.Collections;
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
            return filterSingleLine(station1, station2, 0);
        }
        if (lines.size() == 2) {
            List<String> line1 = lines.get(0);
            List<String> line2 = lines.get(1);
            List<String> cross = intersection(line1, line2);
            String crossStation = cross.get(0);

            List<String> returnList = new ArrayList<String>();
            List<String> finalPath = filterSingleLine(crossStation, station1, 0);
            Collections.reverse(finalPath);
            List<String> addPath = filterSingleLine(crossStation, station2, 1);
            returnList.addAll(finalPath);
            returnList.addAll(addPath);
            // finalPath.addAll();
            return returnList;
        }
        return null;
    }

    private List<String> intersection(List<String> line1, List<String> line2) {
        List<String> intersected = new ArrayList<String>();
        for (String station : line1) {
            if (line2.contains(station)) {
                System.out.println(station);
                intersected.add(station);
            }
        }
        return intersected;
    }

    private List<String> filterSingleLine(String station1, String station2,
            int lineNumber) {
        List<String> line = lines.get(lineNumber);
        int station1Index = line.indexOf(station1);
        int station2Index = line.indexOf(station2);
        if (station2Index > -1 && station1Index > 1) {
            if (station1Index > station2Index) {
                List<String> reversedList = line.subList(station2Index,
                        station1Index + 1);
                Collections.reverse(reversedList);
                return reversedList;
            }
            return line.subList(station1Index, station2Index + 1);
        }
        return null;
    }
}
