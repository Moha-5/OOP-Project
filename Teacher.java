public class Teacher extends Employee {
    private String classRoom,subject;
    private static int TeCount = 0;

    public Teacher(String name , char gender ,int year , int month , int day , int EMP_NUM ,int contact , 
    String classRoom, String subject){
        super(name, gender, year, month, day, EMP_NUM, contact);
        this.classRoom = classRoom;
        this.subject = subject;
        TeCount++;
    }

    public String getClassRoom(){
        return classRoom;
    }
    public String getSubject(){
        return subject;
    }
    public void setClassRoom(String classRoom){
        this.classRoom = classRoom;
    }
    public void setSubject(String subject){
        this.subject = subject;
    }
    public static int getTeCount(){
        return TeCount;
    }

    // it can use the attribute directly
    public void setContact(int contact){
        this.contact = contact;
    }
    
    @Override
    public String toString(){
        return String.format("%s \nClass Room: %s \nSubject: %s",super.toString(),classRoom,subject);
    }
}