package Project;

public interface Personnel {
    public String getID();
    public Rank getRank();
    public String toString();

    enum Rank{
        SEAMAN,
        PETTY_OFFICER,
        CHIEF_PETTY_OFFICER,
        ENSIGN,
        LIEUTENANT,
        CAPTAIN,
        ADMIRAL
    }
}
