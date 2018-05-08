/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl9.zad1;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author student
 */
public class liczby {

    int[] tablica = new int[100];
    Random losuj = new Random();

    public void sortuj() {
        Arrays.sort(tablica);
    }

    public liczby() {
        for (int i = 0; i < 100; i++) {
            tablica[i] = losuj.nextInt();
        }
    }

    public void wypisz() {
        for (int i = 0; i < 100; i++) {
            System.out.println(tablica[i]);
        }
    }

    public static void main(String[] args) {
        liczby liczby = new liczby();
        liczby.sortuj();
        liczby.wypisz();

    }

}
