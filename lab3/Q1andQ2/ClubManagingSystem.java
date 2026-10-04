package lab3.Q1andQ2;

public class ClubManagingSystem {
    private Club[] clubList;
    private int sum;

    public ClubManagingSystem(Club[] clublist){
        this.clubList = clublist;
    }

    public int determineAllBudget() {
        sum = 0;
        for (Club c : clubList) {
           sum += c.determineBudget();
        }
        return sum;
    }

    public int getAllMembers() {
        sum = 0;
        for (Club c : clubList){
            sum += c.numMember;
        }
        return sum;
    }

    public Club getHighestMemberClub() {
        Club highest = null;
        for (Club c : clubList){
            if (highest == null || c.numMember > highest.numMember) {
                highest = c;
            }
        }
        return highest;
    }
}