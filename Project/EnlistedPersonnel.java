package Project;

import Project.Personnel.Rank;

public class EnlistedPersonnel extends NavyPersonnel{
    enum Specialty {
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

    public EnlistedPersonnel(String name, String ID, Rank rank, int YearOfService, int dutyHour, Specialty specialty){
        this.name = name;
        id = ID;
        this.rank = rank;
        this.YearOfService = YearOfService;
        this.dutyHour = dutyHour;
        this.specialty = specialty;
    }
}
