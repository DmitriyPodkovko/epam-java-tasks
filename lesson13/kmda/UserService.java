package ua.univer.lesson13.kmda;

import java.util.ArrayList;
import java.util.List;

public class UserService implements UserServiceInterface {
    List<User> users;
    public UserService(List<User> users) {
        this.users = users;
    }

    @Override
    public List<User> getMaxSalaryUsers(){
        List<User> listMaxSalary = new ArrayList<>();
        User maxSalaryUser = users.get(0);
        for (int i = 0; i < users.size(); i++) {
            if (maxSalaryUser.getSalary()< users.get(i).getSalary())
                maxSalaryUser = users.get(i);
        }

        for (int i = 0; i < users.size(); i++) {
            if (Math.abs(maxSalaryUser.getSalary() - users.get(i).getSalary()) <0.001)
                listMaxSalary.add(users.get(i));
        }
        return listMaxSalary;
    }
}
