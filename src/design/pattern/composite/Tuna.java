package design.pattern.composite;

public class Tuna {
    private String name;
    private PotPie birthday;

    public Tuna (String theName, PotPie theDate){
        name = theName;
        birthday = theDate;
    }

    public String toString(){
        return String.format("My name is %s, my birthday is %s", name, birthday);
    }
}
