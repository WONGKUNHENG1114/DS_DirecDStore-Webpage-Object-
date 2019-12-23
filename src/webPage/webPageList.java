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
    
        Node currentNode = firstNode;
        int duplicateCheck=0;
        LinkList<webPage> listDuplicate=new webPageList();
        while (currentNode != null) {
//            System.out.println(((webPage) currentNode.data).getTitle() + currentNode);

            if (((webPage)currentNode.data).getTitle().equals(item)) {
                listDuplicate.append((webPage)currentNode.data);
                duplicateCheck++;
              

            }
            
            currentNode = currentNode.next;
            //System.out.println(currentNode);
        }

       return listDuplicate;
    }
 
//    private void duplicateCheck(T data) {
//        Node currentNode = firstNode;
//        int i = 0;
//        while (currentNode != null) {
//
//            System.out.println(((webPage) currentNode.data).getTitle() + currentNode);
////            if(data.compareTo(currentNode.data)==0)
//            if (((webPage) data).compare(((webPage) currentNode.data)) == 0) {
//                System.out.println("");
////                System.out.print("\n");
////                System.out.println("The title found exists.Do you want to replace new record the current record");
////                System.out.println("Current eixsts webPage title:");
////                System.out.println("Title:"+((webPage)currentNode.data).getTitle()+"\nDescription:"+((webPage)currentNode.data).getDescription());
////                System.out.println("New webPage title:");
////                System.out.println("Title:"+((webPage)data).getTitle()+"\nDescription:"+((webPage)data).getDescription()+"\n");
//                //System.out.println("To replace the record press 1 otherwise 0 to exit");
//
//            }
//
//            currentNode = currentNode.next;
//            //System.out.println(currentNode);
//        }
//        System.out.print("\n");
//
//    }

    private void sortIpAddress() {
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
            newNode.next = firstNode;
            firstNode = newNode;
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
                    while (j != i) {
                        currentNode = currentNode.next;
                        j++;
                    }
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
        T item = null;
        Node currentNode = firstNode;
        Node previousNode=null;
                while (currentNode != lastNode && selectionPageID-1<=size) {
                    
//                    System.out.println(((webPage)currentNode.data).comparePageID(selectionPageID));
                    if(((webPage)currentNode.data).comparePageID(selectionPageID))
                    {
                        item=currentNode.data;
                        System.out.println("\nDeleted data\n"+(webPage)currentNode.data+"\n");
                        previousNode.next=currentNode.next;
                        break;
                    }
                    previousNode=currentNode;
                    currentNode = currentNode.next;
                    
                }  

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
