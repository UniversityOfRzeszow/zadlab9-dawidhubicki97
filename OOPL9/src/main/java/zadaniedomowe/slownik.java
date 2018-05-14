/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zadaniedomowe;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author Dawid
 */
public class slownik {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     HashMap<String, String> slownik = new HashMap<>();
        slownik.put("stadion", "stadium");
        slownik.put("plecak", "backpack");
        slownik.put("drwi", "doors");
        slownik.put("szkoła", "school");
        slownik.put("woda", "water");
        slownik.put("ogień", "fire");
        slownik.put("ziemia", "earth");
        slownik.put("droga", "road");
        slownik.put("statek", "ship");
        slownik.put("samolot", "plane");
        slownik.put("pies", "dog");
        slownik.put("kot", "cat");
        slownik.put("niedźwiedź", "bear");
        slownik.put("małpa", "monkey");
        slownik.put("ciasto","cake");
       
        
       System.out.println("Podaj słowo: ");
       Scanner odczyt=new Scanner(System.in);
       String wyraz=null;
       String konczace="koniec!";
       do
       {
               System.out.println("Podaj slowo: ");
          wyraz=odczyt.nextLine();
           System.out.println("Slowo: "+wyraz+" To po anigelsku:  "+slownik.get(wyraz));
       }
       while(!wyraz.equals(konczace));
    }
    }
    

