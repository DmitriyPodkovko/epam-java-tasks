package ua.univer.lesson14;

import ua.univer.lesson13.kmda.User;

import java.io.*;

public class Program {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

      //  User user = new User("a","b",11);
      //  saveBinToFile(user);
        User user1 = getUserBinFromFile();
        System.out.println(user1);
    }

    private static User getUserBinFromFile() throws IOException, ClassNotFoundException {
        ObjectInputStream in= new ObjectInputStream(
                new FileInputStream("user.dat"));
        User user1 = (User)in.readObject();

        in.close();
        return user1;
    }

    private static void saveBinToFile(User user) throws IOException {
        ObjectOutputStream out = new ObjectOutputStream(
                new FileOutputStream("user.dat"));
        out.writeObject(user);
        out.close();
    }
}
