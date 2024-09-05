package week6;

// Base class Employee
 class Employee {
    // Method to simulate work
    public void work() {
        System.out.println("Employee is working.");
    }

    // Method to get the salary of the employee
    public double getSalary() {
        return 50000.0; // Default salary for an employee
    }
}

// Subclass HRManager that extends Employee
class HRManager extends Employee {
    // Override the work method to provide specific functionality for HRManager
    @Override
    public void work() {
        System.out.println("HR Manager is managing human resources.");
    }

    // Method to add a new employee
    public void addEmployee() {
        System.out.println("HR Manager is adding a new employee.");
    }

    public static void main(String[] args) {
        // Create an instance of Employee
        Employee emp = new Employee();
        emp.work();
        System.out.println("Employee Salary: $" + emp.getSalary());

        // Create an instance of HRManager
        HRManager hr = new HRManager();
        hr.work(); // This will call the overridden work method in HRManager
        System.out.println("HR Manager Salary: $" + hr.getSalary());

        // Call the addEmployee method in HRManager
        hr.addEmployee();
    }
}


