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
        List<List<String>> targetLines = extractTargetLines(station1, station2);
        switch (targetLines.size()) {
        case 1:
            return filterSingleLine(station1, station2, targetLines.get(0));
        case 2:
            return filterTwoLines(station1, station2, targetLines.get(0),
                    targetLines.get(1));
        default:
            return null;
        }
    }

    private List<String> filterTwoLines(String station1, String station2,
            List<String> line1, List<String> line2) {
        List<String> returnList = new ArrayList<String>();
        List<String> cross = intersection(line1, line2);
        if (!cross.isEmpty()) {
            String crossStation = cross.get(0);
            List<String> part1;
            List<String> part2;
            if (line1.contains(station1)) {
                part1 = filterSingleLine(crossStation, station1, line1);
                part2 = filterSingleLine(crossStation, station2, line2);
            } else {
                part1 = filterSingleLine(crossStation, station1, line2);
                part2 = filterSingleLine(crossStation, station2, line1);
            }
            Collections.reverse(part1);
            returnList.addAll(part1);
            returnList.addAll(part2);
            return returnList;
        }
        return null;
    }

    private List<List<String>> extractTargetLines(String station1,
            String station2) {
        List<List<String>> target = new ArrayList<List<String>>();
        for (List<String> line : lines) {
            if (line.contains(station1) || line.contains(station2)) {
                if (!target.contains(line)) {
                    // System.out.println("extractTargetLines");
                    // System.out.println(line);
                    target.add(line);
                }
            }
        }
        return target;
    }

    private List<String> intersection(List<String> line1, List<String> line2) {
        List<String> intersected = new ArrayList<String>();
        for (String station : line1) {
            if (line2.contains(station)) {
                intersected.add(station);
            }
        }
        return intersected;
    }

    private List<String> filterSingleLine(String station1, String station2,
            List<String> line) {
        int station1Index = line.indexOf(station1);
        int station2Index = line.indexOf(station2);
        if (station2Index > -1 && station1Index > -1) {
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
