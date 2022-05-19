package obj.objKasir;

public class Menu {
    private String nama;
    private Integer harga;
    
    public Menu(String nama, Integer harga) {
        this.nama = nama;
        this.harga = harga;
    }
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public Integer getHarga() {
        return harga;
    }
    public void setHarga(Integer harga) {
        this.harga = harga;
    }
    
}
