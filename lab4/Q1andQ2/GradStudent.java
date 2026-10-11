package lab4.Q1andQ2;

public class GradStudent extends PSUStudent {
    private boolean passThesis;
    
    public GradStudent(int age, double gpa){
        super(age, gpa);
        passThesis = false;
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
    public void setPassThesis(boolean pass){
        passThesis = pass;
    }

    public double revealGrade(){
        if (passThesis){
            return gpa;
        } 
        return 0.0d;
    }
}
