package lab3.Q1andQ2;

public class ClubManagingSystemTest {
    public static void main(String[] args) {
    
        Club Student = new Club("Student" , 10);
        Student.addMember(190);

        SportsClub Football = new SportsClub("Football", 22);
        Football.addMember(18);

        EsportsClub RoV = new EsportsClub("RoV", 5);

        MarketingClub Advertising = new MarketingClub("Advertising", 2, 100);
        Advertising.addMember(8);

        Club[] clubs = { Student,Football, RoV, Advertising};
        ClubManagingSystem system = new ClubManagingSystem(clubs);

        System.out.println(system.getHighestMemberClub().getName()); //Student
        System.out.println(system.determineAllBudget()); //257200
        System.out.println(system.getAllMembers()); //255
        // result should match i guess
    }
}
