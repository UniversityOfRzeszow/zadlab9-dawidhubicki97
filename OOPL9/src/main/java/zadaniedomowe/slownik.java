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
     HashMap<String, String> tlumacz = new HashMap<>();
        tlumacz.put("stadion", "stadium");
        tlumacz.put("plecak", "backpack");
        tlumacz.put("drwi", "doors");
        tlumacz.put("szkoła", "school");
        tlumacz.put("woda", "water");
        tlumacz.put("ogień", "fire");
        tlumacz.put("ziemia", "earth");
        tlumacz.put("droga", "road");
        tlumacz.put("statek", "ship");
        tlumacz.put("samolot", "plane");
        tlumacz.put("pies", "dog");
        tlumacz.put("kot", "cat");
        tlumacz.put("niedźwiedź", "bear");
        tlumacz.put("małpa", "monkey");
        tlumacz.put("ciasto","cake");
       
        
       System.out.println("Podaj słowo: ");
       Scanner odczyt=new Scanner(System.in);
       String wyraz=null;
       String konczace="koniec!";
       do
       {
               System.out.println("Podaj slowo: ");
          wyraz=odczyt.nextLine();
           System.out.println("Slowo: "+wyraz+" To po anigelsku:  "+tlumacz.get(wyraz));
       }
       while(!wyraz.equals(konczace));
    }
    }
    

