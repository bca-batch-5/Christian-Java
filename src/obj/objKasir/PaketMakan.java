package src.obj.objKasir;

public class PaketMakan extends Menu {

    public PaketMakan(String nama, Integer harga) {
        super(nama, harga);
    }
    
    @Override
    public String toString() {
        return super.getNama();
    }
}
