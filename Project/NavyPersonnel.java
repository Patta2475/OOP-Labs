package Project;

public abstract class NavyPersonnel implements Personnel{
    protected String id;
    protected String name;
    protected int YearOfService;
    protected Rank rank;

    protected NavyPersonnel(String name, String id, Rank rank, int yearOfService) {
        this.name = name;
        this.id = id;
        this.rank = rank;
        this.YearOfService = yearOfService;
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
