public class School{
    private final String SCHOOL_NAME,ADDRESS,TYPE;
    private String principal;

    public School(String SCHOOL_NAME , String ADDRESS , String TYPE , String principal){
        this.SCHOOL_NAME = SCHOOL_NAME;
        this.ADDRESS = ADDRESS;
        this.TYPE = TYPE;
        this.principal = principal;
    }

    public String getSchoolName(){
        return SCHOOL_NAME;
    }
    public String getAddress(){
        return ADDRESS;
    }
    public String getType(){
        return TYPE;
    }
    public String getprincipal(){
        return principal;
    }

    public void setprincipal(String principal){
        this.principal = principal;
    }

    public String toString(){
        return String.format("School Name: %s \nSchool Address: %s \nSchool type: %s \nSchool principal: %s",
        SCHOOL_NAME,ADDRESS,TYPE,principal);
    }
}