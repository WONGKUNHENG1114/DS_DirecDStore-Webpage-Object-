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
  
    private String url,title,ipAddress,date;
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
    
    public webPage(String title, String url,String ipAddress, String date){
        this.url = url;
        this.ipAddress = ipAddress;
        this.title = title;
        this.date = date;
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
      h = h + first.charAt(i);
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

  public boolean equals(Object other) {
    boolean result;

    if ((other == null) || (getClass() != other.getClass())) {
      result = false;
    } else {
      webPage otherName = (webPage) other;
      result = first.equals(otherName.first) && last.equals(otherName.last);
    } 

    return result;
  } 

  public int compareTo(webPage otherName) {
    int result = last.compareTo(otherName.last);

    // if last names are equal, check first names
    if (result == 0) {
      result = first.compareTo(otherName.first);
    }

    return result;
  } 
} 

