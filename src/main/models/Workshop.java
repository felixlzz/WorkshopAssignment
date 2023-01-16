package models;

public class Workshop {
    private String school;
    private String time;
    private int travelTime;

    public Workshop(String school, String time, int travelTime) {
        this.school = school;
        this.time = time;
        this.travelTime = travelTime;
    }

    public Boolean isValidWorkshop() {
        return null;   //place-holder
    }

    public String getSchool() {
        return school;
    }

    public String getTime() {
        return time;
    }

    public int getTravelTime() {
        return travelTime;
    }
}
