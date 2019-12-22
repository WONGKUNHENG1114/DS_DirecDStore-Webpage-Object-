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
        webPage storeLocation=new webPage("Kajang.com","DirectDKajang","192.168.1.11","videodeath");
        webPage storeLocation1=new webPage("Kuantan.com","DirectDKuantan","192.168.1.12","videodeath");
        webPage storeLocation2=new webPage("ShahAlam.com","DirectDShahAlam","192.168.1.12","videodeath");
        webPage storeLocation3=new webPage("Klang.com","DirectDKlang","192.168.1.10","videodeath");
        webPage storeLocation4=new webPage("Puchong.com","DirectDPuchong","192.168.1.27","videodeath");
         webPageArray.insert(storeLocation);
         webPageArray.insert(storeLocation1);
         webPageArray.insert(storeLocation2);
         webPageArray.insert(storeLocation3);
         webPageArray.insert(storeLocation4);
         webPageArray.removeFirst();
         webPageArray.removeLast();
         webPageArray.removeLast();
         webPageArray.removeLast();
         webPageArray.removeLast();
         System.out.println(webPageArray);
         System.out.println();
        
    }
}
