package src.obj.OOP;

import src.obj.OOP.Interfaces.BangunDatar;

public class Lingkaran implements BangunDatar{
    private float jariJari;
    final double phi = 3.14;

    public Lingkaran(float jariJari) {
        this.jariJari = jariJari;
    }

    public float getJariJari() {
        return jariJari;
    }

    public void setJariJari(float jariJari) {
        this.jariJari = jariJari;
    }

    public double getKelilingLingkaran(){
        if(jariJari %7 == 0){
            return Math.round(2 * phi *jariJari); 
        }
        return 2 * phi *jariJari;
    }

    public double getPhi(){
        return phi;
    }

    public double getLuasLingkaran(){
        if(jariJari %7 == 0){
            return Math.round(phi * jariJari * jariJari);
        }
        return phi * jariJari * jariJari;
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
    public int getKeliling() {
        return 0;
    }

    @Override
    public int getLuas() {
        return 0;
    }
}
