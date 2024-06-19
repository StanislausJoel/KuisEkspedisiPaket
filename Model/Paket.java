package Model;

public abstract class Paket {
    
    private double berat;
    private double harga;
    private ModeTranpostasi mode;

    public Paket(double berat, ModeTranpostasi mode) {
        this.berat = berat;
        this.mode = mode;
    }

    public double getBerat() {
        return berat;
    }

    public void setBerat(double berat) {
        this.berat = berat;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public ModeTranpostasi getMode() {
        return mode;
    }

    public void setMode(ModeTranpostasi mode) {
        this.mode = mode;
    }

}
