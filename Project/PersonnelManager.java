package Project;

import java.util.ArrayList;

public class PersonnelManager {

    private static final ArrayList<NavyPersonnel> list = new ArrayList<>();

    public static void add(NavyPersonnel p) {
        list.add(p);
    }

    public static ArrayList<NavyPersonnel> getAll() {
        return list;
    }

    public static boolean idExists(String id) {
        for (NavyPersonnel p : list) {
            if (p.getID().equals(id)) {
                return true;
            }
        }
        return false;
    }

    public static ArrayList<NavyPersonnel> search(String keyword) {
        ArrayList<NavyPersonnel> results = new ArrayList<>();
        String k = keyword.toLowerCase().trim();

        for (NavyPersonnel p : list) {
            if (p.getName().toLowerCase().contains(k) || p.getID().toLowerCase().contains(k)) {
                results.add(p);
            }
        }
        return results;
    }
}
