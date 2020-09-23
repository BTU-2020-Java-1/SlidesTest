package ge.edu.btu.slide_3.getandset;

public class Runner {

    public static void main(String[] args) {
        User user = new User();
        user.setUsername("Username");
        user.setActive(true);
        System.out.println(user.getUsername() + " " + user.isActive());
    }
}


