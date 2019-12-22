/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author nakamura
 */
public class searchClass<T extends Comparable<T>> implements searchEngineADT<T> {
    Node firstNode;
    Node lastNode;
    Node currentNode;
    int size = -1;
    int dataAmount;
    static int i = 0;
    
    public searchClass() {
        this.firstNode = null;
    }
    
    public void add(T data){
        if(data!= null){
            Node newNode = new Node(data);
            if(firstNode == null){
                firstNode = newNode;
            }else{
                if(data.compareTo(firstNode.data) < 0){
                    newNode.next = firstNode;
                    firstNode = newNode;
                }else{
                    Node current = firstNode;
                    Node previous = null;
                    while(current != null && data.compareTo(current.data)> 0){
                        previous = current;
                        current = current.next;
                    }
                    previous.next = newNode;
                    newNode.next = current;
                }
            }
        }
    }
    
    public String search(String code){
        Node current = firstNode;
        while (current != null) {
        if(current.data instanceof searchEngineClass){
            searchEngineClass g = (searchEngineClass)current.data;
            
            if(g.getCode().equals(code))
                return g.getCode();
            }
            current = current.next;
        }
        return "Game Not Found";
    }
    
    public T getItem(int i) {
        
        T item = null;
        try {
            if (!isEmpty() && i >= 0 && i <= size) {
                if (i == 0) {
                    item = firstNode.data;

                } else if (i == size) {
                    item = lastNode.data;
                }
                else
                {
                    int j=0;
                    currentNode=firstNode;
                    while(j!=i)
                    {
                        currentNode=currentNode.next;
                        j++;
                    }
                    item=currentNode.data;
                    currentNode=null;
                }

            } else {
                
                throw new Exception("The item is out of boundary");
            }

        } catch (Exception ex) {
            System.out.println(ex);
        }

        return item;
    }
    
    boolean isEmpty() {
        return firstNode == null;
    }
    
    public int Size() {
        return size+1;
    }
    
    private class Node{
        private T data;
        private Node next;

        public Node(T data) {
            this.data = data;
        }
    }
    
    public String toString(){
       String str="";
       Node current = firstNode;
       while(current!=null){
           str += current.data.toString() + ", ";
           current=current.next;
       }
       return str;
   }
}
