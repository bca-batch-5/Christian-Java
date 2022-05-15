package src.obj.OOP.subclass;

import src.obj.OOP.PersegiPanjang;

public class Balok extends PersegiPanjang{
    int tinggi;

    public Balok(int panjang, int lebar, int tinggi) {
        super(panjang, lebar);
        this.tinggi = tinggi;
    }
    
    public int volume(){
        return super.getPanjang() * super.getLebar() * tinggi;
    }
}
