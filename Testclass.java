public class Testclass {
    public static void main(String[] args) {
        Employee emp = new Employee("Ziyad Al harbi", 'M', 2002, 5, 15, 110001, 123456789);
        Teacher teacher = new Teacher("Raed Al otaibi", 'M', 2003, 1, 17, 120001, 111111111, "7th", "Math");
        Administrative admin = new Administrative("Rayan Al harbi", 'M', 1999, 10, 2, 130001, 987654321, "HR");
        Student stu1 = new Student("Mohammad Al harbi",'M', 2004, 2, 7, 100001, 4.1);
        Student stu2 = new Student("Waleed Al harbi", 'M', 2000, 3, 20, 100002,567891234, 4.0);
        School sch = new School("Al ghad", "Buraydah - Al fayziyyah", "Private", "Ahmad Alharbi");
        Subject sub1 = new Subject("Math", 4,"Raed Al otaibi");
        Subject sub2 = new Subject("Science", 4);

        System.out.println("\nchanging the principal (school class)\n");
        System.out.println(sch.getprincipal());
        sch.setprincipal("saud alharbi");

        System.out.println("\nchanging the teacher (subject class)\n");
        System.out.println(sub2.getTeacher());
        sub2.setTeacher("Yasser Al otaibi");

        System.out.println("\nusing human class methods\n");
        System.out.println(stu1.getName());
        System.out.println(stu1.getAge());
        System.out.println(stu1.getGender());


        System.out.println("\nusing Employee class methods\n");
        System.out.println(emp.getId());
        System.out.println(emp.getBirthdate());
        System.out.println(emp.getContact());

        System.out.println("\nusing student class methods\n");
        System.out.println(stu2.getGPA());
        System.out.println(stu2.getSosContact());
        stu2.setGPA(2.5);
        stu1.setSosContact(12894567);

        System.out.println("\nusing teacher class methods\n");
        System.out.println(teacher.getClassRoom());
        teacher.setClassRoom("5th");
        System.out.println(teacher.getSubject());
        teacher.setSubject("PE");

        System.out.println("\nusing Administrative class methods\n");
        System.out.println(admin.getTask());
        admin.setTask("Records");

        System.out.println("\n\nPrinting toString polymorphically");
        Employee  employee[] = {emp,teacher,admin};
        for (Employee i: employee){
            System.out.println(i);
            System.out.println("\n");
        }

        System.out.println("printing the rest of to String normally\n");
        System.out.println(stu1);
        System.out.println();
        System.out.println(stu2);
        System.out.println();
        System.out.println(sch);
        System.out.println();
        System.out.println(sub1);
        System.out.println();
        System.out.println(sub2);
    }
}