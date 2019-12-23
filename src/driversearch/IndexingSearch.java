/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package driversearch;

import java.util.Scanner;

/**
 *
 * @author Francis Tan Eng Yee
 */
public class IndexingSearch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        testHashTable();
        System.out.println("\nThe search is completed.");
    }

    public static void testHashTable() {
        HashedDictionary<webPage, String> webPageList = new HashedDictionary<webPage, String>(11);

        System.out.println("-----------------------------------------------------------------------");
        System.out.println("testHashTable():");

        System.out.println("Create a dictionary whose initial hash table has 23 locations:\n");
        System.out.println("Initial dictionary should be empty; isEmpty() returns " + webPageList.isEmpty());

        System.out.println("\n\nTesting add() - add 10 webpages:\n");
        webPageList.add(new webPage("www.xiaomi.com"), "100.100.10.16");
        webPageList.add(new webPage("www.doro.com"), "126.124.128.224");
        webPageList.add(new webPage("www.motorola.com"), "220.220.220.1");
        webPageList.add(new webPage("www.zte.com"), "252.228.224.128");
        webPageList.add(new webPage("www.wileyfox.com"), "136.130.130.13");
        webPageList.add(new webPage("www.zenphone.com"), "111.111.111.111");
        webPageList.add(new webPage("www.yobao.com"), "122.122.122.122");
        webPageList.add(new webPage("www.xperia.com"), "133.133.133.133");
        webPageList.add(new webPage("www.amazon.com"), "144.144.144.144");
        webPageList.add(new webPage("www.meizu.com"), "155.155.155.155");

        System.out.println("Dictionary should not be full; isFull() returns " + webPageList.isFull() + "\n");
        System.out.println("Dictionary contains " + webPageList.getSize() + " , as follows:\n");
        System.out.println(webPageList);

        System.out.println("\nThe hash table is:\n");
        System.out.println(webPageList);

        System.out.println("\nRemove www.xiaomi.com, add www.asus.com:");
        webPageList.remove(new webPage("www.xiaomi.com"));
        webPageList.add(new webPage("www.asus.com", "A100"), "11.11.11.11");
        System.out.println("\nThe hash table is:\n");
        System.out.println(webPageList);

        System.out.println("\nRemove www.motorola.com, add www.bose.com:");
        webPageList.remove(new webPage("www.motorola.com"));
        webPageList.add(new webPage("www.bose.com", "B200"), "22.22.22.22");
        System.out.println("\nThe hash table is:\n");
        System.out.println(webPageList);

        System.out.println("\nRemove www.wileyfox.com, add www.celkon.com:");
        webPageList.remove(new webPage("www.wileyfox.com"));
        webPageList.add(new webPage("www.celkon.com", "C300"), "33.33.33.33");
        System.out.println("\nThe hash table is:\n");
        System.out.println(webPageList);

        System.out.println("\nRemove www.zte.com, add www.dixon.com:");
        webPageList.remove(new webPage("www.zte.com"));
        webPageList.add(new webPage("www.dixon.com", "D400"), "44.44.44.44");
        System.out.println("\nThe hash table is:\n");
        System.out.println(webPageList);

        System.out.println("\nRemove www.doro.com, add www.epson.com:");
        webPageList.remove(new webPage("www.doro.com"));
        webPageList.add(new webPage("www.epson.com", "E500"), "55.55.55.55");
        System.out.println("\nThe hash table is:\n");
        System.out.println(webPageList);

        System.out.println("\nRemove www.zte.com, add www.foxcon.com:");
        webPageList.remove(new webPage("www.zte.com"));
        webPageList.add(new webPage("www.foxcon.com", "F600"), "66.66.66.66");
        System.out.println("\nThe hash table is:\n");
        System.out.println(webPageList);

        Scanner input = new Scanner(System.in);
        char status;
        String keyword1;
        String keyword2;
        long startTime, finishTime;
        do {
            System.out.println("Enter search object: ");
            keyword1 = input.nextLine();

            System.out.println("Enter model name, leave blank if none: ");
            keyword2 = input.nextLine();

            System.out.print("Key in anymore?(Y/N): ");
            status = input.next().charAt(0);
            input.nextLine();

        } while (status == 'y' || status == 'Y');
        startTime = System.nanoTime();
        if (webPageList.contains(new webPage(keyword1.toLowerCase(), keyword2.toUpperCase()))) {
            System.out.println(keyword1 + " is in the dictionary");
        }
        finishTime = System.nanoTime();
        System.out.println("Total time taken: " + (finishTime - startTime) + " nanoseconds");

    }
}
