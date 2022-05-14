package src.obj.OOP.subclass;

import src.obj.OOP.Persegi;

public class Kubus extends Persegi{
    int sisiKubus = super.getSisi();

    public Kubus(int sisi) {
        super(sisi);
        this.setSisi(sisi);
    }

    public double getVolume(){
        return Math.pow(sisiKubus, 3);
    }
    
}
