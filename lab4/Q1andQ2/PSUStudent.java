package lab4.Q1andQ2;

public abstract class PSUStudent {
    protected int age;
    protected double gpa;

    public PSUStudent(int age, double gpa){
        if (age < 0 || gpa > 4.0 || gpa < 0.0){
            throw new IllegalArgumentException();
        }
        this.age = age;
        this.gpa = gpa;
    }

    public int getAge(){
        return age;
    }

    public double getGPA(){
        return gpa;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setGPA(double gpa){
        this.gpa = gpa;
    }

    public abstract double revealGrade();
    public void setCurrentYear(int currentYear){}
    public void setPassThesis(boolean pass){}
}
