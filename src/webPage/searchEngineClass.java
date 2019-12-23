package webPage;

import java.util.Scanner;

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
    
    LinkList<webPage> webPageArray=new webPageList();
    LinkList<webPage> listDuplicate=new webPageList();
    
    public searchEngineClass()
    {
        System.out.println("Welcome to our directDStore website");
        System.out.print("Select 1 to insert the data");
        System.out.print("Enter 2 to operate the FilterItemData");
        System.out.print("Enter 3 to operate the duplicateCheckItemData");
        System.out.print("Enter 4 to operate the TreeSearchItemData");
        System.out.print("Enter 5 to operate indexingItemData");
        System.out.print("Enter 6 to insert the SortingItemData");
        System.out.print("Enter 0 to exit directDStore website");
        
         webPage storeLocation=new webPage("DirectDKajang","192.168.1.11","videodeath",false);
        webPage storeLocation1=new webPage("DirectDKuantan","192.168.1.12","videodeath1",false);
        webPage storeLocation2=new webPage("DirectDShahAlam","192.168.1.12","videodeath2",false);
        webPage storeLocation3=new webPage("DirectDKlang","192.168.1.10","videodeath3",false);
        webPage storeLocation4=new webPage("DirectDPuchong","192.168.1.27","videodeath4",false);
         webPage storeLocation5=new webPage("DirectDPuchong","192.168.1.27","videodeath4",false);
       
        webPageArray.append(storeLocation);
         webPageArray.append(storeLocation1);
         webPageArray.append(storeLocation2);
         webPageArray.append(storeLocation3);
         webPageArray.append(storeLocation4);
          //webPageArray.append(storeLocation5);
//         webPageArray.removeFirst();
//         webPageArray.removeLast();
//         webPageArray.removeLast();
//         webPageArray.removeLast();
//         webPageArray.removeLast();
         System.out.print(webPageArray+"\n\n\n");
         //if listDuplicate is null then it is empty
         
         
         
         listDuplicate=webPageArray.duplicateCheck("DirectDPuchong");
         if(listDuplicate.Size()>=2)
         {
             taskDuplicateDelete(webPageArray);
         }
         
         System.out.print(webPageArray);
       
        
         // System.out.println(webPageArray);
    }
    public static void main(String[] args)
    {
       
        
        //String title,String ipAddress,String description,boolean bookMarkStatus
        
         
//        String title;
//        String IpAddress;
//        String description;
//        char answer='N';
//        do{
//        Scanner input=new Scanner(System.in);
//        System.out.println("Enter the system title:");
//        title=input.nextLine();
//        System.out.println("Enter Ip Address(172.16.20.13):");
//        input=new Scanner(System.in);
//        IpAddress=input.nextLine();
//        System.out.println("Enter Ip description:");
//        input=new Scanner(System.in);
//        description=input.nextLine();
//        System.out.println("Do you want to add record");
//        }while(answer=='Y');
        searchEngineClass se=new searchEngineClass();
        
        
       
         

        
    }
    //WONG KUN HENG Duplicate task
    private void taskDuplicateDelete(LinkList<webPage> webPageArray)
    {
        int duplicateCount=0;
         char respond='Y';
         duplicateCount=listDuplicate.Size();
         //System.out.println("\n\n "+"duplicateCount"+duplicateCount);
        // System.out.println("SearchEngineerwerwer"+listDuplicate.getItem(1-1).getUniquePageID());
        if(duplicateCount >=2)
        {
             do
        {
           System.out.println("Select what you decide to delete.");
           System.out.println("Duplicate item listing:-");
           System.out.println(listDuplicate);
           System.out.println("Selected item:"+1);
           webPageArray.removeSelectedItem(listDuplicate.getItem(1-1).getUniquePageID());
           duplicateCount--;
            
           if(duplicateCount==0)
           {
               System.out.println("There is no duplicate item left");
               break;
           }
           System.out.println("You want continue to delete?");
        }while(duplicateCount!=0 && respond=='Y');
        }
    }
}
