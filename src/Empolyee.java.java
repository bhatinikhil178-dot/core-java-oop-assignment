public class Employee {
    int employeeId;
    String employeeName;
    double employeeSalary;

    Employee(int employeeId, String employeeName, double employeeSalary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeSalary = employeeSalary;
    }

    void display() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Employee Salary: " + employeeSalary);
    }

    public static void main(String[] args) {
        Employee e1 = new Employee(93, "Nikhil Bhati", 42000.0);
        e1.display();
    }
}