package src.obj.OOP;

import src.obj.OOP.Interfaces.BangunDatar;

public class Persegi implements BangunDatar {
    private int sisi;

    public Persegi(int sisi) {
        this.sisi = sisi;
    }

    public int getSisi() {
        return sisi;
    }

    public void setSisi(int sisi) {
        this.sisi = sisi;
    }

    public int getKeliling(){
     return 4*sisi;
    }

    public int getLuas(){
    return sisi * sisi; 
    }

    @Override
    public String printNama(String namaBangunDatar) {
        return namaBangunDatar;
    }

    @Override
    public String karakteristik(String karakteristikBangun) {
        
        return karakteristikBangun;
    }

    @Override
    public double getKelilingLingkaran() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public double getLuasLingkaran() {
        // TODO Auto-generated method stub
        return 0;
    }

    
}
