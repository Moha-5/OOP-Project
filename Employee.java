public class Employee extends Human implements Info {
    
    protected final int EMP_NUM;
    protected int contact;
    private static int empCount = 0;

    public Employee(String name , char gender ,int year , int month , int day , int EMP_NUM ,int contact){
        super(name, gender, year, month, day);
        this.EMP_NUM = EMP_NUM;
        this.contact = contact;

        empCount++;
    }

    public int getContact(){
        return contact;
    }

    public static int getEmpCount(){
        return empCount;
    }

    @Override
    public int getId(){
        return EMP_NUM;
    }

    @Override
    public String getBirthdate(){
        return String.format("%d/%d/%d",getYear(),getMonth(),getDay());
    }

    @Override
    public String toString(){
        return String.format("Employee Name: %s \ngender: %c \nAge: %d \nEmployee Number: %d \ncontact: %d",
        getName(),getGender(),getAge(),getId(),getContact());
    }
}