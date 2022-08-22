public class Main {
    static Employee[] employees = new Employee[10];
    public static void main(String[] args) {
        employees[0] = new Employee("Vasilii", "Sergeevich", "Vilkin", 1, 15000.0);
        employees[1] = new Employee("Vladimir", "Vasilievich", "Gorshkov", 2, 18000.0);
        employees[2] = new Employee("Sergey", "Yusupovich", "Yusupov", 3, 35000.0);
        employees[3] = new Employee("Andrey", "Volodimirovich", "Tarelkin", 4, 45000.0);
        employees[4] = new Employee("Stepan", "Alexandrovich", "Zapryagailo", 5, 12800.0);
        employees[5] = new Employee("Alexander", "Stepanovich", "Kuskov", 6, 11300.15);
        employees[6] = new Employee("Victor", "Olegovich", "Zatonin", 7, 16750.0);
        employees[7] = new Employee("Oleg", "Victorovich", "Orlov", 8, 23486.12);
        employees[8] = new Employee("Dmitrii", "Andreevich", "Lodirev", 9, 22594.38);
        employees[9] = new Employee("Fedor", "Dmitrievich", "Doskin", 10, 36985.0);
        EmployeePrint();
        System.out.println(getWageFund());
        System.out.println(getMinSalaryEmployee());
        System.out.println(getMaxSalaryEmployee());
        System.out.println(getAverageSalary());
        FullNamePrint();

    }
    public static void EmployeePrint() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    public static double getWageFund() {
        double sum = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                sum = sum + employees[i].getSalary();
            }
        }
        return sum;
    }

    public static Employee getMinSalaryEmployee() {
        double minSalary = -1;
        Employee minEmpl = null;
        int index = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                minSalary = employees[i].getSalary();
                minEmpl = employees[i];
                index = i;
            }
        }
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                if (minSalary > employees[i].getSalary()) {
                    minSalary = employees[i].getSalary();
                    minEmpl = employees[i];
                }
            }
        }
        return minEmpl;
    }

    public static Employee getMaxSalaryEmployee() {
        double maxSalary = -1;
        Employee maxEmpl = null;
        int index = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                maxSalary = employees[i].getSalary();
                maxEmpl = employees[i];
                index = i;
            }
        }
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                if (maxSalary < employees[i].getSalary()) {
                    maxSalary = employees[i].getSalary();
                    maxEmpl = employees[i];
                }
            }
        }
        return maxEmpl;
    }
    public static double getAverageSalary() {
        if (employees.length != 0) {
            return getWageFund() / employees.length;
        } else {
            return 0;
        }

    }
    public static void FullNamePrint() {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee.getFullName());
            }
        }
    }
}