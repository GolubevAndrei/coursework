public class Employee {
    private String fistName;
    private String lastName;
    private String middleName;
    private int department;
    private final int id;
    private double salary;
    private static int accumulator;



    public Employee(String fistName, String lastName, String middleName, int department, double salary) {
        this.fistName = fistName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.department = department;
        this.salary = salary;
        id = accumulator++;
    }

    public String getFistName() {
        return fistName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public int getId() {
        return id;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public int getDepartment() {
        return department;
    }

    public void setDepartment(int department) {
        this.department = department;
    }
    public String toString() {
        return getId() + " " + getFistName() + " " + getLastName() + " " + getMiddleName() + " " + getDepartment() + " " + getSalary();
    }
}
