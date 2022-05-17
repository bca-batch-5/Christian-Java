package src.obj.OOP.subclass;

import src.obj.OOP.Lingkaran;

import src.obj.OOP.Interfaces.BangunRuang;

public class Bola extends Lingkaran implements BangunRuang{
    public Bola(float jariJari) {
        super(jariJari);
    }

    public double volume() {
        return 4 * super.getPhi() * Math.pow(super.getJariJari(), 3)/3;
    }

    public int  getKeliling(){
        return 0;
    }

    public int getLuas(){
        return 0;
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
