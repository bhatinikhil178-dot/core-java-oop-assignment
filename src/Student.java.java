public class Student {
    int rollNo;
    String name;
    double marks;

    void display() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }

    public static void main(String[] args) {
        Student s1 = new Student();

        // assigning values
        s1.rollNo = 93;
        s1.name = "Nikhil Bhati";
        s1.marks = 75;

        s1.display();
        
        // Student name
        String name = "Nikhil Bhati";

        // Original name
        System.out.println("Original Name: " + name);

        // Uppercase        
        System.out.println("Uppercase Name: " + name.toUpperCase());

        // Lowercase
        System.out.println("Lowercase Name: " + name.toLowerCase());

        // Length of the name
        System.out.println("Length of the Name: " + name.length());
        
        int[] marks = {201, 202, 203, 204, 205};

        // loop to print marks
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Marks " + (i + 1) + ": " + marks[i]);
        }
    }
}