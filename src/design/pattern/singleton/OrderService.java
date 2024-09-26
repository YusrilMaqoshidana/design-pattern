package design.pattern.singleton;

public class OrderService {
    public void save(String orderId){
        DatabaseHelper.getConnection().sql("INSERT ...");

    }
}
