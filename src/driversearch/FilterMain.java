/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package driversearch;
import java.util.Scanner;

/**
 *
 * @author Neo Yong Jing
 */
public class FilterMain {
    public static void main(String[] args) {
        // TODO code application logic here
        //Instantiate webPage object
        webPage wp1 = new webPage("One and Two","www.1&2.com","01","2019/01/01");
        webPage wp2 = new webPage("One or Two","www.1/2.com","02","2019/02/01");
        webPage wp3 = new webPage("Two and Four","www.2&4.com","03","2019/03/01");
        webPage wp4 = new webPage("Two or Four","www.2/4.com","04","2019/04/01");
        webPage wp5 = new webPage("Three and Six","www.3&6.com","05","2019/05/01");
        webPage wp6 = new webPage("Three or Six","www.3/6.com","06","2019/06/01");
        webPage wp7 = new webPage("Pie and Milk","www.p&m.com","07","2019/07/01");
        webPage wp8 = new webPage("Pie or Milk","www.p/m.com","08","2019/08/01");
        webPage wp9 = new webPage("Brush and Pen","www.b&p.com","09","2019/09/01");
        webPage wp10 = new webPage("Brush or Pen","www.b/p.com","10","2019/10/01");
        webPage wp11 = new webPage("Bag and Pouch","www.b&p.com","10","2019/11/01");
        webPage wp12 = new webPage("Bag or Pouch","www.b/p.com","10","2019/12/01");
        webPage wp13 = new webPage("Dog and Cat","www.b/p.com","10","2018/12/01");
        webPage wp14 = new webPage("Dog or Cat","www.b/p.com","10","2018/11/01");
        webPage wp15 = new webPage("Ali and Emy","www.b/p.com","10","2018/10/01");
        webPage wp16 = new webPage("Ali or Emy","www.b/p.com","10","2018/09/01");
        webPage wp17 = new webPage("Red and Blue","www.b/p.com","10","2018/08/01");
        webPage wp18 = new webPage("Red or Blue","www.b/p.com","10","2018/07/01");
        webPage wp19 = new webPage("Hot and Cool","www.b/p.com","10","2018/06/01");
        webPage wp20 = new webPage("Cool or Hot","www.b/p.com","10","2018/05/01");
        
        //Put webPage into List
        FilterADT<webPage> adt = new Filter();
        adt.add(wp1);
        adt.add(wp2);
        adt.add(wp3);
        adt.add(wp4);
        adt.add(wp5);
        adt.add(wp6);
        adt.add(wp7);
        adt.add(wp8);
        adt.add(wp9);
        adt.add(wp10);
        adt.add(wp11);
        adt.add(wp12);
        adt.add(wp13);
        adt.add(wp14);
        adt.add(wp15);
        adt.add(wp16);
        adt.add(wp17);
        adt.add(wp18);
        adt.add(wp19);
        adt.add(wp20);
        
        Scanner scan = new Scanner(System.in);
        
//        //Display all webpage
//        System.out.println(adt.allWebpage());
//        System.out.println("");
//        System.out.println("");
        
        double start_time,finish_time;
        System.out.print("Enter a keyword to search: ");
        String keywordInclude = scan.nextLine();
        start_time = System.nanoTime();
        System.out.println(adt.searchInclusion(keywordInclude));
        finish_time = System.nanoTime();
        System.out.println("Total Time Taken: " + (double)(finish_time - start_time)  + " nanoseconds");
        System.out.println();
        System.out.println();
        
        //Display search result that excluding certain keyword
        System.out.print("Enter a keyword to exclude in search: ");
        String keywordExclude = scan.nextLine();
        start_time = System.nanoTime();
        System.out.println(adt.searchExclusion(keywordExclude));
        finish_time = System.nanoTime();
        System.out.println("Total Time Taken: " + (double)(finish_time - start_time)  + " nanoseconds");
        System.out.println("");
        System.out.println("");
        
        
        //Display search result based on certain date
        System.out.print("Enter a date to search (yyyy/mm/dd): ");
        String date = scan.nextLine();
        while(checkFormat(date) == false){
            System.out.print("Please re-enter the date according to the format: yyyy/mm/dd: ");
            date = scan.nextLine();
        }
        start_time = System.nanoTime();
        System.out.println(adt.searchCertainDate(date));
        finish_time = System.nanoTime();
        System.out.println("Total Time Taken: " + (double)(finish_time - start_time)  + " nanoseconds");
        System.out.println("");
        System.out.println("");
        
        
        //Display search result before certain date 
        System.out.print("Search before certain date (yyyy/mm/dd): ");
        date = scan.nextLine();
        while(checkFormat(date) == false){
            System.out.print("Please re-enter the date according to the format: yyyy/mm/dd: ");
            date = scan.nextLine();
        }
        start_time = System.nanoTime();
        System.out.println(adt.searchBefore(date));
        finish_time = System.nanoTime();
        System.out.println("Total Time Taken: " + (double)(finish_time - start_time)  + " nanoseconds");
        System.out.println("");
        System.out.println("");
        
        
        //Display search result after certain date
        System.out.print("Search after certain date (yyyy/mm/dd): ");
        date = scan.nextLine();
        while(checkFormat(date) == false){
            System.out.print("Please re-enter the date according to the format: yyyy/mm/dd: ");
            date = scan.nextLine();
        }
        start_time = System.nanoTime();
        System.out.println(adt.searchAfter(date));
        finish_time = System.nanoTime();
        System.out.println("Total Time Taken: " + (double)(finish_time - start_time)  + " nanoseconds");
        System.out.println("");
        System.out.println("");
        
        
        //Display search result between certain dates
        System.out.println("Search between certain dates: ");
        System.out.print("Enter first date (yyyy/mm/dd): ");
        String date1 = scan.nextLine();
        while(checkFormat(date1) == false){
            System.out.print("Please re-enter first date according to the format: yyyy/mm/dd: ");
            date1 = scan.nextLine();
        }
        System.out.print("Enter second date (yyyy/mm/dd): ");
        String date2 = scan.nextLine();
        while(checkFormat(date2) == false){
            System.out.print("Please re-enter second date according to the format: yyyy/mm/dd: ");
            date2 = scan.nextLine();
        }
        start_time = System.nanoTime();
        System.out.println(adt.searchBetweenDate(date1, date2));
        finish_time = System.nanoTime();
        System.out.println("Total Time Taken: " + (double)(finish_time - start_time)  + " nanoseconds");
        System.out.println("");
        System.out.println("");
        
        
        //Display search result based on url
        System.out.print("Enter an url: ");
        String url = scan.nextLine();
        start_time = System.nanoTime();
        System.out.println(adt.searchByUrl(url));
        finish_time = System.nanoTime();
        System.out.println("Total Time Taken: " + (double)(finish_time - start_time)  + " nanoseconds");
        System.out.println("");
        System.out.println("");
    }
    
    private static boolean checkFormat(String date){
        if(!date.matches("\\d\\d\\d\\d/\\d\\d/\\d\\d"))
            return false;
        else
            return true;
    }
}
