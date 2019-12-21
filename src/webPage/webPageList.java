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

                if (data instanceof webPage) {
                    if (data.compareTo(firstNode.data) < 0) {
                 
                        newNode.next = firstNode;
                        firstNode = newNode;
                               

                    } else {
                        Node currentNode = firstNode;
                        Node previousNode = null;
                        while (currentNode != null && data.compareTo(currentNode.data) > 0) {
                            
                            previousNode = currentNode;
                            if (currentNode.next == null) {
                                lastNode = newNode;
                            }
                            currentNode = currentNode.next;
                        }
                        previousNode.next = newNode;
                        newNode.next = currentNode;
                    }

                }
//                if (size == 1) {
//                    firstNode.next = newNode;
//                }
//                lastNode.next = newNode;
//                lastNode = newNode;
            }
            size++;
        }

    }

    @Override
    public void insert(T data) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public T removeFirst() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public T removeLast() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public T getItem(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int Size() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    boolean isEmpty() {
        return firstNode == null;
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
