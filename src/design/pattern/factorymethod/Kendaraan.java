package design.pattern.factorymethod;

interface Kendaraan{
    void drive();

}

class Mobil implements Kendaraan{
    @Override
    public void drive(){
        System.out.println("Brum Brum Brum");
    }


}

class Motor implements Kendaraan{
    @Override
    public void drive(){
        System.out.println("Ngeng Ngeng Ngeng");
    }

}

