package src;

import java.util.Scanner;

import src.obj.OOP.Lingkaran;
import src.obj.OOP.Persegi;
import src.obj.OOP.PersegiPanjang;
import src.obj.OOP.Interfaces.BangunDatar;
import src.obj.OOP.Interfaces.BangunRuang;
import src.obj.OOP.constant.constant;
import src.obj.OOP.subclass.Balok;
import src.obj.OOP.subclass.Bola;
import src.obj.OOP.subclass.Kubus;

public class InheritenceTugas {
    static Scanner input = new Scanner(System.in);
    static BangunDatar bangunDatar = new Persegi(0);
    static constant constantVar = new constant();
    static int inputMenu;
    static int inputHitung;
    static int inputAngka;
    static int inputLebar;
    static int inputTinggi;
    static float jari;

    public static void input() {
        System.out.println("Menu: ");
        System.out.println("1. Persegi");
        System.out.println("2. Persegi Panjang");
        System.out.println("3. Lingkaran");
        System.out.println("4. Kubus");
        System.out.println("5. Balok");
        System.out.println("6. Bola");
        System.out.print("Pilihan: ");
        inputMenu = input.nextInt();
        input.nextLine();
    }

    public static void inputBangunDatar() {
        System.out.print("\n1. Keliling");
        System.out.print("\n2. Luas\n");
        System.out.print("Pilihan: ");
        inputHitung = input.nextInt();
        input.nextLine();
    }

    public static void inputBangunRuang() {
        System.out.println("\n1. Volume");
        System.out.print("Pilihan: ");
        inputHitung = input.nextInt();
        input.nextLine();
    }

    public static void main(String[] args) {
        String option;

        do {
            input();
            switch (inputMenu) {
                case 1:
                    System.out.println("--------- "+ bangunDatar.printNama(constantVar.getPERSEGI()) +" --------");
                    inputBangunDatar();
                    switch (inputHitung) {
                        case 1:
                            System.out.print("Sisi Persegi: ");
                            inputAngka = input.nextInt();
                            input.nextLine();
                            BangunDatar persegiKel = new Persegi(inputAngka);
                            System.out.println("Keliling Persegi: " + persegiKel.getKeliling());
                            System.out.println("Karakteristik Persegi: " + bangunDatar.karakteristik(constantVar.getKARAKTERISTIK_PERSEGI()));
                            break;

                        case 2:
                            System.out.print("Sisi Persegi: ");
                            inputAngka = input.nextInt();
                            input.nextLine();
                            BangunDatar persegiLuas = new Persegi(inputAngka);
                            System.out.println("Keliling Persegi: " + persegiLuas.getLuas());
                            System.out.println("Karakteristik Persegi: " + bangunDatar.karakteristik(constantVar.getKARAKTERISTIK_PERSEGI()));
                            break;

                        default:
                            System.out.println("Menu tidak tersedia. Silahkan input ulang!");
                            break;

                    }
                    break;

                case 2:
                    System.out.println("--------- "+ bangunDatar.printNama(constantVar.getPERSEGI_PANJANG()) +" --------");
                    inputBangunDatar();
                    switch (inputHitung) {
                        case 1:
                            System.out.print("Panjang: ");
                            inputAngka = input.nextInt();
                            input.nextLine();
                            System.out.print("Lebar: ");
                            inputLebar = input.nextInt();
                            input.nextLine();
                            BangunDatar persegiPanjangKel = new PersegiPanjang(inputAngka, inputLebar);
                            System.out.println("Keliling Persegi Panjang: " + persegiPanjangKel.getKeliling());
                            System.out.println("Karakteristik Persegi Panjang: " + bangunDatar.karakteristik(constantVar.getKARAKTERISTIK_PERSEGI_PANJANG()));
                            break;

                        case 2:
                            System.out.print("Panjang: ");
                            inputAngka = input.nextInt();
                            input.nextLine();
                            System.out.print("Lebar: ");
                            inputLebar = input.nextInt();
                            input.nextLine();
                            BangunDatar persegiPanjangLuas = new PersegiPanjang(inputAngka, inputLebar);
                            System.out.println("Keliling Persegi Panjang: " + persegiPanjangLuas.getLuas());
                            System.out.println("Karakteristik Persegi Panjang: " + bangunDatar.karakteristik(constantVar.getKARAKTERISTIK_PERSEGI_PANJANG()));
                            break;

                        default:
                            System.out.println("Menu tidak tersedia. Silahkan input ulang!");
                            break;

                    }
                    break;

                case 3:
                System.out.println("--------- "+ bangunDatar.printNama(constantVar.getLINGKARAN()) +" --------");
                    inputBangunDatar();
                    switch (inputHitung) {
                        case 1:
                            System.out.print("Jari jari: ");
                            jari = input.nextFloat();
                            input.nextLine();
                            BangunDatar lingkaranKel = new Lingkaran(jari);
                            System.out.println("Keliling Lingkaran: " + lingkaranKel.getKelilingLingkaran());
                            System.out.println("Karakteristik Lingkaran: " + bangunDatar.karakteristik(constantVar.getKARAKTERISTIK_LINGKARAN()));
                            break;

                        case 2:
                            System.out.print("Jari jari: ");
                            jari = input.nextFloat();
                            input.nextLine();
                            BangunDatar lingkaranLuas = new Lingkaran(jari);
                            System.out.println("Keliling Lingkaran: " + lingkaranLuas.getLuasLingkaran());
                            System.out.println("Karakteristik Lingkaran: " + bangunDatar.karakteristik(constantVar.getKARAKTERISTIK_LINGKARAN()));
                            break;

                        default:
                            System.out.println("Menu tidak tersedia. Silahkan input ulang!");
                            break;

                    }
                    break;

                case 4:
                System.out.println("--------- "+ bangunDatar.printNama(constantVar.getKUBUS()) +" --------");
                    inputBangunRuang();
                    switch (inputHitung) {
                        case 1:
                            System.out.print("Sisi Kubus: ");
                            inputAngka = input.nextInt();
                            input.nextLine();
                            BangunRuang kubus = new Kubus(inputAngka);
                            System.out.println("Volume Kubus: " + kubus.volume());
                            System.out.println("Keliling Kubus: " + kubus.getKeliling());
                            System.out.println("Luas Kubus: " + kubus.getLuas());
                            System.out.println("Karakteristik Kubus: " + bangunDatar.karakteristik(constantVar.getKARAKTERISTIK_KUBUS()));
                            break;

                        default:
                            System.out.println("Menu tidak tersedia. Silahkan input ulang!");
                            break;

                    }
                    break;

                case 5:
                System.out.println("--------- "+ bangunDatar.printNama(constantVar.getBALOK()) +" --------");
                    inputBangunRuang();
                    switch (inputHitung) {
                        case 1:
                            System.out.print("Panjang Balok: ");
                            inputAngka = input.nextInt();
                            input.nextLine();
                            System.out.print("Lebar Balok: ");
                            inputLebar = input.nextInt();
                            input.nextLine();
                            System.out.print("Tinggi Balok: ");
                            inputTinggi = input.nextInt();
                            input.nextLine();
                            BangunRuang balok = new Balok(inputAngka, inputLebar, inputTinggi);
                            System.out.println("Volume Balok: " + balok.volume());
                            System.out.println("Keliling Balok: " + balok.getKeliling());
                            System.out.println("Luas Balok: " + balok.getLuas());
                            System.out.println("Karakteristik Balok: " + bangunDatar.karakteristik(constantVar.getKARAKTERISTIK_BALOK()));
                            break;

                        default:
                            System.out.println("Menu tidak tersedia. Silahkan input ulang!");
                            break;

                    }
                    break;

                case 6:
                System.out.println("--------- "+ bangunDatar.printNama(constantVar.getBOLA()) +" --------");
                    inputBangunRuang();
                    switch (inputHitung) {
                        case 1:
                            System.out.print("Jari jari Bola: ");
                            jari = input.nextFloat();
                            input.nextLine();
                            BangunRuang bola = new Bola(jari);
                            System.out.println("Volume Bola: " + bola.volume());
                            System.out.println("Karakteristik Bolaa: " + bangunDatar.karakteristik(constantVar.getBOLA()));
                            break;

                        default:
                            System.out.println("Menu tidak tersedia. Silahkan input ulang!");
                            break;

                    }
                    break;

                default:
                    System.out.println("Menu tidak tersedia. Silahkan input ulang!");
                    break;
            }
            System.out.print("\nApakah program ingin dijalankan ulang? Y/N : ");
            option = input.nextLine();
        } while (option.equalsIgnoreCase("y"));

        // Persegi persegi = new Persegi(2);
        // System.out.println("--------- PERSEGI --------");
        // System.out.print("Keliling Persegi: ");
        // System.out.print(persegi.getKeliling());
        // System.out.print("\nLuas Persegi: ");
        // System.out.print(persegi.getLuas());

        // PersegiPanjang persegiPanjang = new PersegiPanjang(5, 2);
        // System.out.println("\n--------- PERSEGI PANJANG --------");
        // System.out.print("Keliling Persegi Panjang: ");
        // System.out.print(persegiPanjang.getKeliling());
        // System.out.print("\nLuas Persegi Panjang: ");
        // System.out.print(persegiPanjang.getLuas());

        // Lingkaran lingkaran = new Lingkaran(7);
        // System.out.println("\n--------- LINGKARAN --------");
        // System.out.print("Keliling Lingkaran: ");
        // System.out.print(lingkaran.getKeliling());
        // System.out.print("\nLuas Lingkaran: ");
        // System.out.print(lingkaran.getLuas());

        // Kubus kubus = new Kubus(4);
        // System.out.println("\n--------- KUBUS --------");
        // System.out.print("Volume Kubus: ");
        // System.out.print(kubus.getVolume());

        // Balok balok = new Balok(1, 3, 7);
        // System.out.println("\n--------- BALOK --------");
        // System.out.print("Volume Balok: ");
        // System.out.print(balok.volume());

        // Bola bola = new Bola(21);
        // System.out.println("\n--------- BOLA --------");
        // System.out.print("Volume BOLA: ");
        // System.out.print(bola.getVolume());
    }

}
