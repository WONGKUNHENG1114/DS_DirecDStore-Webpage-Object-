/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package driversearch;

/**
 *
 * @author FT
 */
public class webPage implements Comparable<webPage>{
    private String first; 
    private String last;  
  
    private String url,title,ipAddress;
    private int protal;
    
    public webPage() {
    first = "";
    last = "";
  } 
    
    public webPage(String url, String title,String ipAddress){
        this.url = url;
        this.ipAddress = ipAddress;
        this.title = title;
        this.protal = protal;
    }

    public String getUrl() {
        return url;
    }

    public String getTitle() {
        return title;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public int getProtal() {
        return protal;
    }

  

  public webPage(String firstName) {
    setName(firstName, "");
  } 

  public webPage(String firstName, String lastName) {
    first = firstName;
    last = lastName;
  } 
  

  public int hashCode() {
     int h = 0;

    for (int i = 0; i < first.length(); i++) {
    h = 31 * h + first.charAt(i);
    }
    return h;
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

  public String toString() {
    return first + " " + last;
  } 

  public boolean equals(Object obj) {
    boolean result;

    if ((obj == null) || (getClass() != obj.getClass())) {
      result = false;
    } else {
      webPage otherName = (webPage) obj;
      result = first.equals(otherName.first) && last.equals(otherName.last);
    } 

    return result;
  } 
  
  public int compareTo(webPage otherName) {
    int res = last.compareTo(otherName.last);

    if (res == 0) {
      res = first.compareTo(otherName.first);
    }

    return res;
  } 
} 

