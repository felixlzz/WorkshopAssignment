package models;

import java.util.ArrayList;

public class PA {
    private String name;
    private ArrayList<Workshop> validWS;  //WS meaning workshop
    private ArrayList<ArrayList<Boolean>> schedule;

    public PA(String name, ArrayList<ArrayList<Boolean>> schedule, AllWorkshop allWorkshop) {
        this.name = name;
        this.schedule = schedule;
        this.validWS = generateValidWS(allWorkshop);
    }

    public static ArrayList<Workshop> generateValidWS(AllWorkshop allWorkshop) {
        ArrayList<Workshop> valid = new ArrayList<>();
        for (Workshop ws: allWorkshop.getWorkshops()) {
            if (ws.isValidWorkshop()) {
                valid.add(ws);
            }
        }
        return valid;
    }


    public String getName() {
        return name;
    }

    public ArrayList<ArrayList<Boolean>> getSchedule() {
        return schedule;
    }

    public ArrayList<Workshop> getValidWS() {
        return validWS;
    }
}
