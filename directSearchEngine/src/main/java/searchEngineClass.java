/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author nakamura
 */
public class searchEngineClass implements Comparable<searchEngineClass>{
    private String url,title,ipAddress,protal;
    
    public searchEngineClass(){
        
    }
    
    public searchEngineClass(String url, String title,String ipAddress,String protal) {
        this.url = url;
        this.ipAddress = ipAddress;
        this.title = title;
        this.protal = protal;
    }

    public String getCode() {
        return url;
    }

    public void setCode(String code) {
        this.url = url;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }
    
    public String getTitle(){
        return title;
    }
    
    public void setTitle(String title){
        this.title = title;
    }

    @Override
    public String toString() {
        return "\nURL: " + url + ", URL Title: " + title + ", Ip Address: " + ipAddress;
    }

    @Override
    public int compareTo(searchEngineClass o) {
        return title.compareTo(o.title);
    }
}
