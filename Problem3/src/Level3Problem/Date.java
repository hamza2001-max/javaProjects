package Level3Problem;

public class Date {

    private String Day;
    private String Month;
    private String Year;

    public Date(String Day, String Month, String Year) {
        this.Day = Day;
        this.Month = Month;
        this.Year = Year;
    }

    public void setDay(String Day) {
        this.Day = Day;
    }

    public void setMonth(String Month) {
        this.Month = Month;
    }

    public void setYear(String Year) {
        this.Year = Year;
    }

    public String getDay() {
        return Day;
    }

    public String getMonth() {
        return Month;
    }

    public String getYear() {
        return Year;
    }

    @Override
    public String toString() {
        return "DD/MM/YY: " + Day + "/" + Month + "/" + Year;
    }
}
