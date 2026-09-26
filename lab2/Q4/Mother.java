package lab2.Q4;

public class Mother extends Parent{
    protected Father husband;

    public Mother(){
        super(0);
    }

    @Override
    public String getFirstName(){
        return "Ms." + firstName;
    }
}
