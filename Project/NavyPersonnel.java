package Project;

public abstract class NavyPersonnel implements Personnel{
    protected String id;
    protected String name;
    protected int YearOfService;
    protected Rank rank;

    @Override
    public final String getID() {
        return id;
    }

    @Override
    public final Rank getRank() {
        return rank;
    }

    @Override 
    public String toString() {
        return null;
    }

    public String getName() {
    return name;
    }

}
