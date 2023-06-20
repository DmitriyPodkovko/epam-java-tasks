package ua.univer.lesson13.kmda.gui;

public class CalcService {
    public static int getResult(int x, String op, int y) {
        int result = 0;
        switch(op){
            case "+": result = x + y; break;
            case "-": result = x - y; break;
            case "*": result = x * y; break;
        }
        return result;
    }
}
