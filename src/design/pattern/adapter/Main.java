package design.pattern.adapter;

public class Main {
    public static void main(String[] args) {
        MallardDuck mallardDuck = new MallardDuck();
        WildTurkey wildTurkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(wildTurkey);

        System.out.println("The Turkey says....");
        wildTurkey.gobble();
        wildTurkey.fly();

        System.out.println("\nThe Duck says...");
        mallardDuck.quack();
        mallardDuck.fly();

        System.out.println("\nThe Turkey says...");
        turkeyAdapter.quack();
        turkeyAdapter.fly();

    }
}
