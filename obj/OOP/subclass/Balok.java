package src.obj.OOP.subclass;

import src.obj.OOP.PersegiPanjang;

public class Balok extends PersegiPanjang{
    int panjangBalok = super.getPanjang();
    int lebar = super.getLebar();
    int tinggi;

    public Balok(int panjang, int lebar, int tinggi) {
        super(panjang, lebar);
        this.tinggi = tinggi;
    }
    
    public int volume(){
        return panjangBalok * lebar * tinggi;
    }
}
