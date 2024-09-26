package design.pattern.abstractfactory;

public class Manager implements Employee {

    @Override
    public void showDetails() {
        System.out.println("Gaji: 10.000.000");
    }
}
