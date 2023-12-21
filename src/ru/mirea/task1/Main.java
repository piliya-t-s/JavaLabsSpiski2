package ru.mirea.task1;

public class Main {
    public static void main(String[] args) {
        List list = new List();

        list.addNode("apple");
        list.addNode("orange");
        list.addNode("banana");
        list.addNode("grape");

        System.out.println("Original List:");
        list.display();

        list.sortList();
        System.out.println("Sorted List:");
        list.display();
    }
}

