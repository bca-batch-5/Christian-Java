package src.obj.OOP.subclass;

import src.obj.OOP.PersegiPanjang;

import src.obj.OOP.Interfaces.BangunRuang;

public class Balok extends PersegiPanjang implements BangunRuang{
    int tinggi;

    public Balok(int panjang, int lebar, int tinggi) {
        super(panjang, lebar);
        this.tinggi = tinggi;
    }
    
    public double volume(){
        return super.getPanjang() * super.getLebar() * tinggi;
    }

    public int  getKeliling(){
        return 4 * (super.getPanjang() + super.getLebar() + tinggi);
    }

    public int getLuas(){
           return 2 * (super.getPanjang() * super.getLebar() + super.getPanjang()* tinggi + super.getLebar() * tinggi);
    }
    
    @Override
    public String printNama(String namaBangunDatar) {
        return namaBangunDatar;
    }

    @Override
    public String karakteristik(String karakteristikBangun) {
        
        return karakteristikBangun;
    }  
}
