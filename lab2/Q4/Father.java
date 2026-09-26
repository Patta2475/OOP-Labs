package lab2.Q4;

public class Father extends Parent{
    protected Mother wife;

    public Father(Mother wife){
        super(0);
        this.wife = wife;
    }

    public Mother getWife(){
        return wife;
    }

    @Override
    public String getFirstName(){
        return "Mr." + firstName;
    }
}
