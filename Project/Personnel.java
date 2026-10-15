package Project;

public interface Personnel {
    String getID();
    String getName();
    Rank getRank();
    int getYearOfService();
    String toString();

    enum Rank {}
}
