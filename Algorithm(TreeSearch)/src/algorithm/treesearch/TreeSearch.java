 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithm.treesearch;

/**
 *
 * @author Chris KMK
 */
public class TreeSearch<T extends Comparable> implements TreeSearchADT<T> {
    private Node root;
    
    public TreeSearch() {
        root = null;
    }
    
    public boolean isEmpty(){
       return root == null;
    }
    
    public T add(T newEntry) {
        T result = null;

        if (isEmpty()) {
          root = new Node(newEntry);
        } else {
          result = addEntry(root, newEntry);
        }

        return result;
  }
    
    public T addEntry(Node root, T newEntry){
        T result = null;
        int comparison = newEntry.compareTo(root.data);

        if (comparison == 0) {						
          result = root.data;
          root.data = newEntry;
        } else if (comparison < 0) {		
          if (root.left != null) {
            result = addEntry(root.left, newEntry);
          } else {
            root.left = new Node(newEntry);
          }
        } else {														// newEntry > entry in root
          if (root.right != null) {
            result = addEntry(root.right, newEntry);
          } else {
            root.right = new Node(newEntry);
          }
        }
        return result;
    }
    
    public T contains(String entry) {
        if(getEntry(entry)!= null)
            return getEntry(entry);
        else
            return null;
    }

    public T getEntry(String entry) {
        return findEntry(root, entry);
    }

    private T findEntry(Node rootNode, String entry) {
        T result = null;

        if (rootNode != null) {
          SearchEngineClass rootEntry = (SearchEngineClass) rootNode.data;

          if (rootEntry.getURL().contains(entry)) {             
              result = rootNode.data;
              
          } else if (rootEntry.getURL().compareTo(entry) > 0) {
              int found = rootEntry.getURL().compareTo(entry);
              result = findEntry(rootNode.left, entry);
              
          } else {
              int found = rootEntry.getURL().compareTo(entry);
              result = findEntry(rootNode.right, entry);
          }
       }
        return result;
    }
     
    public class Node {
        private T data;
        private Node left;
        private Node right;

        public Node() {
          this(null);
        }

        public Node(T dataPortion) {
          this(dataPortion, null, null);
        }

        public Node(T data, Node left, Node right) {
          this.data = data;
          this.left = left;
          this.right = right;
        }


        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }

        public Node getLeft() {
            return left;
        }

        public void setLeft(Node left) {
            this.left = left;
        }

        public Node getRight() {
            return right;
        }

        public void setRight(Node right) {
            this.right = right;
        }
      }
    
    
}
