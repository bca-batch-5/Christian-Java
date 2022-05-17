package src.obj.OOP.subclass;

import src.obj.OOP.Persegi;

import src.obj.OOP.Interfaces.BangunRuang;

public class Kubus extends Persegi implements BangunRuang{
    
    public Kubus(int sisi) {
        super(sisi);
        this.setSisi(sisi);
    }

    public double volume(){
        return Math.pow(super.getSisi(), 3);
    }

    public int  getKeliling(){
        return 12 * super.getSisi();
    }

    public int getLuas(){
        return 6 * super.getLuas();
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
