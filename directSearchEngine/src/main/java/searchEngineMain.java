
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author nakamura
 */
public class searchEngineMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws UnknownHostException {
        // TODO code application logic here
        String choice,ipAddress;
        int Protocol;
        URL urlProtocol = null; 
        // TODO code application logic here
        searchEngineADT<searchEngineClass> glist = new searchClass();
        Scanner scan = new Scanner(System.in);
        do{
            System.out.println("Enter URL : ");
            String url = scan.next();
            System.out.println("Enter Title : ");
            String title = scan.next();
            try {
                InetAddress ip = InetAddress.getByName(new URL("https://" + url).getHost());
                ipAddress = ip.toString();
                urlProtocol = new URL("https://" + url); 
                String URLProtocol = urlProtocol.getProtocol();
                searchEngineClass s1 = new searchEngineClass(url,title,ipAddress.replaceAll(url + "/",""),URLProtocol);
                glist.add(s1);
            } catch (MalformedURLException ex) {
                Logger.getLogger(searchEngineClass.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println("Do you to continue? ");
            choice = scan.next();
        }while(choice.equalsIgnoreCase("Y"));
        System.out.println("Enter Title u wanted to search! ");
        String name = scan.next();
        for(int i = 0; i < glist.Size(); i++){
          if(name.compareToIgnoreCase(glist.getItem(i).getTitle()) > 0){
             System.out.println(glist.getItem(i).getCode());
             System.out.println(glist.getItem(i).getTitle());
          }
        }
        //System.out.println(webPage.getItem(index).toString());
        System.out.println(glist);
        long runTime = System.currentTimeMillis();
    }
}
