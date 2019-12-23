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
import java.io.Serializable;

public class HashedDictionary<K, V> implements DictionaryADT<K, V>, Serializable  {
  private TableEntry<K, V>[] hashTable;					    
  private int noOfEntries;
  private int spaceOccupied;	         
  private static final int DEFAULT_SIZE = 47; 		    
  private static final double MAX_LOAD_FACTOR = 0.5;   
  
  public HashedDictionary() {
    this(DEFAULT_SIZE); 
  } 

  public HashedDictionary(int tableSize) {
    int primeSize = getNextPrime(tableSize);
    hashTable = new TableEntry[primeSize];
    noOfEntries = 0;
    spaceOccupied = 0;
  } 

  public String toString() {
    String str = "";
    for (int index = 0; index < hashTable.length; index++) {
      str += String.format("%2d. ", index);
      if (hashTable[index] == null) {
        str += "null\n";
      } else if (hashTable[index].isRemoved()) {
        str += "notIn\n";
      } else {
        str += hashTable[index].getKey() + " " + hashTable[index].getValue() + "\n";
      }
    } 
    str += "\n";
    return str;
  } 

 
  public V add(K key, V value) {
    V oldValue; 

    if (isHashTableIsFull()) {
      expandHashTable();
    }

    int index = getHashIndex(key);
    index = linearProbe(index, key);

    if ((hashTable[index] == null) || hashTable[index].isRemoved()) { 
      hashTable[index] = new TableEntry<K, V>(key, value);
      noOfEntries++;
      spaceOccupied++;
      oldValue = null;
    } else { 
      oldValue = hashTable[index].getValue();
      hashTable[index].setValue(value);
    } // end if

    return oldValue;
  } 
  
  public V remove(K key) {
    V removedValue = null;

    int index = getHashIndex(key);
    index = locate(index, key);

    if (index != -1) {
      
      removedValue = hashTable[index].getValue();
      hashTable[index].setToRemoved();
      noOfEntries--;
    } 
    

    return removedValue;
  } 

  
  public V getValue(K key) {
    V res = null;

    int index = getHashIndex(key);
    index = locate(index, key);

    if (index != -1) {
      res = hashTable[index].getValue(); 
    }

    return res;
  } 

  
  private int linearProbe(int index, K key) {
    boolean found = false;
    int avaiIndex = -1; 
  

    while (!found && (hashTable[index] != null)) {
      if (hashTable[index].isIn()) {
        if (key.equals(hashTable[index].getKey())) {
          found = true; 
        } else
        {
          index = (index + 1) % hashTable.length;         // linear probing
        }
      } else { 
        if (avaiIndex == -1) {
          avaiIndex = index;
        }
        index = (index + 1) % hashTable.length;         // linear probing
      } 
    } 
  
    if (found || (avaiIndex == -1)) {
      return index;             
    } else {
      return avaiIndex; 
    }
  } 

  
  private int locate(int index, K key) {
    boolean found = false;

    while (!found && (hashTable[index] != null)) {
      if (hashTable[index].isIn() && key.equals(hashTable[index].getKey())) {
        found = true; 
      } else 
      {
        index = (index + 1) % hashTable.length;         // linear probing
      } 
    }
    

    int result = -1;
    if (found) {
      result = index;
    }

    return result;
  } 

  public boolean contains(K key) {
    return getValue(key) != null;
  }   

  public boolean isEmpty() {
    return noOfEntries == 0;
  }

  public boolean isFull() {
    return false;
  } 

  public int getSize() {
    return noOfEntries;
  } 

  public final void clear() {
    for (int index = 0; index < hashTable.length; index++) {
      hashTable[index] = null;
    }
    spaceOccupied = 0;
    noOfEntries = 0;
  } 

  private int getHashIndex(K key) {
    int hashIndex = key.hashCode() % hashTable.length;

    if (hashIndex < 0) {
      hashIndex = hashIndex + hashTable.length;
    } 
    return hashIndex;
  } 

  
  private void expandHashTable() {
    TableEntry<K, V>[] oldTable = hashTable;
    int oldSize = hashTable.length;
    int newSize = getNextPrime(oldSize * 2);
    hashTable = new TableEntry[newSize];
    noOfEntries = 0; 
    spaceOccupied = 0;

    for (int index = 0; index < oldSize; index++) {
      if ((oldTable[index] != null && oldTable[index].isIn())) {
        add(oldTable[index].getKey(), oldTable[index].getValue());
      }
    } 
  }

  private boolean isHashTableIsFull() {
    return spaceOccupied > MAX_LOAD_FACTOR * hashTable.length;
  } 

  private int getNextPrime(int anInteger) {
    if (anInteger % 2 == 0) {
      anInteger++;
    } 
    while (!isPrime(anInteger)) {
      anInteger = anInteger + 2;
    } 
    return anInteger;
  } 
 
  private boolean isPrime(int Integer)
        {
         boolean result;
         boolean done = false;
                
         if ( (Integer == 1) || (Integer % 2 == 0) ){
            result = false; 
        }
        else if ( (Integer == 2) || (Integer == 3) ){
            result = true;
        }  
        else 
        {
         assert (Integer % 2 != 0) && (Integer >= 5);
         result = true; 
         for (int divisor = 3; !done && (divisor * divisor <= Integer); divisor = divisor + 2)
         {
                        if (Integer % divisor == 0)
         {
               result = false; 
               done = true;
                   } 
                } 
            } 
                return result;
        } 
 
  private class TableEntry<S, T> implements Serializable {

    private S key;
    private T value;
    private boolean inTable; 

    private TableEntry(S searchKey, T dataValue) {
      key = searchKey;
      value = dataValue;
      inTable = true;
    } 

    private S getKey() {
      return key;
    } 

    private T getValue() {
      return value;
    }

    private void setValue(T newValue) {
      value = newValue;
    } 

    private boolean isIn() {
      return inTable;
    } 

    private boolean isRemoved() { 
      return !inTable;
    } 

    private void setToRemoved() {
      key = null;
      value = null;
      inTable = false;
    } 
  } 
} 

