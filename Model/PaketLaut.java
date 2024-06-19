package Model;

public class PaketLaut extends Paket {
    
    private double panjang;
    private double lebar;
    private double tinggi;
    private boolean asuransi;

    public PaketLaut(double berat, ModeTranpostasi mode, TipeBarang type, double panjang, double lebar, double tinggi,
            boolean asuransi) {
        super(berat, mode, type);
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
        this.asuransi = asuransi;
    }

    public double getPanjang() {
        return panjang;
    }

    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }

    public double getLebar() {
        return lebar;
    }

    public void setLebar(double lebar) {
        this.lebar = lebar;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    public boolean isAsuransi() {
        return asuransi;
    }

    public void setAsuransi(boolean asuransi) {
        this.asuransi = asuransi;
    }

}
