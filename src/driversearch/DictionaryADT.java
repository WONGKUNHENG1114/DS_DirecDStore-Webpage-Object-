/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package driversearch;

/**
 *
 * @author Francis Tan Eng Yee
 */
public interface DictionaryADT <K, V>{
    
   // @param key an object search key of the new entry
   //@param value an object associated with the search key
  public V add(K key, V value);
    
   /*
   * descrption: to add new entry to dictionary
   * precondition: if search key already located in dictionary, replaces its value
   * postcondition: the entry is added
   * return: null if the new entry was added to the dictionary or the
   *         value that was associated with key if that value was replaced
   */
  
  // @param key an object search key of the entry to be removed
  public V remove(K key);
   /*
   * descrption: to remove the specific entry from the dictionary
   * precondition: the specific entry is given
   * postcondition: the entry is removed
   * return: null if no such object exists or the value that 
             was associated with the search key
   */
  
  // @param key an object search key of the entry to be retrieved
  public V getValue(K key);
   /*
   * descrption: by using the search key, obtain the value with the specific key
   * precondition: having the search key
   * postcondition: none
   * return: null if no such object exists or the value that 
             is associated with the search key
   */
  
  //@param key an object search key of the desired entry
  public boolean contains(K key);
   /*
   * descrption: to search whether a specific entry is located inside the dictionary
   * precondition: none
   * postcondition: none
   * return: true if key is associated with an entry in the dictionary
   */
  
  public boolean isEmpty();
   /*
   * descrption: to check whether the dictionary is empty
   * precondition: none
   * postcondition: none 
   * return: true if the dictionary is empty
   */
  
  public boolean isFull();
   /*
   * descrption: to check whether the dictionary is full
   * precondition: none
   * postcondition: none 
   * return: true if the dictionary is full
   */
  
  public int getSize();
   /*
   * descrption: obtain the size of dictionary
   * precondition: none
   * postcondition: none 
   * return: the number of entries that located in the dictionary
   */
  
  public void clear();
   /*
   * descrption: Clear all entries from dictionary
   * precondition: none
   * postcondition: The entries should be all cleared
   * return: none
   */
  
} 

