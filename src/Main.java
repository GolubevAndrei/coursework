public class Main {
    static Employee[] employees = new Employee[10];
    public static void main(String[] args) {
        employees[0] = new Employee("Vasilii", "Sergeevich", "Vilkin", 1, 15000.0);
        employees[1] = new Employee("Vladimir", "Vasilievich", "Gorshkov", 2, 18000.0);
        employees[2] = new Employee("Sergey", "Yusupovich", "Vilkin", 3, 35000.0);
        employees[3] = new Employee("Andrey", "Volodimirovich", "Vilkin", 4, 45000.0);
        employees[4] = new Employee("Stepan", "Alexandrovich", "Vilkin", 5, 12800.0);
        employees[5] = new Employee("Alexander", "Stepanovich", "Vilkin", 6, 11300.15);
        employees[6] = new Employee("Victor", "Olegovich", "Vilkin", 7, 16750.0);
        employees[7] = new Employee("Oleg", "Victorovich", "Vilkin", 8, 23486.12);
        employees[8] = new Employee("Dmitrii", "Andreevich", "Vilkin", 9, 22594.38);
        employees[9] = new Employee("Fedor", "Dmitrievich", "Doskin", 10, 36985.0);
        EmployeePrint();
    }
    public static void EmployeePrint() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}