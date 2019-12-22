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
public interface SearchADT<webPage>{
    public void add(webPage wp);
    /*
    description:
    precondition:
    postcondition:
    result:
    */
    
    public String allWebpage();
    /*
    description:
    precondition:
    postcondition:
    result:
    */
    
    public String searchInclusion(String title);
    /*
    description:
    precondition:
    postcondition:
    result:
    */
    
    public String searchExclusion(String exclude);
    /*
    description:
    precondition:
    postcondition:
    result:
    */
    
    public String searchCertainDate(String date);
    /*
    description:
    precondition:
    postcondition:
    result:
    */
    
    public String searchBefore(String date);
    /*
    description:
    precondition:
    postcondition:
    result:
    */
    
    public String searchAfter(String date);
    /*
    description:
    precondition:
    postcondition:
    result:
    */
    
    public String searchBetweenDate(String date1, String date2);
    /*
    description:
    precondition:
    postcondition:
    result:
    */
    
    public String searchByUrl(String url);
    /*
    description:
    precondition:
    postcondition:
    result:
    */
}
