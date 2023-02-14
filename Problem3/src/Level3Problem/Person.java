package Level3Problem;

public class Person {

    private String FName;
    private String LName;
    private String Gender;

    public Person(String FName, String LName, String Gender) {
        this.FName = FName;
        this.LName = LName;
        this.Gender = Gender;
    }

    public void setFName(String FName) {
        this.FName = FName;
    }

    public void setLName(String LName) {
        this.LName = LName;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public String getFName() {
        return FName;
    }

    public String getLName() {
        return LName;
    }

    public String getGender() {
        return Gender;
    }

    @Override
    public String toString() {
        return "First Name: " + FName + "\nLast Name: " + LName + "\nGender" + Gender;
    }
}
