
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
        searchEngineADT<webPage> glist = new searchClass();
        Scanner scan = new Scanner(System.in);
        long startTime = System.currentTimeMillis();
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
                webPage s1 = new webPage(url,title,ipAddress.replaceAll(url + "/",""),URLProtocol);
                System.out.println(s1.getPortal());
                glist.add(s1);
            } catch (MalformedURLException ex) {
                Logger.getLogger(webPage.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println("Do you to continue? ");
            choice = scan.next();
        }while(choice.equalsIgnoreCase("Y"));
        System.out.println("Do your wanted to sorting according ");
        System.out.println("1. Accoding ");
        System.out.println("2. Exit ");
        int selection = scan.nextInt();
        switch(selection){
            case 1:
                for(int i = 0; i < glist.Size(); i++){
                   System.out.println(glist.getItem(i).getCode());
                   System.out.println(glist.getItem(i).getTitle());
                }
                break;
            case 2:
        }
        //System.out.println(webPage.getItem(index).toString());
        System.out.println(glist + "\n");
        long stopTime = System.currentTimeMillis();
        System.out.println("Elasped Time: " + (stopTime - startTime) + " msecs.");
        
    }
}
