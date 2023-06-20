package ua.univer.lesson10;

import ua.univer.lesson08.figures.Point;

import java.util.Iterator;

public class MyLinkedList implements Iterable{
    class MyIter implements Iterator{
        Node iter;
        MyIter(Node h){
            iter = h;
        }
        @Override
        public boolean hasNext() {
            return iter != null;
        }

        @Override
        public Object next() {
            Point p = iter.p;
            iter = iter.next;
            return p;
        }
    }
    @Override
    public Iterator iterator() {
        return new MyIter(head);
    }

    class Node{
        Point p;
        Node next;

        public Node(Point p) {
            this.p = p;
            this.next = null;
        }
    }
    Node head;
    public void addFirst(Point p){
            Node node = new Node(p);
            if(head == null) head = node;
            else{
                node.next = head;
                head = node;
            }
    }
    public void print(){
        Node iter = head;
        while (iter != null){
            System.out.println(iter.p);
            iter = iter.next;
        }
    }
}
