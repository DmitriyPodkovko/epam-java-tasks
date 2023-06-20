package ua.univer.lesson13.kmda;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) throws IOException {
     //   getDataFromURL();
        List<User> userList = UserControl.getUserListFromFile("salary0719.csv");
        System.out.println(userList);
        List<User> maxSalaryUsers = new UserService(userList).getMaxSalaryUsers();
        System.out.println(maxSalaryUsers);
    }



    private static void getDataFromURL() throws IOException {
        String url = "https://data.gov.ua/dataset/770cc750-4333-424f-b6e9-6e6c5c76aec9/resource/59cb6066-1fac-41ed-a571-811db551c75b/download/zp-lupen-2019.csv";
        URL website = new URL(url);
        URLConnection connection = website.openConnection();
        try(BufferedReader br = new BufferedReader(
                new InputStreamReader(
                        connection.getInputStream(),Charset.forName("windows-1251")));){
            while(br.ready()){
                System.out.println(br.readLine());
            }
        }
    }
}
