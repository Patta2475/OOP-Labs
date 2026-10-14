package Project;

public class Officer extends NavyPersonnel{
    private String commandUnit;
    private String leaderShipCourse;

    public enum OfficerRank implements Rank {
        ENSIGN,
        LIEUTENANT,
        CAPTAIN,
        ADMIRAL
    }

    public Officer(String name, String ID, OfficerRank rank, int YearOfService, String commandUnit, String leaderShipCourse){
        this.name = name;
        id = ID;
        this.rank = rank;
        this.YearOfService = YearOfService;
        this.commandUnit = commandUnit;
        this.leaderShipCourse = leaderShipCourse;
    }

    public String getCommanderUnit(){
        return commandUnit;
    }

    public String getLeaderShipCourse(){
        return leaderShipCourse;
    }

    public void setCommandUnit(){

    }

    @Override
    public String toString() {
        return "Officer: " + name + " (" + id + ") | " + rank + " | Unit: " + commandUnit + " | " + YearOfService + " yrs | Course: " + leaderShipCourse;
    }
}
