package obj.objKasir;

public class Makanan extends Menu {

    public Makanan(String nama, Integer harga) {
        super(nama, harga);
    }

    @Override
    public String toString() {
        return super.getNama();
    }
    
    
}
