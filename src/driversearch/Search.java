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
    private webPage[] result;
    private int size;
    int index = 0;
    
    public Search(){
        array = new webPage[10];
        result = new webPage[10];
        size = 0;
    }
    
    public void add(webPage wp){
        if(wp != null){
            if(isFull()){
                expandArray();
            }    
            array[size] = wp;
            size++;
        }   
    }
    
    public String searchInclusion(String title){
        clear();
        if(title != null){
            for(webPage wp:array){
                if(wp != null){
                    if(wp.getTitle().toLowerCase().contains(title)){
                        result[index] = wp;
                        index++;
                    } 
                }
                
            }
        }
        return format();
    }
    
    public String searchExclusion(String exclude){
        clear();
        for(webPage wp:array){
            if(wp != null){
                if(!wp.getTitle().toLowerCase().contains(exclude)){
                    result[index] = wp;
                    index++;
                }
            }
        }
        return format();
    }
    
    public String searchCertainDate(String date){
        clear();
        for(webPage wp:array){
            if(wp != null){
                if(wp.getDate().equals(date)){
                    result[index] = wp;
                    index++;
                }
            }
        }
        return format();
    }
    
    
    public String searchBefore(String date){
        clear();
        for(webPage wp:array){
            if(wp != null){
                if(wp.getDate().compareTo(date) < 0){
                    result[index] = wp;
                    index++;
                }
            }
        }
        return format();
    }
    
    
    public String searchAfter(String date){
        clear();
        for(webPage wp:array){
            if(wp != null){
                if(wp.getDate().compareTo(date) > 0){
                    result[index] = wp;
                    index++;
                }
            }
        }
        return format();
    }
    
    
    public String searchBetweenDate(String date1, String date2){
        clear();
        for(webPage wp:array){
            if(wp != null){
                if(wp.getDate().compareTo(date1) > 0 && wp.getDate().compareTo(date2) < 0){
                    result[index] = wp;
                    index++;
                }
            }
        }
        return format();
    }
    
    public String searchByUrl(String url){
        clear();
        for(webPage wp:array){
            if(wp != null){
                if(url == wp.getUrl()){
                    result[index] = wp;
                    index++;
                }
            }
        }
        return format();
    }
    
    private boolean isFull(){
        if(size == array.length)
            return true;
        else
            return false;
    }
    
    private void expandArray(){
        webPage[] oldArray = array;
        array = new webPage[oldArray.length * 2];
        for(int i=0; i<oldArray.length; i++){
            array[i] = oldArray[i];
        }
    }
    
    private String format(){
        String str = "";
        str += "\nTitle\t\t\tUrl\t\t\tDate";
        str += "\n--------------------------------------------------------------";
        for(webPage wp:result){
            if(wp != null)
                str += "\n|" + wp.getTitle() + "|\t\t" + wp.getUrl() + "\t\t" + wp.getDate();
        }
        str += "\n--------------------------------------------------------------";
        return str;
    }
    
    private void clear(){
        index = 0;
        result = new webPage[10];
    }
    
    public String toString(){
        String str = "";
        str += "\nTitle\t\t\tUrl\t\t\tDate";
        str += "\n--------------------------------------------------------------";
        for(webPage wp:array){
            if(wp != null)
                str += "\n|" + wp.getTitle() + "|\t\t" + wp.getUrl() + "\t\t" + wp.getDate();
        }
        str += "\n--------------------------------------------------------------";
        return str;
    }
}
