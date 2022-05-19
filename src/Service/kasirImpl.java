package Service;

import java.util.ArrayList;
import java.util.List;

import interfaces.kasir.kasirInterface;
import obj.objKasir.Order;

public class kasirImpl implements kasirInterface {
    List<Order> orders = new ArrayList<>();

    @Override
    public String pilihMenu(Order singleOrder) {
        orders.add(singleOrder);
        return "Menu sudah di simpan";
    }

    @Override
    public String pembayaran() {
        return null;
    }
    
}
