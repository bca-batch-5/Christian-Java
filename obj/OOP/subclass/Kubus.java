package src.obj.OOP.subclass;

import src.obj.OOP.Persegi;

public class Kubus extends Persegi{
    
    public Kubus(int sisi) {
        super(sisi);
        this.setSisi(sisi);
    }

    public double getVolume(){
        return Math.pow(super.getSisi(), 3);
    }
    
}
