package Project;

public abstract class NavyPersonnel implements Personnel{
    protected String id;
    protected String name;
    protected int yearOfService;
    protected Rank rank;

    protected NavyPersonnel(String name, String id, Rank rank, int yearOfService) {
        this.name = name;
        this.id = id;
        this.rank = rank;
        this.yearOfService = yearOfService;
    }

    public int getYearOfService(){
        return yearOfService;
    }


    @Override
    public final String getID() {
        return id;
    }

    @Override
    public final Rank getRank() {
        return rank;
    }

    public String getName() {
    return name;
    }

}
