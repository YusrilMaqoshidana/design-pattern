package design.pattern.singleton;

public class SingletonApp {
    public static void main(String[] args) {
        OrderService orderService = new OrderService();
        orderService.save("001");
        OrderDetailService orderDetailService = new OrderDetailService();
        orderDetailService.save("001", "Shampo", 10_000);
    }
}
