package Bai11.TrienKhaiQueueSuDungLKVong;

public class Solution {
    static void enqueue(Queue q, int data) {
        Node newNode = new Node(data);
        newNode.data = data;
        if (q.front == null)
            q.front = newNode;
        else
            q.rear.link = newNode;

        q.rear = newNode;
        q.rear.link = q.front;
    }

    public static int dequeue(Queue q) {
        if (q.front == null)
        {
            System.out.println("Queue is empty");
            return Integer.MIN_VALUE;
        }

        int data;
        if (q.front == q.rear)
        {
            data = q.front.data;
            q.front = null;
            q.rear = null;
        }
        else
        {
            Node temp = q.front;
            data = temp.data;
            q.front = q.front.link;
            q.rear.link = q.front;
        }
        return data;
    }

    public static void displayQueue(Queue q) {
        Node temp = q.front;
        System.out.println(" Element in Circular Queue are: ");
        while (temp.link != q.front) {
            System.out.printf("%d ", temp.data);
        }
        System.out.printf("%d", temp.data);
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.front = q.rear = null;

        enqueue(q, 14);
        enqueue(q, 15);
        enqueue(q, 16);
        enqueue(q, 17);

        displayQueue(q);

        dequeue(q);
        System.out.println();
        displayQueue(q);
        enqueue(q,18);
        enqueue(q,19);
        System.out.println();
        displayQueue(q);
        dequeue(q);
        dequeue(q);
        System.out.println();
        displayQueue(q);
    }
}
