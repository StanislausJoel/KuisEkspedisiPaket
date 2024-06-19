package Controller;

import Model.*;

public class PaketController {
    
    public double hitungBiaya(double berat, TipeBarang type) {

        double total = berat * 15000;

        if (type == TipeBarang.BERHARGA) {
            
            total = total * 1.05;

        }

        return total;

    }

    public double hitungBiaya(double panjang, double lebar, double tinggi, boolean asuransi, TipeBarang type) {

        double harga = 0;
        double basePrice = 0;
        double volume = panjang * lebar * tinggi;

        if (volume <= 2500) {
            
            basePrice = 100;

        }
        else {

            basePrice = 75;

        }

        harga = basePrice * volume;

        if (type == TipeBarang.BERHARGA) {
            
            harga = harga * 1.05;

        }

        if (asuransi) {
            
            harga = harga * 1.015;

        }
        
        return harga;

    }

    public double hitungBiaya(double panjang, double lebar, double tinggi, boolean asuransi, TipeBarang type, JenisPengiriman jenisPengiriman) {

        double harga = 0;
        double basePrice = 0;
        double volume = panjang * lebar * tinggi;

        if (jenisPengiriman == JenisPengiriman.EXPRESS) {
            
            basePrice = 45;

        }
        else {

            basePrice = 60;

        }

        harga = basePrice * volume;

        if (type == TipeBarang.BERHARGA) {
            
            harga = harga * 1.05;

        }

        if (asuransi) {
            
            harga = harga * 1.02;

        }
        
        return harga;

    }

}
