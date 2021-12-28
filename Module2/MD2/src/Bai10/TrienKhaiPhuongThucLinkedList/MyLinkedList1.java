package Bai10.TrienKhaiPhuongThucLinkedList;

import Bai10.TrienKhaiLopLinkedListDonGian.MyLinkedList;

import javax.xml.soap.Node;

public class MyLinkedList1<E> {
    Node head;
    Node tail;
    int numNodes;

    public MyLinkedList1(Object data) {
        head = new Node(data);
    }

    private class Node<E> {
        private Node next;
        private Object data;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return this.data;
        }
    }

    public MyLinkedList1() {
    }

    public void add(int index, Object data) {
        if (index < 0 || index >= numNodes) {
            throw new IndexOutOfBoundsException("index " + index + " out of bounds");
        } else {
            Node temp = head;
            Node holder;
            for (int i = 0; i < index - 1 && temp.next != null; i++) {
                temp = temp.next;
            }
            holder = temp.next;
            temp.next = new Node(data);
            temp.next.next = holder;
            numNodes++;
        }
    }

    public void addFirst(E data) {
        Node temp = head;
        head = new Node(data);
        head.next = temp;
        numNodes++;
    }


}
