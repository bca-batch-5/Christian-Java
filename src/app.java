package src;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import src.Service.registrationImpl;
import src.interfaces.registration;
import src.obj.Student;


public class app {
    static registration regis = new registrationImpl();
    static List<Student> siswaTerdaftar = new ArrayList<>();
    static Scanner input = new Scanner(System.in);
    static Integer inputMenu;
    static String option;
    static String namaDepan;
    static String namaBelakang;
    static String alamat;
    static Integer sks;
    static String namaMatkul;
    static int noSiswa;

    public static void menu() {
        System.out.println("Menu Akademik");
        System.out.println("1. Registrasi Person");
        System.out.println("2. List Student");
        System.out.println("3. Input KRS");
        System.out.println("4. Status Mahasiswa");
        System.out.print("Pilihan: ");
        inputMenu = input.nextInt();
        input.nextLine();
    }

    public static void pilihan() {
        do {
            menu();
            switch (inputMenu) {
                case 1:
                    System.out.println("REGISTRASI MAHASISWA BARU!!!");
                    System.out.println("---------------------------------");
                    System.out.print("First Name: ");
                    namaDepan = input.nextLine();
                    System.out.print("Last Name: ");
                    namaBelakang = input.nextLine();
                    System.out.print("Address: ");
                    alamat = input.nextLine();
                    Student siswaDaftar = new Student(namaDepan, namaBelakang, alamat);
                    siswaTerdaftar.add(siswaDaftar);
                    System.out.println(regis.regisStudent(siswaDaftar));
                    System.out.println("-----------------------------------");
                    System.out
                            .println("Selamat Datang " + siswaDaftar.getFirstName() + " " + siswaDaftar.getLastName());
                    break;

                case 2:
                    System.out.println("List Student !!");
                    System.out.println("---------------------------------");
                    for (int i = 0; i < siswaTerdaftar.size(); i++) {
                        System.out.println("Siswa no : " + i);
                        System.out.println("Nama Siswa: " + siswaTerdaftar.get(i).getFirstName() + " "
                                + siswaTerdaftar.get(i).getLastName());
                        System.out.println("KRS Siswa : " + siswaTerdaftar.get(i).getSks());
                        System.out.println("-------------------------------");
                    }
                    break;

                case 3:
                    System.out.println("Input KRS siswa");
                    System.out.println("---------------------------------");
                    System.out.print("SKS: ");
                    sks = input.nextInt();
                    System.out.print("Nomor Siswa: ");
                    noSiswa = input.nextInt();
                    System.out.print("Nama Matakuliah: ");
                    namaMatkul = input.next();
                    System.out.print(regis.inputKrs(sks, namaMatkul, noSiswa));
                    input.nextLine();
                    break;

                case 4:
                    System.out.println("Status Mahasiswa");
                    for (int i = 0; i < siswaTerdaftar.size(); i++) {
                        if (siswaTerdaftar.get(i).getSks() >= 144) {
                            System.out.println("-----------------------------------------------------");
                            System.out.println("\nNama Mahasiswa: " + siswaTerdaftar.get(i).getFullName() + "S.KOM");
                            System.out.println("KRS: " + siswaTerdaftar.get(i).getSks());
                            siswaTerdaftar.get(i).setStatus("Lulus");
                            System.out.println("Status: " + siswaTerdaftar.get(i).getStatus());
                        } else {
                            System.out.println("-----------------------------------------------------");
                            System.out.println("\nNama Mahasiswa: " + siswaTerdaftar.get(i).getFullName());
                            System.out.println("KRS: " + siswaTerdaftar.get(i).getSks());
                            siswaTerdaftar.get(i).setStatus("Belum Lulus");
                            System.out.println("Status: " + siswaTerdaftar.get(i).getStatus());
                        }
                    }
                    break;

                default:
                    System.out.println("Pilihan tidak ada!!!");
                    break;
            }
            System.out.print("\nMau pilih menu lain? Y|N: ");
            option = input.nextLine();
        } while (option.equalsIgnoreCase("Y"));
    }

    public static void main(String[] args) {
        pilihan();
        // System.out.println(regis.inputKrs(20, "Kalkulus", 0));
    }
}
