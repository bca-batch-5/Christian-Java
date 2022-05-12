package src;

import src.obj.bio;

public class TaskBasic {
    public static void main(String[] args) {
        bio christian = new bio("Christian", 
        "Bernard", 
        "Malang", 
        "2001", 
        "JavaScript");

        System.out.println("Bio Data");
        System.out.println("Name:" + christian.getFirstName() +" "+ christian.getLastName());
        System.out.println("Tempat & Tahun Lahir: " + christian.getTempatLahir() +"-"+ christian.getTahunLahir());
        System.out.println("Bahasa Program Favorit: " + christian.getBahasaProgramFavorit());
        System.out.println("-----------------------------------------------------");
        System.out.println(kelipatan(60));
    }

    public  static String kelipatan(int angka){
        if(angka %3 == 0 && angka %5 == 0){
            return "Angka ini kelipatan 3 dan 5";
        }else if(angka %5 == 0 ){
            return "Angka ini kelipatan 5";
        }else if(angka %3 == 0){
            return "Angka ini kelipatan 3";
        }else{
            return "Angka ini bukan kelipatan 3 dan 5";
        }
    }

}
