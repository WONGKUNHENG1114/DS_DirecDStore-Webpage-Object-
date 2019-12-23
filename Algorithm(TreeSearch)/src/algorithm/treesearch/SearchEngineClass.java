package algorithm.treesearch;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Chris KMK
 */
public class SearchEngineClass implements Comparable<SearchEngineClass>{
    private String URL, IpAddress, Protocol;
    
    public SearchEngineClass(){
        
    }

    public SearchEngineClass(String URL, String IpAddress, String Protocol){
        this.URL = URL;
        this.IpAddress = IpAddress;
        this.Protocol = Protocol;
    }
    
    public void setURL(String URL){
        this.URL = URL;
    }
    
    public String getURL(){
        return URL;
    }
    
    public void setIpAddress(String IpAddress){
        this.IpAddress = IpAddress;
    }
    
    public String getIpAddress(){
        return IpAddress;
    }
    
    public void setProtocol(String Protocol){
        this.Protocol = Protocol;
    }
    
    public String getProtocol(){
        return Protocol;
    }
    
    public int compareTo(SearchEngineClass s2){
        return URL.compareTo(s2.URL);
    }

    @Override
    public String toString() {
        return "\nURL: " + URL + "\nIP Address: " + IpAddress + "\nProtocol: " + Protocol + "\n";
    }
    
}
