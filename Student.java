public class Student extends Human implements Info {
    private final int STUDENT_NUM;
    private int sosContact;
    private double GPA;
    private static int StCount = 0;

    public Student(String name , char gender ,int year , int month , int day , int STUDENT_NUM , int sosContact , double GPA){
        super(name, gender, year, month, day);
        this.STUDENT_NUM = STUDENT_NUM;
        this.sosContact = sosContact;
        this.GPA = GPA;
        StCount++;
    }
    public Student(String name , char gender ,int year , int month , int day , int STUDENT_NUM , double GPA){
        this(name, gender, year, month, day, STUDENT_NUM, 0, GPA);
    }
    
    public int getSosContact(){
        return sosContact;
    }

    public void setSosContact(int sosContact){
        this.sosContact = sosContact;
    }
    public double getGPA(){
        return GPA;
    }

    public void setGPA(double GPA){
        this.GPA = GPA;
    }
    @Override
    public int getId(){
        return STUDENT_NUM;
    }

    public static int getStCount(){
        return StCount;
    }

    @Override
    public String getBirthdate(){
        return String.format("%d/%d/%d",getYear(),getMonth(),getDay());
    }
    @Override
    public String toString(){
        return String.format("Student Name: %s \ngender: %c \nAge: %d \nStudent Id: %d \nGPA: %.1f",
        getName(),getGender(),getAge(),getId(),getGPA());
    }
}