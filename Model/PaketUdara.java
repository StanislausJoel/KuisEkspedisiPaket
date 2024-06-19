package Model;

public class PaketUdara extends Paket{
    
    private double panjang;
    private double lebar;
    private double tinggi;
    private JenisPengiriman jenisPengiriman;
    private boolean asuransi;

    public PaketUdara(double berat, ModeTranpostasi mode, double panjang, double lebar, double tinggi,
            JenisPengiriman jenisPengiriman, boolean asuransi) {
        super(berat, mode);
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
        this.jenisPengiriman = jenisPengiriman;
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

    public JenisPengiriman getJenisPengiriman() {
        return jenisPengiriman;
    }

    public void setJenisPengiriman(JenisPengiriman jenisPengiriman) {
        this.jenisPengiriman = jenisPengiriman;
    }

    public boolean isAsuransi() {
        return asuransi;
    }

    public void setAsuransi(boolean asuransi) {
        this.asuransi = asuransi;
    }
    
}
