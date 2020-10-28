package ge.edu.btu.slide_9.map;

import java.util.HashMap;
import java.util.Map;

public class Election {

    private Map<String, Long> candidatesMap = new HashMap<>();

    public void vote(String candidate) {
        if (!candidatesMap.containsKey(candidate)) {
            candidatesMap.put(candidate, 0L);
        }
        candidatesMap.put(candidate, candidatesMap.get(candidate) + 1);
    }

    public void printResult() {
        for (String candidate : candidatesMap.keySet()) {
            System.out.println(candidate + ": " + candidatesMap.get(candidate));
        }
    }
}


