public class Main {
    static Employee[] employees = new Employee[10];
    static double SalaryIndexing = 20;
    public static void main(String[] args) {



        employees[0] = new Employee("Vasilii", "Sergeevich", "Vilkin", 1, 15000.0);
        employees[1] = new Employee("Vladimir", "Vasilievich", "Gorshkov", 2, 18000.0);
        employees[2] = new Employee("Sergey", "Yusupovich", "Yusupov", 5, 35000.0);
        employees[3] = new Employee("Andrey", "Volodimirovich", "Tarelkin", 3, 45000.0);
        employees[4] = new Employee("Stepan", "Alexandrovich", "Zapryagailo", 5, 12800.0);
        employees[5] = new Employee("Alexander", "Stepanovich", "Kuskov", 4, 11300.15);
        employees[6] = new Employee("Victor", "Olegovich", "Zatonin", 4, 16750.0);
        employees[7] = new Employee("Oleg", "Victorovich", "Orlov", 1, 23486.12);
        employees[8] = new Employee("Dmitrii", "Andreevich", "Lodirev", 3, 22594.38);
        employees[9] = new Employee("Fedor", "Dmitrievich", "Doskin", 2, 36985.0);
        EmployeePrint();
        System.out.println(getWageFund());
        System.out.println(getDepartmentWageFund(3));
        System.out.println(getMinSalaryEmployee());
        System.out.println(getMaxSalaryEmployee());
        System.out.println(getAverageSalary());
        System.out.println(getDepartmentAverageSalary(3));
        FullNamePrint();
        SalaryUp();
        EmployeePrint();
        System.out.println(getMinSalaryEmployee().getDepartment());
        System.out.println(getMaxSalaryEmployee().getDepartment());

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

    public static double getDepartmentWageFund(int department) {
        double sum = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getDepartment() == department) {
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

    public static double getDepartmentAverageSalary(int department) {
        int index = 0;
        for (Employee employee : employees) {
            if (employee.getDepartment() == department) {
               index++;
            }
        }
        if (index != 0) {
            return getDepartmentWageFund(department) / index;
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
    public static void SalaryUp() {
        for (Employee employee : employees) {
            if (employee != null) {
                employee.setSalary(employee.getSalary() + (employee.getSalary() * SalaryIndexing/100));
            }
        }
    }
}