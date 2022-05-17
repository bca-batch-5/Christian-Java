package src;

import src.obj.OOP.Persegi;
import src.obj.OOP.Interfaces.BangunDatar;
import src.obj.OOP.constant.constant;

public class Abstraction {
    public static void main(String[] args) {
        BangunDatar bangunDatar = new Persegi(2);
        constant constVariable = new constant();
        System.out.println("nama bangun datar: " + bangunDatar.printNama(constVariable.getPERSEGI())); 
        System.out.println("karakteristik persegi: " + bangunDatar.karakteristik(constVariable.getKARAKTERISTIK_PERSEGI()));
        System.out.println("Keliling Persegi: " + bangunDatar.getKeliling()); 
        System.out.println("Luas Persegi: " + bangunDatar.getLuas()); 
        
        
    }
}
