package ge.edu.btu.slide_9.map;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Election {

    private Map<String, Long> candidatesMap = new HashMap<>();

    public void initCandidates(List<String> candidates) {
        for (String candidate : candidates) {
            candidatesMap.put(candidate, 0L);
        }
    }

    public void vote(String candidate) {
        long votes = candidatesMap.get(candidate);
        candidatesMap.put(candidate, votes + 1);
    }

    public void printResult() {
        for (String candidate : candidatesMap.keySet()) {
            System.out.println(candidate + ": " + candidatesMap.get(candidate));
        }
    }
}


