/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author nakamura
 */
public class webPage implements Comparable<webPage>{
    private String first; 
    private String last;  
  
    private String url,title,ipAddress,protal;
    //private int protal;
    
    public webPage() {
        first = "";
        last = "";
    } 
    
    public webPage(String firstName) {
        setName(firstName, "");
    } 
    
    public webPage(String firstName, String lastName) {
        first = firstName;
        last = lastName;
    } 
    
    public webPage(String url, String title,String ipAddress){
        this.url = url;
        this.ipAddress = ipAddress;
        this.title = title;
        this.protal = protal;
    }
    
    public webPage(String url, String title,String ipAddress,String protal) {
        this.url = url;
        this.ipAddress = ipAddress;
        this.title = title;
        this.protal = protal;
    }
    
    public String getPortal(){
        return protal;
    }

    public String getURL() {
        return url;
    }

    public void setURL(String url) {
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
    
    public void setName(String firstName, String lastName) {
        setFirst(firstName);
        setLast(lastName);
    } 
    
    public String getName() {
        return toString();
    }  

    public void setFirst(String firstName) {
        first = firstName;
    } 

    public String getFirst() {
        return first;
    } 

    public void setLast(String lastName) {
        last = lastName;
    }  

    public String getLast() {
        return last;
    } 
    
    public void giveLastNameTo(webPage aName) {
        aName.setLast(last);
    } 
    
    public int hashCode() {
        int h = 0;

        for (int i = 0; i < first.length(); i++) {
            h = 31 * h + first.charAt(i);
        }
        return h;
    }

    @Override
    public String toString() {
        return "\nURL: " + url + ", URL Title: " + title + ", Ip Address: " + ipAddress + "Portal: " + protal;
    }
    
    public boolean equals(Object obj) {
    boolean result;

    if ((obj == null) || (getClass() != obj.getClass())) {
            result = false;
        } else {
            webPage otherName = (webPage) obj;
            result = first.equals(otherName.getFirst()) && last.equals(otherName.getLast());
        } 

        return result;
    } 
    
    @Override
    public int compareTo(webPage o) {
        return title.compareTo(o.title);
    }
}
