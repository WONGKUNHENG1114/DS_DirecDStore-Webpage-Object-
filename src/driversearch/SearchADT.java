/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//Neo Yong Jing
package driversearch;

/**
 *
 * @author Acer
 */
public interface SearchADT<webPage>{
    public void add(webPage wp);
    /*
    description: add a webpage into the list
    precondition: webpage is not null
    postcondition: webpage is added into the list
    return: none
    */
    
    public String allWebpage();
    /*
    description: display all webpage in the list
    precondition: list is not null
    postcondition: all webpages in the list displayed
    return: all webpages in the list
    */
    
    public String searchInclusion(String keyword);
    /*
    description: to search the webpage with certain keyword
    precondition: keyword is not null
    postcondition: found all the webpages with keyword
    return: all webpages with keyword
    */
    
    public String searchExclusion(String keyword);
    /*
    description: to search the webpage by excluding certain keyword
    precondition: keyword is not null
    postcondition: found all the webpages without keyword
    return: all webpages without keyword
    */
    
    public String searchCertainDate(String date);
    /*
    description: to search the webpage on certain date
    precondition: date is not null and matches the format
    postcondition: found webpages with certain date
    return: all webpages with certain date
    */
    
    public String searchBefore(String date);
    /*
    description: to search the webpage before certain date
    precondition: date is not null and matches the format
    postcondition: found webpages before certain date
    return: all webpages before certain date
    */
    
    public String searchAfter(String date);
    /*
    description: to search the webpage after certain date
    precondition: date is not null and matches the format
    postcondition: found webpages after certain date
    return: all webpages after certain date
    */
    
    public String searchBetweenDate(String date1, String date2);
    /*
    description: to search the webpage between certain dates
    precondition: date is not null and matches the format
    postcondition: found webpages between certain dates
    return: all webpages between certain dates
    */
    
    public String searchByUrl(String url);
    /*
    description: to search the webpage by url
    precondition: url is not null
    postcondition: found webpage with url
    return: webpage with that url
    */
}
