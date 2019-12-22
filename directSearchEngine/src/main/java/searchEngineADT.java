/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author nakamura
 */
public interface searchEngineADT<T> {
    public void add(T data);
    /*
    description: to add data in ascending order
    precondition: data is not null
    postcondition: data is added to the list
    return: none
    */
    public String search(String code);
    /*
    description: to search the data in the list
    precondition: data is not empty
    postcondition: none
    return: The item from the list is returned if found, or else return "Game Not Found"
    */
    T getItem(int i);
     /*getItem
    Description:to track the list of the item
    Precondition:to check whther the i is not negative number and it is positive number,
    Postcondition:none
    Return:return the value of the list item
    */
    int Size();
}
