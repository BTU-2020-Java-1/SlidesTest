package ge.edu.btu.slide_9.map;

public class Runner {

    public static void main(String[] args) {
        Election election = new Election();
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


