package src.obj;

public class bio {

    private String firstName;
    private String lastName;
    private String tempatLahir;
    private String tahunLahir;
    private String bahasaProgramFavorit;

    

    public bio(String firstName, String lastName, String tempatLahir, String tahunLahir, String bahasaProgramFavorit) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.tempatLahir = tempatLahir;
        this.tahunLahir = tahunLahir;
        this.bahasaProgramFavorit = bahasaProgramFavorit;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public String getFirstName(){
       return this.firstName;
    }
    // -------------------------------------------------
    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public String getLastName(){
       return this.lastName;
    }
        // -------------------------------------------------
    public void setTempatLahir(String tempatLahir){
        this.tempatLahir = tempatLahir;
    }

    public String getTempatLahir(){
       return this.tempatLahir;
    }

    // -------------------------------------------------
    public void setTahunLahir(String tahunLahir){
        this.tahunLahir = tahunLahir;
    }

    public String getTahunLahir(){
       return this.tahunLahir;
    }

        // -------------------------------------------------
    public void setBahasaProgramFavorit(String bahasaProgramFavorit){
        this.bahasaProgramFavorit = bahasaProgramFavorit;
    }

    public String getBahasaProgramFavorit(){
       return this.bahasaProgramFavorit;
    }
    
}
