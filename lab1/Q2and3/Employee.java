package lab1.Q2and3;

public class Employee {
    private String f_name;
    private String l_name;
    private double salary;

    public Employee(String f_name, String l_name, double salary){
        this.f_name = f_name;
        this.l_name = l_name;
        this.salary = salary;
    }

    public Employee(String f_name, String l_name){
        this(f_name, l_name, 0);
    }

    public void setF_name(String f_name){
        this.f_name = f_name;
    }

    public void setL_name(String l_name){
        this.l_name = l_name;
    }

    public void setSalary(double salary){
        if (salary>0){
            this.salary = salary;
        }
    }

    public String GetF_name(){
        return f_name;
    }

    public String GetL_name(){
        return l_name;
    }

    public double Get_Salary(){
        return (salary);
    }

    public double Yearly_Salary(){
        return salary*12;
    }

    public double raise_salary(int raiseValue){
        return salary = salary + (salary*raiseValue/100);
    }

}
