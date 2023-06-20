package ua.univer.lesson13.kmda.gui;

import ua.univer.lesson13.kmda.User;
import ua.univer.lesson13.kmda.UserControl;
import ua.univer.lesson13.kmda.UserService;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.beans.XMLEncoder;
import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

class MyMouseListener implements MouseListener{

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("Click");
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
public class KmdaForm {
    public static void main(String[] args) {
        JFrame win = new JFrame("KMDA");
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        win.setSize(500,400);
        JPanel panel = new JPanel();
        JTextField textX = new JTextField("               ");
        JTextField textY = new JTextField("               ");
        JTextField textOp = new JTextField("               ");
        JTextField textResult = new JTextField("               ");
        TextArea textArea = new TextArea();
        JButton btn = new JButton("OK");
        btn.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
               int x = Integer.parseInt(textX.getText().trim());
               String op = textOp.getText().trim();
               int y = Integer.parseInt(textY.getText().trim());
               int result = CalcService.getResult(x, op, y);
               textResult.setText(String.valueOf(result));
            }
        });
        JButton btnKmda = new JButton("Show");
        btnKmda.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    textArea.setText("");
                    List<User> userList = UserControl.getUserListFromFile("salary0719.csv");
                    for (int i = 0; i < userList.size(); i++) {
                        textArea.append(userList.get(i).toString());
                    }

                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        });
        JButton btnSalary = new JButton("MaxSalary");
        btnSalary.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try {
                    List<User> userList = UserControl.getUserListFromFile("salary0719.csv");
                    List<User> maxSalaryUsers = new UserService(userList).getMaxSalaryUsers();
                    textArea.setText("");
                    try (XMLEncoder xmlEncoder = new XMLEncoder(new BufferedOutputStream(
                            new FileOutputStream("userSerial.xml", true)))) {
                    for (int i = 0; i < maxSalaryUsers.size(); i++) {
                        textArea.append(maxSalaryUsers.get(i).toString());
                        xmlEncoder.writeObject(maxSalaryUsers.get(i));
                        xmlEncoder.flush();
                    }


                    } catch (FileNotFoundException e1) {
                        e1.printStackTrace();
                    }

//                    XmlMapper xmlMapper = new XmlMapper();
//                    xmlMapper.writeValue(new File("simple_bean.xml"), new SimpleBean());
//                    ObjectMapper objectMapper = new ObjectMapper();
//                    Car car = new Car("yellow", "renault");
//                    objectMapper.writeValue(new File("target/car.json"), car);
                } catch (IOException ex) {
                    ex.printStackTrace();
                }


            }
        });
        panel.add(textX);
        panel.add(textOp);
        panel.add(textY);
        panel.add(textResult);
        panel.add(btn);
        panel.add(btnKmda);
        panel.add(btnSalary);
        panel.add(textArea);
        win.setContentPane(panel);
        win.setVisible(true);
    }


}
