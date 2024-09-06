package week7;

// Abstract class Employee
abstract class Employee {
    protected String name;
    protected int employeeId;

    // Constructor for Employee
    public Employee(String name, int employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }

    // Abstract method to calculate salary
    public abstract double calculateSalary();

    // Abstract method to get employee details
    public abstract String getEmployeeDetails();
}

// Subclass RegularEmployee that inherits from Employee
class RegularEmployee extends Employee {
    private double baseSalary;
    private double bonus;

    // Constructor for RegularEmployee
    public RegularEmployee(String name, int employeeId, double baseSalary, double bonus) {
        super(name, employeeId);
        this.baseSalary = baseSalary;
        this.bonus = bonus;
    }

    // Implementing calculateSalary method for RegularEmployee
    @Override
    public double calculateSalary() {
        return baseSalary + bonus;
    }

    // Implementing getEmployeeDetails method for RegularEmployee
    @Override
    public String getEmployeeDetails() {
        return "Regular Employee [Name: " + name + ", ID: " + employeeId + "]";
    }
}

// Subclass ContractEmployee that inherits from Employee
class ContractEmployee extends Employee {
    private double contractAmount;

    // Constructor for ContractEmployee
    public ContractEmployee(String name, int employeeId, double contractAmount) {
        super(name, employeeId);
        this.contractAmount = contractAmount;
    }

    // Implementing calculateSalary method for ContractEmployee
    @Override
    public double calculateSalary() {
        return contractAmount;
    }

    // Implementing getEmployeeDetails method for ContractEmployee
    @Override
    public String getEmployeeDetails() {
        return "Contract Employee [Name: " + name + ", ID: " + employeeId + "]";
    }
}

// Subclass HourlyEmployee that inherits from Employee
class HourlyEmployee extends Employee {
    private double hourlyRate;
    private int hoursWorked;

    // Constructor for HourlyEmployee
    public HourlyEmployee(String name, int employeeId, double hourlyRate, int hoursWorked) {
        super(name, employeeId);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    // Implementing calculateSalary method for HourlyEmployee
    @Override
    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }

    // Implementing getEmployeeDetails method for HourlyEmployee
    @Override
    public String getEmployeeDetails() {
        return "Hourly Employee [Name: " + name + ", ID: " + employeeId + "]";
    }

    public static void main(String[] args) {
        // Creating different employee types
        Employee regularEmployee = new RegularEmployee("John Doe", 101, 5000, 500);
        Employee contractEmployee = new ContractEmployee("Jane Smith", 102, 8000);
        Employee hourlyEmployee = new HourlyEmployee("David Brown", 103, 20, 160);

        // Displaying details and salaries of each employee
        System.out.println(regularEmployee.getEmployeeDetails());
        System.out.println("Salary: " + regularEmployee.calculateSalary());

        System.out.println(contractEmployee.getEmployeeDetails());
        System.out.println("Salary: " + contractEmployee.calculateSalary());

        System.out.println(hourlyEmployee.getEmployeeDetails());
        System.out.println("Salary: " + hourlyEmployee.calculateSalary());
    }
}



