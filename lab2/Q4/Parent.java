package lab2.Q4;

public class Parent extends Person{
    protected int money;
    protected Child child;

    public Parent(int money){
        this.money = money;
    }

    public void setChild(Child child){
        this.child = child;
    }

    public Child getChild(){
        return child;
    }
}
