class CompanyEmployee {
    int empId;
    String empName;

    static String companyName = "Gnc Pvt Ltd";

    CompanyEmployee(int id, String name) {
        empId = id;
        empName = name;
    }

    void display() {
        System.out.println(empId + " " + empName + " " + companyName);
    }
}

public class CompnayEmployee {
    public static void main(String[] args) {
        CompanyEmployee e1 = new CompanyEmployee(101, "Nikhil");
        CompanyEmployee e2 = new CompanyEmployee(102, "Rahul");
        CompanyEmployee e3 = new CompanyEmployee(103, "Anuj");

        e1.display();
        e2.display();
        e3.display();
    }
}