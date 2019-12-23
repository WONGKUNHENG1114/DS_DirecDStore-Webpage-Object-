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
    
    public T add(T value) {
        T result = null;

        if (isEmpty()) {
          root = new Node(value);
        } else {
          result = addValue(root, value);
        }

        return result;
  }
    
    public T addValue(Node root, T newValue){
        T result = null;
        int comparison = newValue.compareTo(root.data);

        if (comparison == 0) {						
          result = root.data;
          root.data = newValue;
        } else if (comparison < 0) {		
          if (root.left != null) {
            result = addValue(root.left, newValue);
          } else {
            root.left = new Node(newValue);
          }
        } else {
          if (root.right != null) {
            result = addValue(root.right, newValue);
          } else {
            root.right = new Node(newValue);
          }
        }
        return result;
    }
    
    public T contains(String value) {
        if(getEntry(value)!= null)
            return getEntry(value);
        else
            return null;
    }

    public T getEntry(String value) {
        return findEntry(root, value);
    }

    private T findEntry(Node rootNode, String value) {
        T result = null;

        if (rootNode != null) {
          SearchEngineClass rootEntry = (SearchEngineClass) rootNode.data;

          if (rootEntry.getURL().contains(value)) {             
              result = rootNode.data;
              
          } else if (rootEntry.getURL().compareTo(value) > 0) {
              int found = rootEntry.getURL().compareTo(value);
              result = findEntry(rootNode.left, value);
              
          } else {
              int found = rootEntry.getURL().compareTo(value);
              result = findEntry(rootNode.right, value);
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
