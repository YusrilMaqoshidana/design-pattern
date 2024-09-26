package design.pattern.abstractfactory;

public class Main {
    public static void main(String[] args) {
        String posisi = "manajer";
        if(posisi == "manajer"){
            EmployeeFactory manager = new ManagerFactory();
            manager.employee().showDetails();
        } else if(posisi == "developer"){
            EmployeeFactory developer = new DeveloperFactory();
            developer.employee().showDetails();
        }
    }
}
