package design.pattern.singleton;

public class OrderDetailService {
    public void save(String orderId, String nameProduct, int priceProduct){
        DatabaseHelper.getConnection().sql("INSERT ...");
    }
}
