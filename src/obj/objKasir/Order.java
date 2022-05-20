package src.obj.objKasir;

import java.util.List;

public class Order{
    private List<Makanan> PesananMakan;
    private List<Minuman> PesananMinuman;
    private Integer totalHarga;
    private List<PaketMakan> daftarOrderPaket;
    
    
    @Override
    public String toString() {
        return "Order [PesananMakan=" + PesananMakan + ", PesananMinuman=" + PesananMinuman + ", daftarOrderPaket="
                + daftarOrderPaket + ", totalHarga=" + totalHarga + "]";
    }
    public List<Makanan> getPesananMakan() {
        return PesananMakan;
    }
    public void setPesananMakan(List<Makanan> pesananMakan) {
        PesananMakan = pesananMakan;
    }
    public List<Minuman> getPesananMinuman() {
        return PesananMinuman;
    }
    public void setPesananMinuman(List<Minuman> pesananMinuman) {
        PesananMinuman = pesananMinuman;
    }
    public Integer getTotalHarga() {
        return totalHarga;
    }
    public void setTotalHarga(Integer totalHarga) {
        this.totalHarga = totalHarga;
    }
    public List<PaketMakan> getDaftarOrderPaket() {
        return daftarOrderPaket;
    }
    public void setDaftarOrderPaket(List<PaketMakan> daftarOrderPaket) {
        this.daftarOrderPaket = daftarOrderPaket;
    }
}
