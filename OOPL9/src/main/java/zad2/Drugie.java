/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zad2;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Int;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author student
 */
public class Drugie {

    public static void main(String[] args) {
        int[] tablica = new int[100];
        Random losuj = new Random();
        for (int i = 0; i < 100; i++) {
            tablica[i] = losuj.nextInt();
        }

        TreeSet<Integer> liczby = new TreeSet<Integer>();
        Iterator<Integer> iterator = liczby.iterator();
        for (int i = 0; i < 100; i++) {
            liczby.add(tablica[i]);
        }
        iterator = liczby.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + "\n ");
        }

    }

}
