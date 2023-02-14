package Level3Problem;

public class Contact extends Person {

    Address ad;
    Date dt;
    String relationship;
    String phoneNumber;

    public Contact(String FName, String LName, String Gender, Address ad, Date dt, String relationship, String phoneNumber) {
        super(FName, LName, Gender);
        this.ad = ad;
        this.dt = dt;
        this.relationship = relationship;
        this.phoneNumber = phoneNumber;
    }

    public void setRelationship(String relationship) {
        this.relationship = relationship;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getRelationship() {
        return relationship;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getInfo() {
        return ad.toString() + "\nPhone Number: " + getPhoneNumber() + "\nDate of Birth: " + dt.toString();
    }

    public String getBInfo() {
        return "Name: " + getFName();
    }

    public String getBMonth() {
        return dt.getMonth();
    }

    @Override
    public String toString() {
        return super.toString() + "\nRelation: " + relationship + "\nPhone Number: " + phoneNumber;
    }
}
