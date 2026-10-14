package Project;

public class Officer extends NavyPersonnel{
    private String commandUnit;
    private String leadershipCourse;

    public enum OfficerRank implements Rank {
        ENSIGN,
        LIEUTENANT,
        CAPTAIN,
        ADMIRAL
    }

    public Officer(String name, String ID, OfficerRank rank, int YearOfService, String commandUnit, String leadershipCourse){
        super(name, ID, rank, YearOfService);
        this.commandUnit = commandUnit;
        this.leadershipCourse = leadershipCourse;
    }

    public String getCommandUnit(){
        return commandUnit;
    }

    public String getLeadershipCourse(){
        return leadershipCourse;
    }

    public int getYearOfService(){
        return YearOfService;
    }

    @Override
    public String toString() {
        return "Officer: " + name + " (" + id + ") | " + rank + " | Unit: " + commandUnit + " | " + YearOfService + " yrs | Course: " + leadershipCourse;
    }
}
