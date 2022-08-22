public class Employee {
    private String fistName;
    private String lastName;
    private String middleName;

    private String department;

    private int id;

    private int salary;

    public Employee(String fistName, String lastName, String middleName) {
        this.fistName = fistName;
        this.lastName = lastName;
        this.middleName = middleName;
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
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
    public String toString() {
        return getFistName() + " " + getLastName() + " " + getMiddleName();
    }
}
