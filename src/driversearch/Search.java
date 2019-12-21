/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package driversearch;

/**
 *
 * @author Acer
 */
public class Search<T extends Comparable<webPage>> implements SearchADT<webPage> {
    private webPage[] array;
    private int size;
    
    public Search(){
        array = new webPage[10];
        size = 0;
    }
    
    public void add(webPage wp){
        if(wp != null){
            array[size] = wp;
            size++;
        }
    }
    
//    public webPage[] search(String title){
//        int index = 0;
//        if(title != null){
//            for(webPage wp:array){
//                if(wp.getTitle().contains(title)){
//                    result[index] = wp;
//                    index++;
//                }
//            }
//        }
//        return result;
//    }
    
    /*
    public webPage searchCertainDate(String date){
    }
    
    public T searchBefore(String date){
    }
    
    
    public T searchAfter(String date){
    }
    
    
    public T searchBetweenDate(String date1, String date2){
    }
    
    
    public T searchExclusion(String exclude){
    }
    */
    
    public String toString(){
        String str = "";
        
//        for(int i=0; i<array.length; i++){
//                str += array[i].getTitle() + " ";
//        }

        for(webPage wp:array){
            if(wp != null)
                str += wp.getTitle() + " ";
        }
        
        return str;
    }
}
