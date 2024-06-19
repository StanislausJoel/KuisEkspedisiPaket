package Model;

public abstract class Paket {
    
    private double berat;
    private double harga;
    private TipeBarang type;
    private ModeTranpostasi mode;
    
    public Paket(double berat, ModeTranpostasi mode) {
        this.berat = berat;
        this.mode = mode;
    }
    
    public TipeBarang getType() {
        return type;
    }

    public void setType(TipeBarang type) {
        this.type = type;
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
