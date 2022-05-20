package interfaces.kasir;

import java.util.List;

import obj.objKasir.Order;

public interface kasirInterface {
    public List<Order> orderMenu(Order singleOrder);
    public void pembayaran(Integer bayar, Integer total);
}
