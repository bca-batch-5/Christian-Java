package src.obj.OOP;

public class PersegiPanjang {
    private int panjang;
    private int lebar;

    
    public PersegiPanjang(int panjang, int lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }
    public int getPanjang() {
        return panjang;
    }
    public void setPanjang(int panjang) {
        this.panjang = panjang;
    }
    public int getLebar() {
        return lebar;
    }
    public void setLebar(int lebar) {
        this.lebar = lebar;
    } 
    
    public int getKeliling(){
        return 2*(panjang + lebar);
    }

    public int getLuas(){
        return panjang * lebar;
    }
    

}
