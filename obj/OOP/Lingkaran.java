package src.obj.OOP;


public class Lingkaran {
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

    public double getKeliling(){
        if(jariJari %7 == 0){
            return Math.round(2 * phi *jariJari); 
        }
        return 2 * phi *jariJari;
    }

    public double getPhi(){
        return phi;
    }

    public double getLuas(){
        if(jariJari %7 == 0){
            return Math.round(phi * jariJari * jariJari);
        }
        return phi * jariJari * jariJari;
    }
    
}
