package design.pattern.factorymethod;

abstract public class PabrikKendaraan {
    abstract Kendaraan buatKendaraan();
    public void mengendaraiKendaraan() {
        Kendaraan kendaraan = buatKendaraan();
        kendaraan.drive();
    }
}

class PabrikMobil extends PabrikKendaraan {
    @Override
    Kendaraan buatKendaraan() {
        return new Mobil(); // Mengembalikan objek Mobil
    }
}

class PabrikMotor extends PabrikKendaraan {
    @Override
    Kendaraan buatKendaraan() {
        return new Motor();
    }
}



