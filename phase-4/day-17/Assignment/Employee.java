import java.util.*;
import java.util.function.*;

public class Employee {

    private int id;
    private String name;
    private double salary;
    private String aadharNumber;

    // Getters and Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getAadharNumber() {
        return aadharNumber;
    }

    public void setAadharNumber(String aadharNumber) {
        this.aadharNumber = aadharNumber;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }


    public static void main(String gg[]) {

        List<Employee> list = new ArrayList<>();

        Employee e = new Employee();

        e.setId(101);
        e.setName("Sufiyan Nagori");
        e.setSalary(90000);
        e.setAadharNumber("7393483834");

        list.add(e);


        e = new Employee();

        e.setId(102);
        e.setName("Sumit Patel");
        e.setSalary(50000);
        e.setAadharNumber("7395453483834");

        list.add(e);



        e = new Employee();

        e.setId(103);
        e.setName("Mohammad Mushef");
        e.setSalary(70000);
        e.setAadharNumber("73934833453");

        list.add(e);


        e = new Employee();

        e.setId(104);
        e.setName("Ahemad Bilal");
        e.setSalary(40000);
        e.setAadharNumber("7393483834");

        list.add(e);



        e = new Employee();

        e.setId(105);
        e.setName("Sufiyan Nagori");
        e.setSalary(95000);
        e.setAadharNumber("739353483834");

        list.add(e);



        e = new Employee();

        e.setId(106);
        e.setName("Aakash");
        e.setSalary(30000);
        e.setAadharNumber("739348386334");

        list.add(e);



        System.out.println("\n--- FILTER EMPLOYEES ---");

        Predicate<Employee> filter =
                emp -> emp.getSalary() > 50000;

        list.stream()
            .filter(filter)
            .forEach(System.out::println);


        // 2. SORT EMPLOYEES BY SALARY

        System.out.println("\n--- SORT EMPLOYEES ---");

        list.sort((e1, e2) ->
                Double.compare(
                    e1.getSalary(),
                    e2.getSalary()
                )
        );

        list.forEach(System.out::println);


        // 3. CALCULATE SALARY (10% INCREMENT)

        System.out.println("\n--- CALCULATE SALARY ---");

        Function<Employee, Double> salary =
                emp -> emp.getSalary() * 1.10;

        list.forEach(emp -> {

            System.out.println(
                    emp.getName() + " : " +
                    salary.apply(emp)
            );

        });


        // 4. SEARCH EMPLOYEE BY NAME

        System.out.println("\n--- SEARCH EMPLOYEE ---");

        String searchName = "Sufiyan Nagori";

        Predicate<Employee> search =
                emp -> emp.getName()
                        .equalsIgnoreCase(searchName);

        Optional<Employee> result =
                list.stream()
                    .filter(search)
                    .findFirst();

        if (result.isPresent()) {

            System.out.println("Employee Found!");

            System.out.println(result.get());

        } else {

            System.out.println("Employee Not Found!");

        }

    }
}
