/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package driversearch;

import java.util.Arrays;

/**
 *
 * @author Acer
 */
public class SearchMain {
    
    public static void main(String[] args) {
        // TODO code application logic here
        webPage wp1 = new webPage("Jan","www.mean.com","01","20190128");
        webPage wp2 = new webPage("Feb","www.mean.com","02","20190228");
        webPage wp3 = new webPage("Mar","www.mean.com","03","20190328");
        webPage wp4 = new webPage("Apr","www.mean.com","04","20190428");
        webPage wp5 = new webPage("May","www.mean.com","05","20190528");
        webPage wp6 = new webPage("June","www.mean.com","06","20190628");
        webPage wp7 = new webPage("July","www.mean.com","07","20190728");
        webPage wp8 = new webPage("Aug","www.mean.com","08","20190828");
        webPage wp9 = new webPage("Sep","www.mean.com","09","20190928");
        webPage wp10 = new webPage("Oct","www.mean.com","10","20191028");
        
        SearchADT<webPage> adt = new Search();
        adt.add(wp1);
        adt.add(wp2);
        adt.add(wp3);
        
        //array = {wp1, wp2, wp3, wp4, wp5, wp6, wp7, wp8, wp9, wp10};
        
        System.out.println("A");
        System.out.println(adt);
        //System.out.println(Arrays.toString((sadt.search("Jan"))));
        
    }
}
