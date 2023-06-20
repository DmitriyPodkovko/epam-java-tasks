package ua.univer.lesson10;
class Cell{
    int value;
}
class Row{
    Cell[] cells = new Cell[]{new Cell(), new Cell()};
}
class Matrix{
    Row[] rows = new Row[]{new Row()};
}
class MultyMatrix{
    Matrix[] matrices = new Matrix[3];
}

public class Program {
    public static void main(String[] args) {
        Matrix matrix = new Matrix();
        System.out.println(matrix.rows[0].cells[1].value);
    }
}
