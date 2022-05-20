package src.obj.objKasir;

public class Minuman extends Menu {

    public Minuman(String nama, Integer harga) {
        super(nama, harga);
    }

    @Override
    public String toString() {
        return super.getNama();
    }
    
}
