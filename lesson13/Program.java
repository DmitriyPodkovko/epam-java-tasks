package ua.univer.lesson13;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class Program {
    public static void main(String[] args) throws IOException {
        System.out.println("hi");
   //     BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
   //     BufferedReader br =new BufferedReader(new FileReader("data.txt"));
        URL website = new URL("https://stackoverflow.com/questions/4328711/read-url-to-string-in-few-lines-of-java-code");
        URLConnection connection = website.openConnection();
      try(BufferedReader br = new BufferedReader(
                new InputStreamReader(
                        connection.getInputStream()));) {
          do {
              String str = br.readLine();
              System.out.println(str);
          } while (br.ready());
      }
    }
}
