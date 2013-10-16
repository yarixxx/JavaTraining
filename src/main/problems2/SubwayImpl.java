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

    private List<String> getPathWithOneChange(String station1, String station2,
            List<String> line1, List<String> line2, List<String> cross) {
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
        part1.addAll(part2);
        return part1;
    }

    private List<String> getPathWithTwoChanges(String station1,
            String station2, List<String> line1, List<String> line2) {
        List<List<String>> connectedLines1 = getConnectedLines(line1);
        List<List<String>> connectedLines2 = getConnectedLines(line2);
        List<String> interConnectedLine = getInterConnected(connectedLines1,
                connectedLines2);
        String crossStation1 = intersection(line1, interConnectedLine).get(0);
        String crossStation2 = intersection(line2, interConnectedLine).get(0);

        List<String> part1 = filterSingleLine(station2, crossStation1, line1);
        List<String> part2 = filterSingleLine(station1, crossStation2, line2);

        List<String> connectingPart = filterSingleLine(crossStation1,
                crossStation2, interConnectedLine);

        Collections.reverse(connectingPart);
        part2.addAll(connectingPart);
        Collections.reverse(part1);
        part2.addAll(part1);

        return part2;
    }

    private List<String> filterTwoLines(String station1, String station2,
            List<String> line1, List<String> line2) {
        List<String> cross = intersection(line1, line2);
        if (!cross.isEmpty()) {
            return getPathWithOneChange(station1, station2, line1, line2, cross);
        }
        return getPathWithTwoChanges(station1, station2, line1, line2);
    }

    private List<String> getInterConnected(List<List<String>> connectedLines1,
            List<List<String>> connectedLines2) {
        for (List<String> line1 : connectedLines1) {
            for (List<String> line2 : connectedLines2) {
                List<String> line = intersection(line1, line2);
                if (!line.isEmpty()) {
                    return line;
                }
            }
        }
        return null;
    }

    private List<List<String>> getConnectedLines(List<String> line1) {
        List<List<String>> connected = new ArrayList<List<String>>();
        for (List<String> line : lines) {
            if (!line.equals(line1)) {
                if (!intersection(line1, line).isEmpty()) {
                    connected.add(line);
                }
            }
        }
        return connected;
    }

    private List<List<String>> extractTargetLines(String station1,
            String station2) {
        List<List<String>> target = new ArrayList<List<String>>();
        for (List<String> line : lines) {
            if (line.contains(station1) || line.contains(station2)) {
                if (!target.contains(line)) {
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
                return new ArrayList<String>(reversedList);
            }
            return new ArrayList<String>(line.subList(station1Index,
                    station2Index + 1));
        }
        return null;
    }
}
