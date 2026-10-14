package Project;

import java.util.ArrayList;

public class PersonnelManager {

    public static final String[] CRITERIA = {
        "Name", "ID", "Rank", "Year of service",
        "Specialty", "Duty hours", "Command unit", "Leadership course"
    };

    private static final ArrayList<Personnel> list = new ArrayList<>();

    public static void add(Personnel p) {
        list.add(p);
    }

    public static ArrayList<Personnel> getAll() {
        return list;
    }

    public static boolean idExists(String id) {
        for (Personnel p : list) {
            if (p.getID().equals(id)) {
                return true;
            }
        }
        return false;
    }

    public static String describeAll() {
        StringBuilder sb = new StringBuilder();
        for (Personnel p : list) {
            sb.append(p).append("\n\n");
        }
        return sb.toString();
    }

    public static ArrayList<Personnel> search(String criterion, String value) {
        ArrayList<Personnel> results = new ArrayList<>();
        String text = value.trim().toLowerCase();

        int number = 0;
        if (criterion.equals("Year of service") || criterion.equals("Duty hours")) {
            number = Integer.parseInt(text);
        }

        for (Personnel p : list) {
            boolean match = false;

            if (criterion.equals("Name")) {
                match = p.getName().toLowerCase().contains(text);
            } else if (criterion.equals("ID")) {
                match = p.getID().toLowerCase().contains(text);
            } else if (criterion.equals("Rank")) {
                match = p.getRank().toString().replace("_", " ").toLowerCase().contains(text);
            } else if (criterion.equals("Year of service")) {
                match = p.getYearOfService() == number;
            } else if (criterion.equals("Specialty") && p instanceof EnlistedPersonnel) {
                EnlistedPersonnel e = (EnlistedPersonnel) p;
                match = e.getSpecialty().toString().replace("_", " ").toLowerCase().contains(text);
            } else if (criterion.equals("Duty hours") && p instanceof EnlistedPersonnel) {
                EnlistedPersonnel e = (EnlistedPersonnel) p;
                match = e.getDutyHour() == number;
            } else if (criterion.equals("Command unit") && p instanceof Officer) {
                Officer o = (Officer) p;
                match = o.getCommandUnit().toLowerCase().contains(text);
            } else if (criterion.equals("Leadership course") && p instanceof Officer) {
                Officer o = (Officer) p;
                match = o.getLeadershipCourse().toLowerCase().contains(text);
            }

            if (match) {
                results.add(p);
            }
        }
        return results;
    }
}