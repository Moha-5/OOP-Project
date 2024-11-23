public class Administrative extends Employee {
    private String task;
    private static int AdminCount = 0;
    public Administrative(String name , char gender ,int year , int month , int day , int EMP_NUM ,int contact , String task){
        super(name, gender, year, month, day, EMP_NUM, contact);
        this.task =task;
        AdminCount++;
    }

    public static int getAdminCount(){
        return AdminCount;
    }

    public String getTask(){
        return task;
    }

    public void setTask(String task){
        this.task = task;
    }

    // it can use the attribute directly
    public void setContact(int contact){
        this.contact = contact;
    }
    @Override
    public String toString(){
        return String.format("%s \nTask: %s",super.toString(),task);
    }
}