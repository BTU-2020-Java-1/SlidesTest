package ge.edu.btu.slide_7.serialization;

import java.io.*;

public class Runner {

    public static void main(String[] args) {
        File file = new File("resource/user.txt");
        User user1 = new User("Test Username", "Test Password");
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(file))) {
            out.writeObject(user1);
        } catch (IOException ex) {
            System.out.println("სერიალიზაციისას დაფიქსირდა გაუთვალისწინებელი შეცდომა, " + ex.getMessage());
        }

        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(file))) {
            User user2 = (User) in.readObject();
            System.out.println(user2);
        } catch (IOException | ClassNotFoundException ex) {
            System.out.println("დესერიალიზაციისას დაფიქსირდა გაუთვალისწინებელი შეცდომა, " + ex.getMessage());
        }
    }
}


