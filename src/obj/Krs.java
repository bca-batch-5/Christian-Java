package src.obj;

public class Krs {
    private Integer sks = 0;
    private String namaMatkul;
    private String namaSiswa;

    public Integer getSks() {
        return sks;
    }

    public void setSks(Integer sks) {
        this.sks = sks;
    }

    public Krs(Integer sks, String namaMatkul, String namaSiswa) {
        this.sks = sks;
        this.namaMatkul = namaMatkul;
        this.namaSiswa = namaSiswa;
    }

    public String getNamaMatkul() {
        return namaMatkul;
    }

    public void setNamaMatkul(String namaMatkul) {
        this.namaMatkul = namaMatkul;
    }

    public String getNamaSiswa() {
        return namaSiswa;
    }

    @Override
    public String toString() {
        return "Krs [namaMatkul=" + namaMatkul + ", namaSiswa=" + namaSiswa + ", sks=" + sks + "]";
    }

    public void setNamaSiswa(String namaSiswa) {
        this.namaSiswa = namaSiswa;
    }
   

}
