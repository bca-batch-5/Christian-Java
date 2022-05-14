package src.obj.OOP.subclass;

import src.obj.OOP.Lingkaran;

public class Bola extends Lingkaran {
    float jariBola = super.getJariJari();
    final double phi = super.getPhi();

    public Bola(float jariJari) {
        super(jariJari);
    }

    public double getVolume() {
        return 4 * phi * Math.pow(jariBola, 3)/3;
    }
}
