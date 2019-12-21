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
    private String first; // first name
    private String last;  // last name
  
    private String url,title,ipAddress,date;
    private int protal;
    
    public webPage() {
    first = "";
    last = "";
  } // end default constructor
    
    public webPage(String url, String title,String ipAddress){
        this.url = url;
        this.ipAddress = ipAddress;
        this.title = title;
        this.protal = protal;
    }
    
    public webPage(String title, String url, String ipAddress, String date){
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

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

  

  public webPage(String firstName) { // for testing *************** 
    setName(firstName, "");
  } // end constructor

  public webPage(String firstName, String lastName) {
    first = firstName;
    last = lastName;
  } // end constructor

  public int hashCode() { // for testing *************** 
    // this hash code causes collisions
    int h = 0;

    for (int i = 0; i < first.length(); i++) {
      h = h + first.charAt(i);
    }
    return h;
  } // end hashCode

  public void setName(String firstName, String lastName) {
    setFirst(firstName);
    setLast(lastName);
  } // end setName

  public String getName() {
    return toString();
  } // end getName

  public void setFirst(String firstName) {
    first = firstName;
  } // end setFirst

  public String getFirst() {
    return first;
  } // end getFirst

  public void setLast(String lastName) {
    last = lastName;
  } // end setLast

  public String getLast() {
    return last;
  } // end getLast

  public void giveLastNameTo(webPage aName) {
    aName.setLast(last);
  } // end giveLastNameTo

  
  public String toString() {
    return first + " " + last;
  } // end toString

  public boolean equals(Object other) {
    boolean result;

    if ((other == null) || (getClass() != other.getClass())) {
      result = false;
    } else {
      webPage otherName = (webPage) other;
      result = first.equals(otherName.first) && last.equals(otherName.last);
    } // end if

    return result;
  } // end equals

  public int compareTo(webPage otherName) {
    int result = last.compareTo(otherName.last);

    // if last names are equal, check first names
    if (result == 0) {
      result = first.compareTo(otherName.first);
    }

    return result;
  } // end compareTo
  
  
} // end Name

