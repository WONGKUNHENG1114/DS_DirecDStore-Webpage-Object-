
import java.io.IOException;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
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
    public static void main(String[] args) throws UnknownHostException, MalformedURLException, IOException {
        // TODO code application logic here
        String choice,ipAddress;
        int Protocol;
        URL urlProtocol = null; 
        // TODO code application logic here
        searchEngineADT<webPage> weblist = new searchClass();
        Scanner scan = new Scanner(System.in);
        long startTime = System.currentTimeMillis();
        do{
            System.out.println("Enter URL : ");
            String url = scan.next();
            try{
                URL urlverify = new URL("https://" + url);
                URLConnection connection = urlverify.openConnection();
                connection.connect();
                System.out.println("Enter Title : ");
                String title = scan.next();
                try {
                    InetAddress ip = InetAddress.getByName(new URL("https://" + url).getHost());
                    ipAddress = ip.toString();
                    urlProtocol = new URL("https://" + url); 
                    String URLProtocol = urlProtocol.getProtocol();
                    webPage s1 = new webPage(url,title,ipAddress.replaceAll(url + "/",""),URLProtocol);
                    weblist.add(s1);
            } catch (MalformedURLException ex) {
                Logger.getLogger(webPage.class.getName()).log(Level.SEVERE, null, ex);
            }
            }catch (MalformedURLException e) {
                System.out.println("Internet is not connected");
             } catch (IOException e) {
                System.out.println("Internet is not connected");
             }
            System.out.println("Do you to continue? ");
            choice = scan.next();
        }while(choice.equalsIgnoreCase("Y"));
        System.out.println("Do your wanted to sorting according ");
        System.out.println("1. Accoding ");
        System.out.println("2. Exit ");
        String selection = scan.next();
        switch(selection){
            case "1":
                System.out.println(weblist + "\n");
                break;
            case "2":
                break;
        }
        //System.out.println(webPage.getItem(index).toString());
        long stopTime = System.currentTimeMillis();
        System.out.println("Elasped Time: " + (stopTime - startTime) + " msecs.");
        
    }
}
