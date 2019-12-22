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
        Pre-condition: data is not null
        Post-condition: data is added to the tree(node)
        Return: return null if data was not in the tree already, or an existing
                data that matched the parameter new data and has been replaced in the tree
    */
    
    public boolean isEmpty();
    /*
        Description: to check root data is empty or not
        Pre-condition: none
        Post-condition: none
        Return: return true if the data(node) is empty, or else return false if is not empty
    */
    
    public T contains(String entry);
    /*
        Description: to search for a specific data(node) in the tree
        Pre-condition: data(node) is not null
        Post-condition: none
        Return: return data(T) if the data is matched, or return false if not found
    */
    
    public T getEntry(String entry);
    /*
        Description: to retrieve a specific data(node) in the tree
        Pre-condition: data(node) is not empty
        Post-condition: either the data(node) object that was found in the tree or null if no such object exists
        Return: return data(T) if the data is found, or return false if not found
    */
    
}
