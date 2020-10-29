package ge.edu.btu.slide_9.map;

import java.util.ArrayList;
import java.util.List;

public class Runner {

    public static void main(String[] args) {
        List<String> candidates = new ArrayList<>();
        candidates.add("Test 1001");
        candidates.add("Test 1002");
        candidates.add("Test 1003");
        candidates.add("Test 1004");

        Election election = new Election();
        election.initCandidates(candidates);

        election.vote("Test 1001");
        election.vote("Test 1003");
        election.vote("Test 1002");
        election.vote("Test 1003");
        election.vote("Test 1002");
        election.vote("Test 1003");
        election.vote("Test 1003");
        election.vote("Test 1001");
        election.vote("Test 1002");

        election.printResult();
    }
}


