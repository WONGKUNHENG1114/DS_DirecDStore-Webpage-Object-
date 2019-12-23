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
    
    
    
    public searchEngineClass()
    {
        
        
        //LinkList<webPage> webPageArray=new webPageList();
         
//          webPageArray.duplicateCheck("directd");
//       System.out.println("Please enter the duplicate item you want to search");
//          Scanner inputSearch=new Scanner(System.in);
//          String itemSearch=inputSearch.nextLine();
//          webPageArray.duplicateCheck(itemSearch);
//         webPageArray.removeFirst();
//         webPageArray.removeLast();
//         webPageArray.removeLast();
//         webPageArray.removeLast();
//         webPageArray.removeLast();
         //System.out.print(webPageArray+"\n\n\n");
         //if listDuplicate is null then it is empty
         
         
         
         
       
        
         // System.out.println(webPageArray);
    }
    public static void main(String[] args)
    {
       
        LinkList<webPage> webPageArray=new webPageList();
        LinkList<webPage> listDuplicate=new webPageList();
        searchEngineClass se=new searchEngineClass();
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
        webPageArray.append(storeLocation5);
//        webPageArray.duplicateCheck("Directd");
        //String title,String ipAddress,String description,boolean bookMarkStatus
        
         

        int answer=7;
        Scanner input=new Scanner(System.in);
        
        do{
        System.out.println("Welcome to our directDStore website");
        System.out.println("Enter 1 to insert the data...");
        System.out.println("Enter 2 to operate the duplicateCheckItemData...");
        System.out.println("Enter 3 to display ItemData...");
        System.out.println("Enter 0 to exit directDStore website...");
        System.out.print("Enter Your input:");
        answer=Integer.parseInt(input.nextLine());
        switch(answer)
        {
            case 1:System.out.println("\n\n\n\n\n");se.dataInsertion(webPageArray);
            break;
            case 2:
                System.out.println("\n\n\n\n\n");
                   System.out.println("System operation Duplicate Search...");
                   System.out.print("Enter what value you want to search:");
                   Scanner inputItem=new Scanner(System.in);
                   String item=inputItem.nextLine();
                   listDuplicate=webPageArray.duplicateCheck(item);
                   System.out.print("Press enter to continue...");
                   new java.util.Scanner(System.in).nextLine();
                    System.out.println("\n\n\n\n\n");
                   se.taskDuplicateDelete(webPageArray,listDuplicate);
            break;
            case 3:se.displayData(webPageArray);
            break;
            case 0:System.exit(answer);
            break;
            default:System.out.println("Error input,please press enter to enter again");new java.util.Scanner(System.in).nextLine();System.out.println("\n\n\n\n\n\n");
          
        }
          System.out.println("\n\n\n\n\n");

        
        }while(answer!=0);
       
//        listDuplicate=webPageArray.duplicateCheck("Directd");
//         if(listDuplicate.Size()>=2)
//         {
//             se.taskDuplicateDelete(webPageArray,listDuplicate);
//         }
//         
//         System.out.print(webPageArray);
//        
       
         

        
    }
        private void displayData(LinkList<webPage> webPageArray){
        System.out.println("\n\n\n\n\n\n");
        System.out.println("Displaying webPages Listing.");
        System.out.println(webPageArray);
        System.out.println("Press enter to continue...");
        new java.util.Scanner(System.in).nextLine();
        System.out.println("\n\n\n\n\n\n");
    }
    private  void dataInsertion(LinkList<webPage> webPageArray)
    {
        String title;
        String IpAddress;
        String description;
      

        Scanner input=new Scanner(System.in);
        System.out.print("Enter the system title:");
        title=input.nextLine();
        System.out.print("Enter Ip Address(172.16.20.13):");
        input=new Scanner(System.in);
        IpAddress=input.nextLine();
        System.out.print("Enter content description:");
        input=new Scanner(System.in);
        description=input.nextLine();
        System.out.println("Do you want to add another record?");
        
        webPage storeLocation=new webPage(title,IpAddress,description,false);
        webPageArray.append(storeLocation);
        System.out.println("\n\n\n\n\n\n");
    }
    //WONG KUN HENG Duplicate task
    private void taskDuplicateDelete(LinkList<webPage> webPageArray,LinkList<webPage> listDuplicate)
    {
        int duplicateCount=0;
         char respond='N';
         int selectedItem=listDuplicate.Size()+1;
         duplicateCount=listDuplicate.Size();
         Scanner input=new Scanner(System.in);
         //System.out.println(duplicateCount);
         //System.out.println("\n\n "+"duplicateCount"+duplicateCount);
        // System.out.println("SearchEngineerwerwer"+listDuplicate.getItem(1-1).getUniquePageID());
        if(duplicateCount >=2)
        {
     
           System.out.println("Select what you decide to delete.");
           System.out.println("Duplicate item listing:-");
           System.out.println(listDuplicate);
           System.out.print("Enter your input:");
           selectedItem=Integer.parseInt(input.nextLine());
           System.out.println("Selected item:"+selectedItem);
           webPageArray.removeSelectedItem(listDuplicate.getItem(selectedItem-1).getUniquePageID());
    

          
        
        }
    }
}
