package View;

import java.util.Scanner;

import Controller.PaketController;
import Main.Main;
import Model.ModeTranpostasi;
import Model.Paket;
import Model.PaketLaut;
import Model.PaketUdara;

public class MainMenu {

    static Scanner scan = new Scanner(System.in);

    public MainMenu() {

        showMenu();

    }
    
    
    public void showMenu() {

        boolean isRunning = true;

        while (isRunning) {
            
            try {
                
                System.out.print("Masukkan banyak paket : ");
                int jumlahPaket = Integer.parseInt(scan.nextLine());

                for (int i = 0; i < jumlahPaket; i++) {
                    
                    new showModeTransportasi();

                    System.out.print("Masukkan mode transportasi : ");
                    int mode = Integer.parseInt(scan.nextLine());

                    new showMenuTipeBarang();                    

                    System.out.print("Masukkan tipe barang : ");
                    int tipe = Integer.parseInt(scan.nextLine());
                    
                    switch (mode) {
                        case 1:
                            
                            Main.listPaket.add(menuPaketDarat(PaketController.getMode(mode), tipe));

                            break;
                        case 2:

                            Main.listPaket.add(menuPaketLaut(PaketController.getMode(mode), tipe));
                            
                            break;
                        case 3:

                            Main.listPaket.add(menuPaketUdara(PaketController.getMode(mode), tipe));

                            break;
                    
                        default:

                            System.out.println("Pilihan tidak ada!");

                            break;
                    }

                }

                new showTotalHarga();

            } catch (Exception e) {
                
                System.out.println("Input error!");

            }

        }

    }

    public Paket menuPaketDarat(ModeTranpostasi mode, int tipe) {

        System.out.print("Masukkan berat barang : ");
        double berat = Integer.parseInt(scan.nextLine());

        Paket paket = new PaketLaut(berat, mode, PaketController.getTipe(tipe), 0, 0, 0, false);

        paket.setHarga(PaketController.hitungBiaya(berat, PaketController.getTipe(tipe)));

        return paket;

    }

    public Paket menuPaketLaut(ModeTranpostasi mode, int tipe) {

        System.out.print("Masukkan berat barang : ");
        double berat = Integer.parseInt(scan.nextLine());

        System.out.print("Masukkan panjang barang : ");
        double panjang = Integer.parseInt(scan.nextLine());
        
        System.out.print("Masukkan lebar barang : ");
        double lebar = Integer.parseInt(scan.nextLine());

        System.out.print("Masukkan tinggi barang : ");
        double tinggi = Integer.parseInt(scan.nextLine());

        System.out.print("Pakai asuransi ? (true/false)");
        boolean asuransi = Boolean.parseBoolean(scan.nextLine());

        Paket paket = new PaketLaut(berat, mode, PaketController.getTipe(tipe), panjang, lebar, tinggi, asuransi);

        paket.setHarga(PaketController.hitungBiaya(panjang, lebar, tinggi, asuransi, PaketController.getTipe(tipe)));

        return paket;

    }

    public Paket menuPaketUdara(ModeTranpostasi mode, int tipe) {

        System.out.print("Masukkan berat barang : ");
        double berat = Integer.parseInt(scan.nextLine());

        System.out.print("Masukkan panjang barang : ");
        double panjang = Integer.parseInt(scan.nextLine());
        
        System.out.print("Masukkan lebar barang : ");
        double lebar = Integer.parseInt(scan.nextLine());

        System.out.print("Masukkan tinggi barang : ");
        double tinggi = Integer.parseInt(scan.nextLine());

        System.out.print("Pakai asuransi ? (true/false)");
        boolean asuransi = Boolean.parseBoolean(scan.nextLine());

        new showMenuJenisPengiriman();

        System.out.print("Masukkan jenis pengiriman : ");
        int jenis = Integer.parseInt(scan.nextLine());

        Paket paket = new PaketUdara(berat, mode, PaketController.getTipe(tipe), panjang, lebar, tinggi, PaketController.getJenis(jenis), asuransi);

        paket.setHarga(PaketController.hitungBiaya(panjang, lebar, tinggi, asuransi, PaketController.getTipe(tipe), PaketController.getJenis(jenis)));

        return paket;

    }

}
