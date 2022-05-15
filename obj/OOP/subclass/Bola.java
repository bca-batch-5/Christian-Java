package src.obj.OOP.subclass;

import src.obj.OOP.Lingkaran;

public class Bola extends Lingkaran {
    public Bola(float jariJari) {
        super(jariJari);
    }

    public double getVolume() {
        return 4 * super.getPhi() * Math.pow(super.getJariJari(), 3)/3;
    }
}
