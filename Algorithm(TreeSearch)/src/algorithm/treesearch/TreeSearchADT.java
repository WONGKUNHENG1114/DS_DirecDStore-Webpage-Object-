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
public interface TreeSearchADT<T> {
    public T add(T newEntry); 
    /*
        Description: to add data to the tree(node)
        Precodition: data is not null
        Postcodition: data is added to the tree(node)
        Return: none
    */
    
    public boolean isEmpty();
    /*
        Description: to check root data is empty or not
        Precodition: root data is not empty
        Postcodition: none
        Return: return true if the data(node) is empty, or else return false if is not empty
    */
    
    public T contains(String entry);
    /*
        Description: to search for a specific data(node) in the tree
        Precodition: data(node) is not empty
        Postcodition: the data(node) object to be found
        Return: return data(T) if the data is found, or false if not found
    */
    public T getEntry(String entry);
    /*
        Description: to retrieve a specific data(node) in the tree
        Precodition: data(Node) is not empty
        Postcodition: either the data(node) object that was found in the tree or null if no such object exists
        Return: return data(T) if the data is found, or false if not found
    */
}
