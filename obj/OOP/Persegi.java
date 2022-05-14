package src.obj.OOP;

public class Persegi {
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
    
}
