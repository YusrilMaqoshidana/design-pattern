package design.pattern.abstractfactory;

public interface EmployeeFactory {
    Employee employee();
}

class ManagerFactory implements EmployeeFactory{

    @Override
    public Employee employee() {
        return new Manager();
    }
}

class DeveloperFactory implements EmployeeFactory{

    @Override
    public Employee employee() {
        return new Manager();
    }
}
