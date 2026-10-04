package lab3.Q1andQ2;

public class EsportsClubTest {
    public static void main(String[] args) {
        EsportsClub e = new EsportsClub("Esport", 100); //e attribute club name = Esport, minNumMember = 1, numMember = 100
        e.advertise(); //say "No need to advertise"
        System.out.println(e.minNumMember); // 1
        System.out.println(e.getNumber()); // 100
        System.out.println(e.determineBudget()); //(numMember * 1000) + ((numMember - minNumMember) * 100) = 109900
        System.out.println(e.getName()); // Esport
        System.out.println();

        Club c = new EsportsClub("Esport", 100);
        c.advertise(); // No need to advertise
        System.out.println(c.minNumMember); // 1
        System.out.println(c.getName()); // Esport
        System.out.println(c.numMember); // 100
        System.out.println(c.determineBudget()); // 109900
    }
}
