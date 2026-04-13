public class CollegeStudent {

    public static void main(String[] args) {

        UniversityStudent cs1 = new UniversityStudent("Nikhil Bhati", 20, "Gnc College");
        UniversityStudent cs2 = new UniversityStudent("Nikhil Bhati", 20, "Gnc College");

        System.out.println("Student 1 Details:");
        cs1.displayStudent();
        cs1.displayCollege();

        System.out.println("\nStudent 2 Details:");
        cs2.displayStudent();
        cs2.displayCollege();
    }

    static class Student {
        String name;
        int age;

        Student(String name, int age) {
            this.name = name;
            this.age = age;
        }

        void displayStudent() {
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
        }
    }

    static class UniversityStudent extends Student {
        String college;

        UniversityStudent(String name, int age, String college) {
            super(name, age);
            this.college = college;
        }

        void displayCollege() {
            System.out.println("College: " + college);
        }
    }
}