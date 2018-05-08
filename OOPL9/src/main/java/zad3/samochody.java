/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zad3;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author student
 */
public class samochody {

    private String marka;
    private String nazwa;
    private int predkoscmax;
    private double cena;

    @Override
    public String toString() {
        return "samochody{" + "marka=" + marka + ", nazwa=" + nazwa + ", predkoscmax=" + predkoscmax + ", cena=" + cena + '}';
    }

    public samochody(String marka, String nazwa, int predkoscmax, double cena) {
        this.marka = marka;
        this.nazwa = nazwa;
        this.predkoscmax = predkoscmax;
        this.cena = cena;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public int getPredkoscmax() {
        return predkoscmax;
    }

    public void setPredkoscmax(int predkoscmax) {
        this.predkoscmax = predkoscmax;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }
    
    public static void main(String[] args) {
       
        
        List<samochody> lista = new ArrayList<samochody>();
        samochody pierwszy = new samochody("Opel","Astra",150,10000);
        samochody drugi = new samochody("Peugeot","306",170,15000);
        samochody trzeci = new samochody("Fiat","Stilo",160,9000);
        samochody czwarty = new samochody("Bmw","z4",220,20000);
        samochody piaty = new samochody("Fiat","Punto",120,13000);
        lista.add(pierwszy);
        lista.add(drugi);
        lista.add(trzeci);
        lista.add(czwarty);
        lista.add(piaty);
        System.out.println(lista.get(2).toString());
    }
    
}
