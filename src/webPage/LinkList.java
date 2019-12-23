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
public interface LinkList<T> {
     void append(T data);
    /*append
    Description:to add data to the back of the list
    Precondition:check the data whether is null
    Postcondition:insert the data into last item the list
    Return:none
    */
    void insert(T data);
     /*insert
    Description:insert the data into front of the list
    Precondition:check the data whether is null 
    Postcondition:insert the data into the first item of the list
    Return:none
    */
    T removeFirst();
     /*removeFirst
    Description:delete the first item of the list
    Precondition:check whether the list is null
    Postcondition:remove the first item from the list
    Return:return the list of data
    */
    T removeLast();
     /*removeLast
    Description:delete the last item of the list
    Precondition:check whether the list is null
    Postcondition:remove the last item from the list
    Return:return the list of data
    */
    T getItem(int i);
     /*getItem
    Description:to track the list of the item
    Precondition:to check whther the i is not negative number and it is positive number,
    Postcondition:none
    Return:return the value of the list item
    */
    void clear();
     /*clear
    Description:to delete all items in the list
    Precondition:none
    Postcondition:clear all the item in the list
    Return:return the list
    */
    T removeSelectedItem(int selection);
     /*removeAt
    Description:to delete selected items from the list
    Precondition:check the selection whether is valid or not
    Postcondition:remove a selected duplicate item
    Return:return the remove item
    */
    LinkList<webPage> duplicateCheck(String item);
       /*duplicateCheck
    Description:To determine the duplicate item
    Precondition:check there is any duplicate item
    Postcondition:none
    Return:return duplicate item if true , return nothing if false;
    */
    @Override
   String toString();
    int Size();
    
}
