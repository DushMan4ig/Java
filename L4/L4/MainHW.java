package L4;
/*
 * Реализуйте очередь с помощью LinkedList со следующими методами: enqueue() - помещает элемент в конец очереди, 
 * dequeue() - возвращает первый элемент из очереди и удаляет его, 
 * first() - возвращает первый элемент из очереди, не удаляя.
 */

import java.util.NoSuchElementException;
import java.util.Queue;

public class MainHW {
    public static void main(String[] args) {
        public class Node {
    public int data;
    public Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Queue {
    private Node head;
    private Node tail;

    public Queue() {
        this.head = null;
        this.tail = null;
    }

    public void enqueue(int data) {
        Node newNode = new Node(data);
        if (tail != null) {
            tail.next = newNode;
        } else {
            head = newNode;
        }
        tail = newNode;
    }

    public int dequeue() {
        if (head == null) {
            throw new NoSuchElementException("Queue is empty");
        }
        int data = head.data;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        return data;
    }

    public int first() {
        if (head == null) {
            throw new NoSuchElementException("Queue is empty");
        }
        return head.data;
    }
}
    }

Queue queue = new Queue();

queue.enqueue(1);
queue.enqueue(2);
queue.enqueue(3);

System.out.println(queue.first());

System.out.println(queue.dequeue());
System.out.println(queue.dequeue());

System.out.println(queue.first());
}