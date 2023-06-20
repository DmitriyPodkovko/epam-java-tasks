package ua.univer.lesson13.kmda;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

public class UserControl {
    public static List<User> getUserListFromFile(String filename) throws IOException {
        List<User> userList = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader("kmda"+ File.separator+filename, Charset.forName("windows-1251")));
        br.readLine();
        while(br.ready()){
            String rowStr = br.readLine();
            String [] elems = rowStr.split(";");
            String name = elems[0];
            String position = elems[1];
            double salary = Double.parseDouble(elems[2].replace(',','.'));
            userList.add(new User(name,position,salary));
        }
        br.close();
        return userList;
    }
}
