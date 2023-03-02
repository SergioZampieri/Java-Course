package poo;

import java.util.Date;
import java.util.GregorianCalendar;

public class Uso_empleado {
    public static void main (String[] args) {
        Empleado empleado1 = new Empleado("paco",85000,1990,12,17);

        System.out.println(empleado1.getName());
        System.out.println(empleado1.getContract());
        empleado1.raiseSalary(12000);
        System.out.print(empleado1.getSalary());

    }
}

class Empleado{
    public Empleado(String _name, double _salary, int _year, int _month, int _day){
    name = _name;
    salary = _salary;
        GregorianCalendar calendar = new GregorianCalendar(_year,_month-1,_day);
        contract = calendar.getTime();
    }
    public String getName() {
        return name;
    }
    public double getSalary() {
        return salary;
    }
    public Date getContract() {
        return contract;
    }
    public void raiseSalary(double bonus){
        salary = salary+bonus;
    }
    private String name;

    private double salary;

    private Date contract;

}