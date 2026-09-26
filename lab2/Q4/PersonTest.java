package lab2.Q4;

public class PersonTest {
    public static void main(String[] args) {
        Child child1 = new Child(12, 156, 40);
        child1.setFirstName("Sora");
        child1.setLastName("lastname");

        Mother mother1 = new Mother();
        mother1.setFirstName("Matha");
        mother1.setLastName("lastname");
        mother1.setChild(child1);

        Father father1 = new Father(mother1);
        father1.setFirstName("Larry");
        father1.setLastName("lastname");
        father1.setChild(child1);

        child1.setGuardian(father1);

        System.out.println("Child info: " + child1.getFirstName() + " " + child1.getLastName() + " | age:" + child1.age + " | height:" + child1.height + " | weight:" + child1.weight );
        System.out.println("Father info: " + father1.getFirstName() + " " + father1.getLastName()); 
        System.out.println("Mother info: " + mother1.getFirstName() + " " + mother1.getLastName());
        System.out.println("Child Guardian: " + child1.getGuardian().getFirstName());

        System.out.println(father1.getFirstName() + "'s child: " + father1.getChild().getFirstName());
        System.out.println(father1.getFirstName() + "'s wife: " + father1.getWife().getFirstName());
        System.out.println(mother1.getFirstName() + "'s child: " + mother1.getChild().getFirstName());
    }
}
