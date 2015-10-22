package model;


public class Result {
    private String layout;
    private String timeTaken;
    private String time;
    private String driverName;
    private String carNumber;


    public Result(String driverName, String carNumber, String layout, String timeTaken, String time) {

        this.driverName = driverName;
        this.carNumber = carNumber;
        this.layout = layout;
        this.timeTaken = timeTaken;
        this.time = time;
    }



    public String getDriverName() {
        return driverName;
    }

    public String getCarNumber() {
        return carNumber;
    }

    public String getLayout() {
        return layout;
    }

    public String getTimeTaken() {
        return timeTaken;
    }

    public String getTime() {
        return time;
    }
}
