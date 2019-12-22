package webPage;

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
 public webPage(String url, String title,String ipAddress,String description){
        
        this.url = url;
        this.ipAddress = ipAddress;
        this.title = title;
        isBookMark=false;
        this.description=description;
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

    @Override
    public int compareTo(webPage page) {
       return this.ipAddress.compareTo(page.ipAddress);
    }
    
    
    public String toString()
    {
        return  "ipAddress:"+ipAddress+"\n"
                +"Title:"+ title +"\n";
    }
}
