public class Subject {
    private final String SUBJECT_NAME;
    private double credit;
    private String teacher;

    public Subject(String SUBJECT_NAME, double credit, String teacher){
        this.SUBJECT_NAME = SUBJECT_NAME;
        this.credit = credit;
        this.teacher = teacher;
    }

    public Subject(String SUBJECT_NAME, double credit){
        this(SUBJECT_NAME,credit,"to be determined");
    }

    public String getName(){
        return SUBJECT_NAME;
    }

    public double getCredit(){
        return credit;
    }

    public void setCredit(double credit){
        this.credit = credit;
    }

    public String getTeacher(){
        return teacher;
    }

    public void setTeacher(String teacher){
        this.teacher = teacher;
    }

    public String toString(){
        return String.format("Subject Name: %s \nthe credit amount: %s \nthe teacher: %s",SUBJECT_NAME,credit,teacher);
    }
}
