package Project;

public class Officer extends NavyPersonnel{
    private String commandUnit;
    private String leaderShipCourse;

    public Officer(String name, String ID, Rank rank, int YearOfService, String commandUnit, String leaderShipCourse){
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

    @Override 
    public String toString(){
        return null;
    }
}
