/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//Neo Yong Jing
package driversearch;

/**
 *
 * @author Acer
 * @param <T>
 */
public class Filter<T extends Comparable<webPage>> implements FilterADT<webPage> {
    private webPage[] array;
    private webPage[] result;
    private int size;
    private int index;
    
    public Filter(){
        array = new webPage[10];
        result = new webPage[10];
        size = 0;
    }
    
    public void add(webPage wp){
        if(wp != null){
            if(isFull(array, size)){
                array = expandArray(array);
            }    
            array[size] = wp;
            size++;
        }   
    }
    
    public String allWebpage(){
        clear();
        for(webPage wp:array){
            if(wp != null){
                if(isFull(result, index)){
                        result = expandArray(result);
                }
                result[index] = wp;
                index++;
            }
        }
        return toString();
    }
    
    public String searchInclusion(String include){
        clear();
        if(include != null){
            for(webPage wp:array){
                if(wp != null){
                    if(wp.getTitle().toLowerCase().contains(include)){
                        if(isFull(result, index)){
                            result = expandArray(result);
                        }
                        result[index] = wp;
                        index++;
                    }
                }
            }
        }
        return toString();
    }
    
    public String searchExclusion(String exclude){
        clear();
        if(exclude != null){
            for(webPage wp:array){
                if(wp != null){
                    if(!wp.getTitle().toLowerCase().contains(exclude)){
                        if(isFull(result, index)){
                            result = expandArray(result);
                        }
                        result[index] = wp;
                        index++;
                    }
                }
            }
        }
        return toString();
    }
    
    public String searchCertainDate(String date){
        clear();
        for(webPage wp:array){
            if(wp != null){
                if(wp.getDate().equals(date)){
                    if(isFull(result, index)){
                        result = expandArray(result);
                    }
                    result[index] = wp;
                    index++;
                }
            }
        }
        return toString();
    }
    
    
    public String searchBefore(String date){
        clear();
        for(webPage wp:array){
            if(wp != null){
                if(wp.getDate().compareTo(date) < 0){
                    if(isFull(result, index)){
                        result = expandArray(result);
                    }
                    result[index] = wp;
                    index++;
                }
            }
        }
        return toString();
    }
    
    
    public String searchAfter(String date){
        clear();
        for(webPage wp:array){
            if(wp != null){
                if(wp.getDate().compareTo(date) > 0){
                    if(isFull(result, index)){
                        result = expandArray(result);
                    }
                    result[index] = wp;
                    index++;
                }
            }
        }
        return toString();
    }
    
    
    public String searchBetweenDate(String date1, String date2){
        clear();
        for(webPage wp:array){
            if(wp != null){
                if(wp.getDate().compareTo(date1) > 0 && wp.getDate().compareTo(date2) < 0){
                    if(isFull(result, index)){
                        result = expandArray(result);
                    }
                    result[index] = wp;
                    index++;
                }
            }
        }
        return toString();
    }
    
    public String searchByUrl(String url){
        clear();
        for(webPage wp:array){
            if(wp != null){
                if(url == wp.getUrl()){
                    if(isFull(result, index)){
                        result = expandArray(result);
                    }
                    result[index] = wp;
                    index++;
                }
            }
        }
        return toString();
    }
    
    private boolean isFull(webPage[] ar, int size){
        if(size == ar.length)
            return true;
        else
            return false;
    }
    
    private webPage[] expandArray(webPage[] ar){
        webPage[] oldArray = ar;
        ar = new webPage[oldArray.length * 2];
        for(int i=0; i<oldArray.length; i++){
            ar[i] = oldArray[i];
        }
        return ar;
    }
    
    private void clear(){
        index = 0;
        result = new webPage[10];
    }
    
    
    public String toString(){
        String str = "";
        if(result[0] == null){
            str = "No result match.";
        }
        else{
            str += "\nTitle\t\t\tUrl\t\t\tDate";
            str += "\n--------------------------------------------------------------";
            for(webPage wp:result){
                if(wp != null)
                    str += "\n|" + wp.getTitle() + "|\t\t" + wp.getUrl() + "\t\t" + wp.getDate();
            }
            str += "\n--------------------------------------------------------------";
        }
        
        return str;
    }
}
