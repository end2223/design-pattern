package structuaral.decorator.example_2;

import java.util.Date;

public class EmployeeConcreteComponent implements EmployeeComponent{
    private String name;

    public EmployeeConcreteComponent(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void doTask() {

    }

    @Override
    public void join(Date date) {
        System.out.println(this.getName() + " joined on " + formatDate(date));
    }

    @Override
    public void terminate(Date date) {
        System.out.println(this.getName() + " terminated on " + formatDate(date));
    }
}
