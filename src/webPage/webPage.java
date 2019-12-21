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
public class webPage {
    private String url,title,ipAddress;
    private int protal;
    private String description;
    private boolean isBookMark;
    
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
        this.description=description;
        this.url = url;
        this.ipAddress = ipAddress;
        this.title = title;
        isBookMark=false;
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
    
}
