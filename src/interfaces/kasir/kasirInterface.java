package src.interfaces.kasir;

import java.util.List;

import src.obj.objKasir.Order;

public interface kasirInterface {
    public List<Order> orderMenu(Order singleOrder);
    public void pembayaran(Integer bayar, Integer total);
}
