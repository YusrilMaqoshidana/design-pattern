package design.pattern.composite;

public class Apples {
    public static void main(String[] args) {
        PotPie potObject = new PotPie(4,5,6);
        Tuna tunaObject = new Tuna("Bucky", potObject);
        System.out.println(tunaObject);
    }
}
