package ru.mirea.task1;

class List {
    Node head;

    public List() {
        this.head = null;
    }

    public void addNode(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public void sortList() {
        if (head == null || head.next == null) {
            return;
        }

        Node maxNode = head;
        Node prevMax = null;
        Node current = head;

        while (current.next != null) {
            if (current.next.data.compareTo(maxNode.data) > 0) {
                maxNode = current.next;
                prevMax = current;
            }
            current = current.next;
        }

        if (prevMax == null) {
            head = maxNode.next;
        } else {
            prevMax.next = maxNode.next;
        }

        maxNode.next = head;
        head = maxNode;
    }
}