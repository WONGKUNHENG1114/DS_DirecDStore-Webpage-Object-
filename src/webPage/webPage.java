package webPage;

import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nakamurakaito
 */
public class webPage implements Comparable<webPage>{
    private String url,title,ipAddress;
    private int protal;
    private static int pageID;
    private int uniquePageID;
    private String description;
    private boolean isBookMark;
    private static int visitTime;
    public webPage(){
        
    }
    
    public webPage(String url, String title,String ipAddress){
        this.url = url;
        this.ipAddress = ipAddress;
        this.title = title;
        this.protal = protal;
    }
    
    //KUNHENG CONSTRUCTOR
 public webPage(String title,String ipAddress,String description,boolean bookMarkStatus){
        setUniquePageID();
        this.url ="https://www."+"title=%"+ title+"000"+pageID+".com";
        this.ipAddress =ipAddress;
//        this.ipAddress =getIpAddress();
        this.title = title;
        this.isBookMark=bookMarkStatus;
        this.description=description;
    }

    public void setUniquePageID() {
         uniquePageID=++pageID;
    }
    public int getUniquePageID() {
        return uniquePageID;
    }

    public String getUrl() {
        return url;
    }

    public String getTitle() {
        return title;
    }

    public String getIpAddress() {
        Random r = new Random();
        return r.nextInt(223) + "." + r.nextInt(256) + "." + r.nextInt(256) + "." + r.nextInt(256);
    }

    public int getProtal() {
        return protal;
    }

    public int getPageID() {
        return pageID;
    }

    public static int getVisitTime() {
        return visitTime;
    }

  
    
    // KUN HENG METHOD
    public String getDescription() {
        return description;
    }

    public boolean isIsBookMark() {
        return isBookMark;
    }

    public void setIsBookMark() {
        this.isBookMark =true;
    }

    public boolean comparePageID(int pageID)
    {
        return this.uniquePageID==pageID;
    }
    
    @Override
    public int compareTo(webPage page) {
       return this.title.compareTo(page.title);
    }
     public int compare(webPage page)
     {
         return this.title.compareTo(page.title);
     }
   
    
    public String toString()
    {
      
        return  "ipAddress:"+ipAddress+"\n"
                +"Title:"+ title +"\n"
                +"PageID:"+uniquePageID;
    }
}
