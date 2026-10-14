package Project;

public class EnlistedPersonnel extends NavyPersonnel{
    public enum EnlistedRank implements Rank{
        SEAMAN,
        PETTY_OFFICER,
        CHIEF_PETTY_OFFICER
    }

    public enum Specialty {
        ENGINEER,
        RADAR_OPERATOR,
        MEDIC,
        COMMUNICATION,
        GUNNER,
        NAVIGATION,
        DIVER,
        ELECTRICIAN,
        CULINARY,
        MECHANIC
    }

    protected Specialty specialty;
    protected int dutyHour;

    public EnlistedPersonnel(String name, String ID, EnlistedRank rank, int YearOfService, int dutyHour, Specialty specialty){
        super(name, ID, rank, YearOfService);
        this.dutyHour = dutyHour;
        this.specialty = specialty;
    }

    public int getYearOfService(){
        return YearOfService;
    }

    public Specialty getSpecialty(){
        return specialty;
    }

    public int getDutyHour(){
        return dutyHour;
    }

    @Override
    public String toString() {
        return "Enlisted Personnel: " + name + " (" + id + ") | " + rank + " | " + specialty + " | " + YearOfService + " yrs | " + dutyHour + " duty hrs";
    }
}
