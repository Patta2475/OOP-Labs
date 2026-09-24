package lab2.Q3;

public class ClubTest {
    public static void main(String[] args) {
        Club club1 = new Club("Normal club", 10);
        System.out.println(club1.getName() + " | Members amount: " + club1.numMember);
        System.out.println("Determined budget: " + club1.determineBudget());
        club1.addMember(10);
        System.out.println("Determined budget after adding new member: " + club1.determineBudget());
        club1.changeName("New club");
        System.out.println("Name changed to ==> " + club1.getName());
        club1.advertise();
        System.out.println();

        SportsClub baseball = new SportsClub("Baseball", 9);
        System.out.println(baseball.getName() + " | Members amount: " + baseball.numMember);
        System.out.println("Determined budget: " + baseball.determineBudget());
        baseball.addMember(20);
        System.out.println("Determined budget after adding new member: " + club1.determineBudget());
        baseball.changeName("Baseball club 2.0");
        System.out.println(baseball.getName());
        baseball.advertise();
        System.out.println();

        MarketingClub marketClub1 = new MarketingClub("Market club", 12, 1000);
        System.out.println(marketClub1.getName() + " | Members amount: " + marketClub1.numMember);
        System.out.println(marketClub1.useBudget(800));
        System.out.println("Determined budget: " + marketClub1.determineBudget());

        MarketingClub marketClub2 = new MarketingClub("Market club", 12, 2000);
        System.out.println(marketClub2.getName() + " | Members amount: " + marketClub1.numMember);
        System.out.println(marketClub2.useBudget(2000));
        System.out.println("Determined budget: " + marketClub2.determineBudget());
    }
}
