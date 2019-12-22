/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithm.treesearch;

import java.util.Scanner;

/**
 *
 * @author Chris KMK
 */
public class AlgorithmTreeSearch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        TreeSearchADT<SearchEngineClass> BST1 = new TreeSearch<SearchEngineClass>();
        Scanner input = new Scanner(System.in);
        char anymore = 'y';

        SearchEngineClass s2 = new SearchEngineClass("www.xunlei.com", "192.168.80.4","HTTP");
        SearchEngineClass s3 = new SearchEngineClass("www.ppstream.com", "192.168.20.3","HTTP");
        SearchEngineClass s4 = new SearchEngineClass("www.kuwo.com", "192.168.30.2","HTTP");
        SearchEngineClass s5 = new SearchEngineClass("www.facebook.com", "192.168.90.1","HTTPS");
        SearchEngineClass s6 = new SearchEngineClass("www.pbe.com", "192.168.90.1","HTTPS");
        SearchEngineClass s7 = new SearchEngineClass("www.bing.com", "192.168.92.1","HTTPS");
        SearchEngineClass s8 = new SearchEngineClass("www.cimbclick.com", "192.168.90.1","HTTPS");
        SearchEngineClass s9 = new SearchEngineClass("www.google.com", "192.168.90.1","HTTPS");
        SearchEngineClass s10 = new SearchEngineClass("www.tarc.edu.my", "192.168.90.1","HTTPS");   
        SearchEngineClass s11 = new SearchEngineClass("www.segi.edu.my", "192.168.82.1","HTTPS");
        SearchEngineClass s12 = new SearchEngineClass("www.kugou.com", "192.167.19.4","HTTP");
        SearchEngineClass s13 = new SearchEngineClass("www.tudou.com", "192.168.22.3","HTTP");
        SearchEngineClass s14 = new SearchEngineClass("www.baidu.com", "192.168.30.2","HTTP");
        SearchEngineClass s15 = new SearchEngineClass("www.maybank.com", "192.178.33.1","HTTPS");
        SearchEngineClass s16 = new SearchEngineClass("www.greenwich.edu.uk", "192.148.63.4","HTTPS");
        SearchEngineClass s17 = new SearchEngineClass("www.myrapidkl.com.my", "192.168.96.1","HTTPS");
        SearchEngineClass s18 = new SearchEngineClass("www.translate.google.com", "192.177.71.7","HTTPS");
        SearchEngineClass s19 = new SearchEngineClass("www.outlook.com", "192.162.88.8","HTTPS");
        SearchEngineClass s20 = new SearchEngineClass("www.sougou.com", "192.121.40.11","HTTP");

        //BST1.add(s1);
        BST1.add(s2);
        BST1.add(s3);
        BST1.add(s4);
        BST1.add(s5);
        BST1.add(s6);
        BST1.add(s7);
        BST1.add(s8);
        BST1.add(s9);
        BST1.add(s10); 
        BST1.add(s11);
        BST1.add(s12);
        BST1.add(s13);
        BST1.add(s14);
        BST1.add(s15);
        BST1.add(s16);
        BST1.add(s17);
        BST1.add(s18);
        BST1.add(s19);
        BST1.add(s20);              
      
        System.out.print("List of Webpages\n================================");
        //System.out.print(s1);
        System.out.print(s2);
        System.out.print(s3);
        System.out.print(s4);
        System.out.print(s5);
        System.out.print(s6);
        System.out.print(s7);
        System.out.print(s8);
        System.out.print(s9);
        System.out.print(s10);
        System.out.print(s11);
        System.out.print(s12);
        System.out.print(s13);
        System.out.print(s14);
        System.out.print(s15);
        System.out.print(s16);
        System.out.print(s17);
        System.out.print(s18);
        System.out.print(s19);
        System.out.print(s20); 

        //Search for the webpages
        double start_time,finish_time;
        start_time = System.currentTimeMillis();
        do {
            System.out.print("Enter the website which you want to looking for: ");
            String keyword = input.nextLine();
            System.out.println("\nLooking for this website: " + BST1.contains(keyword));
            
            System.out.print("Key in anymore?(Y/N): ");
            anymore = input.next().charAt(0);
            input.nextLine();

        } while (anymore == 'y' || anymore == 'Y');
        System.out.println();
        finish_time = System.currentTimeMillis();
        System.out.println("Total Time Taken: " + (double)(finish_time - start_time)/ 1000  + " seconds");
        
        //Add the data to the tree
        start_time = System.currentTimeMillis();
        do {
            System.out.print("Enter the webpage URL: ");
            String webpage = input.nextLine();
            System.out.print("Enter the webpage of IP address: ");
            String ipaddress = input.nextLine();
            
            System.out.print("Enter the protocol for webpage: ");
            String protocol = input.nextLine().toUpperCase();
  
            SearchEngineClass s1 = new SearchEngineClass(webpage,ipaddress,protocol);
            BST1.add(s1);
            System.out.println(s1);
            
            System.out.print("Key in anymore?(Y/N): ");
            anymore = input.next().charAt(0);
            input.nextLine();
            
        } while (anymore == 'y' || anymore == 'Y');
        
        System.out.println();
        finish_time = System.currentTimeMillis();
        System.out.println("Total Time Taken: " + (double)(finish_time - start_time)/ 1000  + " seconds");
    }

}