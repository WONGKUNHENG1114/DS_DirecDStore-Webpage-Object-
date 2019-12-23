/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webPage;

import java.util.Scanner;

/**
 *
 * @author A555L-HENG
 */
public class webPageList<T extends Comparable<T>> implements LinkList<T> {

    Node firstNode;
    Node lastNode;
    int size = -1;
    int dataAmount;

    @Override
    public void append(T data) {
        if (data != null) {
            Node newNode = new Node(data);
            if (isEmpty()) {

                firstNode = newNode;
                lastNode = newNode;
            } else {
                //if (!duplicateCheck(data)) {
                if (size == 0) {
                    firstNode.next = newNode;
                }
                lastNode.next = newNode;
                lastNode = newNode;
                //}

            }
            size++;
        }

    }

    @Override
    public LinkList<webPage> duplicateCheck(String item) {
        System.out.println("LinkList<webPage> searchItem(String item)");
        double start_time,finish_time;
        start_time = System.nanoTime();
        Node currentNode = firstNode;
        int duplicateCheck = 0;
        int respond = 7;
        LinkList<webPage> listDuplicate = new webPageList();
        LinkList<webPage> ListsearchItem = new webPageList();
        ListsearchItem = searchItem(item);
        System.out.println("\n\n\n");
        System.out.println("StoreLocation result in \"" + item + "\":-");
        if (ListsearchItem.Size() == 0) {
            System.out.println("no result");
        } else {
            if (ListsearchItem.Size() > 0) {

                do {

                    System.out.println(ListsearchItem);
                    finish_time = System.nanoTime();
                    System.out.println("Total Time Taken: " + (finish_time-start_time));
                    
                    System.out.print("Please pick an StoreLocation to check whether duplicate data exist.");
                    Scanner input = new Scanner(System.in);
                    respond = Integer.parseInt(input.nextLine());
               

                } while (respond > ListsearchItem.Size());
            }
        }
//        respond=3;
        
        start_time =0.0 ;
        if (ListsearchItem.Size() > 0) {
            String Data = ListsearchItem.getItem(respond-1).getTitle();
        System.out.println("LinkList<webPage> duplicateCheck(String item)");
        start_time=System.nanoTime();
            while (currentNode != null) {
//            System.out.println(((webPage) currentNode.data).getTitle() + currentNode);

                if (((webPage) currentNode.data).getTitle().equals(Data)) {
                    listDuplicate.append((webPage) currentNode.data);
                    duplicateCheck++;

                }

                currentNode = currentNode.next;
                //System.out.println(currentNode);
            }
        }
         finish_time = System.nanoTime();
         System.out.println("Total Time Taken: " + (finish_time-start_time));
        return listDuplicate;
    }

    private LinkList<webPage> searchItem(String item) {
       
       
        //System.out.print("Enter a keyword to search: ");

        
        Node currentNode = firstNode;
        LinkList<webPage> ListSearch = new webPageList();
        
        while (currentNode != null) {

            String getLowerCase = ((webPage) currentNode.data).getTitle().toLowerCase();
            item = item.toLowerCase();
            if (getLowerCase.contains(item)) {
                ListSearch.append((webPage) currentNode.data);
            }
            currentNode = currentNode.next;
        }
        
        return ListSearch;
    }

    @Override
    public void insert(T data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            firstNode = newNode;
            lastNode = newNode;
        } else {
            newNode.next = firstNode;
            firstNode = newNode;
        }
        size++;
        
    }

    @Override
    public T removeFirst() {
        T item = null;

        if (!isEmpty()) {

            if (firstNode == lastNode) {
                firstNode = null;
                lastNode = null;
            } else {
                item = firstNode.data;
                firstNode = firstNode.next;

            }

        }
        size--;
        return item;
    }

    @Override
    public T removeLast() {
        T item = null;
        Node currentNode = firstNode;
        if (!isEmpty()) {

            if (firstNode == lastNode) {
                firstNode = null;
                lastNode = null;
            } else {

                while (currentNode.next != lastNode) {
                    currentNode = currentNode.next;
                }

                item = lastNode.data;
                currentNode.next = null;
                lastNode = currentNode;

                if (firstNode == lastNode) {
                    firstNode.next = null;
                }

            }

        }

        currentNode = null;
        size--;
        return item;
    }

    @Override
    public T getItem(int i) {
        System.out.println("getItem(int i)");
         double start_time,finish_time;
        T item = null;
        Node currentNode;
        try {
            if (!isEmpty() && i >= 0 && i <= size) {
                if (i == 0) {
                    item = firstNode.data;

                } else if (i == size) {
                    item = lastNode.data;
                } else {
                    int j = 0;
                    currentNode = firstNode;
                    start_time = System.nanoTime();
                    while (j != i) {
                        currentNode = currentNode.next;
                        j++;
                    }
                     finish_time = System.nanoTime();
                    System.out.println("Total Time Taken: " + (finish_time-start_time));
                    item = currentNode.data;
                    currentNode = null;
                }

            } else {

                throw new Exception("The item is out of boundary");
            }

        } catch (Exception ex) {
            System.out.println(ex);
        }

        return item;
    }

    @Override
    public T removeSelectedItem(int selectionPageID) {
        System.out.println("removeSelectedItem(int selectionPageID)");
         double start_time,finish_time;
        T item = null;
        Node currentNode = firstNode;
        Node previousNode = null;
         start_time = System.nanoTime();
        while (currentNode != lastNode && selectionPageID - 1 <= size) {

//                    System.out.println(((webPage)currentNode.data).comparePageID(selectionPageID));
            if (((webPage) currentNode.data).comparePageID(selectionPageID)) {
                item = currentNode.data;
                System.out.println("\nDeleted data\n" + (webPage) currentNode.data + "\n");
                previousNode.next = currentNode.next;
                break;
            }
            previousNode = currentNode;
            currentNode = currentNode.next;

        }
            finish_time = System.nanoTime();
            System.out.println("Total Time Taken: " + (finish_time-start_time));
        currentNode = null;
        size--;
        return item;
    }

    @Override
    public void clear() {
        firstNode = null;
        lastNode = null;
    }

    @Override
    public int Size() {
        return size + 1;
    }

    boolean isEmpty() {
        return firstNode == null;
    }

    public String toString() {
        int i = 1;
        String str = "";
        Node currentNode = firstNode;
        while (currentNode != null) {
            str += (i) + "." + currentNode.data + "\n";
            i++;
            currentNode = currentNode.next;
        }
        return str;
    }

    class Node {

        T data;
        Node next;

        public Node() {

        }

        public Node(T data) {
            this.data = data;
        }
    }
}
