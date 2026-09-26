package lab2.Q4;

public class Child extends Person{
    protected  int age;
    protected int height;
    protected double weight;
    protected Person guardian;

    public Child(int age, int height, double weight){
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public void setGuardian(Person guardian){
        this.guardian = guardian;
    }

    public Person getGuardian(){
        return guardian;
    }
}
