import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Service.kasirImpl;
import interfaces.kasir.kasirInterface;
import obj.objKasir.Makanan;
import obj.objKasir.Minuman;
import obj.objKasir.Order;
import obj.objKasir.PaketMakan;

public class kasirApp {
    static Scanner input = new Scanner(System.in);
    static kasirInterface appKasir = new kasirImpl();
    static List<Makanan> foods = new ArrayList<>();
    static List<Minuman> drinks = new ArrayList<>();
    static List<PaketMakan> packets = new ArrayList<>();
    static List<Order> orders = new ArrayList<>();
    static List<Order> ordersBayar = new ArrayList<>();
    static Order order = new Order();
    static Integer inputMenu;
    static String option;
    static Integer totalBiaya = 0;
    static Integer totalBiayaMinuman = 0;
    static Integer totalBiayaMakan = 0;
    static Integer totalBiayaPaket = 0;
    static Integer bayar;

    public static void menu() {
        System.out.println("Restaurant Serba Murah");
        System.out.println("1. Order Foods");
        System.out.println("2. Order Drinks");
        System.out.println("3. Order Paket");
        System.out.println("4. List Order");
        System.out.println("5. Pay Order");
        System.out.print("Pilihan: ");
        inputMenu = input.nextInt();
        input.nextLine();
    }

    public static void foodList() {
        System.out.println("1. Nasi Goreng - 15000");
        System.out.println("2. Sate - 20000");
        System.out.println("3. Mie Goreng - 10000");
        inputMenu = input.nextInt();
        input.nextLine();
    }

    public static void drinkList() {
        System.out.println("1. Just Alpukat - 15000");
        System.out.println("2. Es Teh - 5000");
        System.out.println("3. Extra Joss - 6000");
        inputMenu = input.nextInt();
        input.nextLine();
    }

    public static void paketList() {
        System.out.println("1. Paket Pagi - 20000");
        System.out.println("2. Paket Siang - 30000");
        System.out.println("3. Paket Malam - 25000");
        inputMenu = input.nextInt();
        input.nextLine();
    }

    public static void pilihan() {
        do {
            menu();
            switch (inputMenu) {
                case 1:
                    System.out.println("ORDER FOODS");
                    System.out.println("--------------------");
                    foodList();
                    do {
                        switch (inputMenu) {
                            case 1:
                                System.out.println("Nasi Goreng telah di masukan ke order");
                                Makanan nasgor = new Makanan("Nasi goreng", 15000);
                                foods.add(nasgor);
                                order.setPesananMakan(foods);
                                break;

                            case 2:
                                System.out.println("Sate telah di masukan ke order");
                                Makanan sate = new Makanan("Sate", 20000);
                                foods.add(sate);
                                order.setPesananMakan(foods);
                                break;
                            case 3:
                                System.out.println("Mie Goreng telah di masukan ke order");
                                Makanan mieGoreng = new Makanan("Mie goreng", 10000);
                                foods.add(mieGoreng);
                                order.setPesananMakan(foods);
                                break;

                            default:
                                System.out.println("Menu tidak ada!!!");
                                break;
                        }
                        orders.add(order);
                        System.out.print("Mau tambah Makanan? Y|N : ");
                        option = input.nextLine();
                    } while (option.equalsIgnoreCase("y"));
                    break;

                case 2:
                    System.out.println("ORDER Drinks");
                    System.out.println("--------------------");
                    drinkList();
                    do {
                        switch (inputMenu) {
                            case 1:
                                System.out.println("Just Alpukat telah di masukan ke order");
                                Minuman jusAlpukat = new Minuman("Jus Alpukat", 15000);
                                drinks.add(jusAlpukat);
                                order.setPesananMinuman(drinks);
                                break;

                            case 2:
                                System.out.println("Es Teh telah di masukan ke order");
                                Minuman esTeh = new Minuman("Es Teh", 5000);
                                drinks.add(esTeh);
                                order.setPesananMinuman(drinks);
                                break;
                            case 3:
                                System.out.println("Extra Joss telah di masukan ke order");
                                Minuman extraJoss = new Minuman("Extra Joss", 6000);
                                drinks.add(extraJoss);
                                order.setPesananMinuman(drinks);
                                break;

                            default:
                                System.out.println("Menu tidak ada!!!");
                                break;
                        }
                        orders.add(order);
                        System.out.print("Mau tambah Minuman lagi? Y|N : ");
                        option = input.nextLine();
                    } while (option.equalsIgnoreCase("y"));
                    break;

                case 3:
                    System.out.println("ORDER Paket");
                    System.out.println("--------------------");
                    paketList();
                    do {
                        switch (inputMenu) {
                            case 1:
                                System.out.println("Paket Pagi telah di masukan ke order");
                                PaketMakan paketPagi = new PaketMakan("Paket Pagi", 20000);
                                packets.add(paketPagi);
                                order.setDaftarOrderPaket(packets);
                                break;

                            case 2:
                                System.out.println("Paket Siang telah di masukan ke order");
                                PaketMakan paketSiang = new PaketMakan("Paket Siang", 30000);
                                packets.add(paketSiang);
                                order.setDaftarOrderPaket(packets);
                                break;
                            case 3:
                                System.out.println("Paket Malam telah di masukan ke order");
                                PaketMakan paketMalam = new PaketMakan("Paket Malam", 25000);
                                packets.add(paketMalam);
                                order.setDaftarOrderPaket(packets);
                                break;

                            default:
                                System.out.println("Menu tidak ada!!!");
                                break;
                        }
                        orders.add(order);
                        System.out.print("Mau tambah Paket lagi? Y|N : ");
                        option = input.nextLine();
                    } while (option.equalsIgnoreCase("y"));
                    break;

                case 4:
                    System.out.println("List Orders");
                    System.out.println("-----------------------------");
                    System.out.println("Pesanan Makan: ");
                    if (orders.get(0).getPesananMakan() != null) {
                        for (int i = 0; i < orders.get(0).getPesananMakan().size(); i++) {
                            System.out.println(orders.get(i).getPesananMakan());
                            break;
                        }
                    }
                    System.out.println("-----------------------------");
                    System.out.println("Pesanan Minuman: ");
                    if (orders.get(0).getPesananMinuman() != null) {
                        for (int i = 0; i < orders.get(0).getPesananMinuman().size(); i++) {
                            System.out.println(orders.get(i).getPesananMinuman());
                            break;
                        }
                    }
                    System.out.println("-----------------------------");
                    System.out.println("Pesanan Paket: ");
                    if (orders.get(0).getDaftarOrderPaket() != null) {
                        for (int i = 0; i < orders.get(0).getDaftarOrderPaket().size(); i++) {
                            System.out.println(orders.get(i).getDaftarOrderPaket());

                            break;
                        }
                    }
                    break;

                case 5:
                    do {

                        System.out.println("Pembayaran");
                        System.out.println("-----------------------------");
                        System.out.print("Total Harga Semua: ");
                        ordersBayar.add(orders.get(0));
                        if (ordersBayar.get(0).getPesananMinuman() != null) {
                            for (int i = 0; i < ordersBayar.get(0).getPesananMinuman().size(); i++) {
                                totalBiayaMinuman += ordersBayar.get(0).getPesananMinuman().get(i).getHarga();

                            }
                        }

                        if (ordersBayar.get(0).getPesananMakan() != null) {
                            for (int i = 0; i < ordersBayar.get(0).getPesananMakan().size(); i++) {
                                totalBiayaMakan += ordersBayar.get(0).getPesananMakan().get(i).getHarga();

                            }
                        }

                        if (ordersBayar.get(0).getDaftarOrderPaket() != null) {
                            for (int i = 0; i < ordersBayar.get(0).getDaftarOrderPaket().size(); i++) {
                                totalBiayaPaket += ordersBayar.get(0).getDaftarOrderPaket().get(i).getHarga();

                            }
                        }
                        // Daftar pesanan apa saja yang di pesan
                        if (orders.get(0).getPesananMakan() != null) {
                            for (int i = 0; i < orders.get(0).getPesananMakan().size(); i++) {
                                System.out.println(orders.get(i).getPesananMakan() + "-" + totalBiayaMakan);
                                break;
                            }
                        }
                        if (orders.get(0).getPesananMinuman() != null) {
                            for (int i = 0; i < orders.get(0).getPesananMinuman().size(); i++) {
                                System.out.println(orders.get(i).getPesananMinuman() + "-" + totalBiayaMinuman);
                                break;
                            }
                        }
                        if (orders.get(0).getDaftarOrderPaket() != null) {
                            for (int i = 0; i < orders.get(0).getDaftarOrderPaket().size(); i++) {
                                System.out.println(orders.get(i).getDaftarOrderPaket() + "-" + totalBiayaPaket);
                                break;
                            }
                        }

                        totalBiaya = totalBiayaMakan + totalBiayaMinuman + totalBiayaPaket;
                        ordersBayar.get(0).setTotalHarga(totalBiaya);
                        System.out.println("Total Biaya yang anda harus bayar: " + totalBiaya);
                        System.out.print("Uang Anda: ");
                        bayar = input.nextInt();
                        input.nextLine();
                        if (bayar < totalBiaya) {
                            System.out.println("Pembayaran kurang silahkan bayar sesuai tagihan");
                        } else if (bayar > totalBiaya) {
                            int kembalian = bayar - totalBiaya;
                            System.out.println("Terimakasih sudah makan , ini kembalian anda: " + kembalian);

                        } else {
                            System.out.println("Terimakasih sudah makan.");

                        }
                        totalBiayaMakan = 0;
                        totalBiayaMinuman = 0;
                        totalBiayaPaket = 0;
                    } while (bayar < totalBiaya);
                        totalBiaya = 0;
                        
                    break;
                default:
                    System.out.println("Menu tidak ada!!!");
                    break;

            }

            System.out.print("\nMau Lanjut lagi? Y|N: ");
            option = input.nextLine();
        } while (option.equalsIgnoreCase("Y"));

    }

    public static void main(String[] args) {

        pilihan();

        // foods.add(nasgor);
        // foods.add(Sate);
        // drinks.add(jus);
        // Christian.setPesananMakan(foods);
        // Christian.setPesananMinuman(drinks);

        // System.out.println(appKasir.pilihMenu(Christian));
    }
}
