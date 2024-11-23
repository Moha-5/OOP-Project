import java.time.LocalDate;
import java.time.Period;

public abstract class Human {
    private final String NAME;
    private final char GENDER;
    private final int YEAR,MONTH,DAY;

    public Human(String NAME , char GENDER , int YEAR , int MONTH , int DAY){
        this.NAME = NAME;
        this.GENDER = GENDER;
        this.YEAR = YEAR;
        this.MONTH = MONTH;
        this.DAY = DAY;
    }

    public String getName(){
        return NAME;
    }
    public char getGender(){
        return GENDER;
    }
    public int getYear(){
        return YEAR;
    }
    public int getMonth(){ 
        return MONTH;
    }
    public int getDay(){ 
        return DAY;
    }

    public int getAge(){
        LocalDate today = LocalDate.now();
        LocalDate birthdate = LocalDate.of( YEAR, MONTH, DAY);
        Period age = Period.between(birthdate, today);
        return age.getYears();

    }
    public abstract String toString();
}
