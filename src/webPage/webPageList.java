/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webPage;

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
                    
                if (size == 1) {
                    firstNode.next = newNode;
                }
                lastNode.next = newNode;
                lastNode = newNode;
            }
            size++;
        }

    }

    private void sortIpAddress()
    {
//        if (data.compareTo(firstNode.data) < 0) {
//                 
//                        newNode.next = firstNode;
//                        firstNode = newNode;
//                               
//
//                    } else {
//                        Node currentNode = firstNode;
//                        Node previousNode = null;
//                        while (currentNode != null && data.compareTo(currentNode.data) > 0) {
//                            
//                            previousNode = currentNode;
//                            if (currentNode.next == null) {
//                                lastNode = newNode;
//                            }
//                            currentNode = currentNode.next;
//                        }
//                        previousNode.next = newNode;
//                        newNode.next = currentNode;
//                    }
    }
    
    @Override
    public void insert(T data) {
         Node newNode = new Node(data);
        Node temp = new Node();
        if (isEmpty()) {
            firstNode = newNode;
            lastNode = newNode;
        } else {
            newNode.next=firstNode;
//            temp=firstNode.next;
            firstNode=newNode;
//            temp.next = firstNode;
//            temp = firstNode;
//            firstNode = null;
//            firstNode = newNode;
//            firstNode.next = temp;

        }
        size++;
        temp = null;
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
        Node currentNode=firstNode;
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void clear() {
      firstNode=null;
      lastNode=null;
    }

    @Override
    public int Size() {
        return size+1;
    }

    boolean isEmpty() {
        return firstNode == null;
    }

    public String toString()
    {
        int i=1;
        String str="";
        Node currentNode=firstNode;
        while(currentNode!=null)
        {
            str+=(i)+"."+currentNode.data+"\n";
            i++;
            currentNode=currentNode.next;
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
