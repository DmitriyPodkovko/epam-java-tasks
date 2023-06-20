package ua.univer.lesson10;

import ua.univer.lesson06.Dog;
import ua.univer.lesson08.figures.ColorPoint;
import ua.univer.lesson08.figures.Point;

import java.util.*;


class MyArrayList<E> implements Iterable<E> {
    class MyIterator<E> implements Iterator<E> {
        private Object[] arr;
        private int i;

        public MyIterator(Object[] arr) {
            this.arr = arr;
            i = -1;
        }

        @Override
        public boolean hasNext() {
            if (arr == null) throw new IllegalArgumentException();
            return i + 1 < arr.length;
        }

        @Override
        public E next() {
            E value = (E) arr[++i];
            return value;
        }
    }

    private Object[] arr;
    private int index;

    public MyArrayList() {
        arr = new Object[10];
        index = -1;
    }

    public void add(E p) {
        if (index == arr.length - 1)
            arr = Arrays.copyOf(arr, arr.length * 2);
        arr[++index] = p;
    }

    public E get(int i) {
        return (E) arr[i];
    }

    @Override
    public Iterator<E> iterator() {
        return new MyIterator<>(arr);
    }
}

public class ProgramCollection {
    public static void main(String[] args) {
       // myListExample();

        List<Point> pointList = new LinkedList<>();
        pointList.add(new Point(1,2));
        System.out.println(pointList.get(0));
        System.out.println(pointList);
        for (var p: pointList) {
            System.out.println(p);
        }


        Deque<Point> pointDeque = new LinkedList<>();
        pointDeque.add(new Point(2,3));
        pointDeque.peekFirst();


        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addFirst(new Point(1,1));
        myLinkedList.addFirst(new Point(1,2));
        myLinkedList.addFirst(new Point(1,3));
        myLinkedList.print();
        for (var p: myLinkedList) {
            System.out.println(p);
        }

    }

    private static void myListExample() {
        MyArrayList<Point> pointMyArrayList = new MyArrayList<>();
        pointMyArrayList.add(new Point(1, 2));
        pointMyArrayList.add(new ColorPoint(2, 3, "red"));
        //     System.out.println(pointMyArrayList.get(0));

        for (var p : pointMyArrayList) {
            System.out.println(p);
        }

        Iterator<Point> iter = pointMyArrayList.iterator();
        while (iter.hasNext())
            System.out.println(iter.next());
    }
}
