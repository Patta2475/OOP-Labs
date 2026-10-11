package lab4.Q1andQ2;

public class UndergradStudent extends PSUStudent {
    private int currentYear;
 
    public UndergradStudent(int age, double gpa){
        super(age, gpa);
        currentYear = 1;
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

    @Override 
    public void setCurrentYear(int currentYear){
        this.currentYear = currentYear;
    }

    @Override 
    public double revealGrade(){
        if (currentYear >= 4){
            return gpa;
        } else {
            return 0.0d;
        }
    }
}
