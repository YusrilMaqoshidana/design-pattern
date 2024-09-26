package design.pattern.factorymethod;

public class Main {
    public static void main(String[] args) {
        PabrikKendaraan mobil = new PabrikMobil();
        mobil.mengendaraiKendaraan();

        PabrikKendaraan motor = new PabrikMotor();
        motor.mengendaraiKendaraan();
    }
}



