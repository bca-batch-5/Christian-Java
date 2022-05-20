package src.Service;

import java.util.ArrayList;
import java.util.List;

import src.interfaces.kasir.kasirInterface;
import src.obj.objKasir.Makanan;
import src.obj.objKasir.Order;


public class kasirImpl implements kasirInterface {
    List<Order> orders = new ArrayList<>();
    List<Makanan> foods = new ArrayList<>();
    
    

    @Override
    public List<Order> orderMenu(Order singleOrder) {
        orders.remove(singleOrder);
        orders.add(singleOrder);
        return orders;
    }

    @Override
    public void pembayaran(Integer bayar, Integer total) {
        if (bayar < total) {
            System.out.println("Pembayaran kurang silahkan bayar sesuai tagihan");
        } else if (bayar > total) {
            int kembalian = bayar - total;
            System.out.println("Terimakasih sudah makan , ini kembalian anda: " + kembalian);

        } else {
            System.out.println("Terimakasih sudah makan.");

        }
    }
    
}
