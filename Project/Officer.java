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

    @Override
    public String toString() {
        return "Officer: " + rank + " " + name + " (" + id + ") | Unit: " + commandUnit + " | " + yearOfService + " years | Course: " + leadershipCourse;
    }
}
