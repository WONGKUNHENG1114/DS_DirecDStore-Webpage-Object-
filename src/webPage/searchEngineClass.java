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
public class searchEngineClass {
    public static void main(String[] args)
    {
        //String url, String title,String ipAddress,String description
        LinkList<webPage> webPageArray=new webPageList();
        webPage page=new webPage("facebook.com","myBro","192.168.1.1","videodeath");
        webPage page1=new webPage("youtube.com","youtubeProduct","192.168.1.11","videodeath");
        webPage page2=new webPage("fragile.com","fargileProduct","192.168.1.12","videodeath");
        webPage page3=new webPage("Jacup.com","JacupProduct","192.168.1.13","videodeath");
         webPageArray.append(page);
         webPageArray.append(page1);
         webPageArray.append(page2);
         webPageArray.append(page3);
        
    }
}
