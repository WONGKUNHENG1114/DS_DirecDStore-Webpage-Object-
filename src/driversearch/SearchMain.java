/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package driversearch;


/**
 *
 * @author Acer
 */
public class SearchMain {
    
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
        
        //Put webPage into List
        SearchADT<webPage> adt = new Search();
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
        
        
        //Display all webpage
        System.out.println("All webpage: " + adt);
        System.out.println("");
        System.out.println("");
        
        //Display search result based on certain keyword
        System.out.println("Search result based on certain keyword: " + adt.searchInclusion("and"));
        System.out.println("");
        System.out.println("");
        
        //Display search result that excluding certain keyword
        System.out.println("Search result that excluding certain keyword: " + adt.searchExclusion("and"));
        System.out.println("");
        System.out.println("");
        
        //Display search result based on certain date
        System.out.println("Search result based on certain date: " + adt.searchCertainDate("2019/02/01"));
        System.out.println("");
        System.out.println("");
        
        //Display search result before certain date 
        System.out.println("Search result before certain date: " + adt.searchBefore("2019/04/28"));
        System.out.println("");
        System.out.println("");
        
        //Display search result after certain date
        System.out.println("Search result after certain date: " + adt.searchAfter("2019/04/28"));
        System.out.println("");
        System.out.println("");
        
        //Display search result between certain dates
        System.out.println("Search result between certain dates: " + adt.searchBetweenDate("2019/02/15", "2019/07/15"));
    }
}
