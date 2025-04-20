package ru.vsu.css.tupicyn.tasks.task_2025_03_16;

import java.util.Iterator;

public class MyList<T> implements Iterable<T> {
    private static class Node<T> {
        public T value;
        public Node<T> next;
        public Node<T> last;

        Node(T value, Node<T> next, Node<T> last) {
            this.value = value;
            this.next = next;
            this.last = last;
        }

        public Node(T value) {
            this(value, null, null);
        }

        @Override
        public String toString() {
            return value.toString();
        }
    }

    private Node<T> head;
    private Node<T> tail;
    private int size;

    @SafeVarargs
    public MyList(T... elements) {
        this.head = null;
        this.tail = null;
        this.size = 0;
        for (T element : elements) {
            addLast(element);
        }
    }

    public void addFirst(T value) {
        Node<T> newNode = new Node<>(value, head, null);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            head.last = newNode;
            head = newNode;
        }
        size++;
    }

    public void addLast(T value) {
        Node<T> newNode = new Node<>(value, null, tail);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    public T pollFirst(){
        T x = head.value;
        head = head.next;
        size--;
        return x;
    }

    public T pollLast(){
        T x = tail.value;
        tail = tail.last;
        size--;
        return x;
    }

    public int size() {
        return size;
    }

    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        Node<T> current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.value;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Node<T> current = head;
        while (current != null) {
            sb.append(current.value);
            if (current.next != null) {
                sb.append(", ");
            }
            current = current.next;
        }
        sb.append("]");
        return sb.toString();
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<>() {
            Node<T> curr = head;

            @Override
            public boolean hasNext() {
                return curr != null;
            }

            @Override
            public T next() {
                T value = curr.value;
                curr = curr.next;
                return value;
            }
        };
    }
}