/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Segitiga;

/**
 *
 * @author DELLA
 */

class Segitiga {
    private double alas;
    private double tinggi;
    private double sisi;

    public Segitiga() {
        alas = 0;
        tinggi = 0;
        sisi = 0;
    }

    public void setAlas(double alasBaru) {
        alas = alasBaru;
    }

    public void setTinggi(double tinggiBaru) {
        tinggi = tinggiBaru;
    }

    public void setSisi(double sisiBaru) {
        sisi = sisiBaru;
    }
    
    public Segitiga(double alasBaru, double tinggiBaru, double sisiBaru) {
        alas = alasBaru;
        tinggi = tinggiBaru;
        sisi = sisiBaru;
    }
    
    public double getLuas() {
        return 0.5 * alas * tinggi;
    }

    public double getKeliling() {
        return alas + sisi + sisi;
    }
}

public class Main {
    public static void main(String[] args) {
        Segitiga segitiga1 = new Segitiga(1, 1, 1);
        
        System.out.println("Segitiga 1:");
        System.out.println("Luas: " + segitiga1.getLuas());
        System.out.println("Keliling: " + segitiga1.getKeliling());
        System.out.println("-------------------------------");

        Segitiga segitiga2 = new Segitiga(30, 10, 90);

        System.out.println("\nSegitiga 2:");
        System.out.println("Luas: " + segitiga2.getLuas());
        System.out.println("Keliling: " + segitiga2.getKeliling());
        System.out.println("-------------------------------");
        
        Segitiga segitiga3 = new Segitiga(20, 30, 60);

        System.out.println("\nSegitiga 3:");
        System.out.println("Luas: " + segitiga3.getLuas());
        System.out.println("Keliling: " + segitiga3.getKeliling());
        System.out.println("-------------------------------");
    }
}
