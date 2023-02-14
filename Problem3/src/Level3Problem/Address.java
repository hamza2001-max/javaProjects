package Level3Problem;

public class Address {

    private String city, streetAddress, state, zipCode;

    public Address(String city, String streetAddress, String state, String zipCode) {
        this.city = city;
        this.streetAddress = streetAddress;
        this.state = state;
        this.zipCode = zipCode;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public String getZipCode() {
        return zipCode;
    }

    @Override
    public String toString() {
        return "State: " + state + "\nCity: " + city + "\nStreet Address: " + streetAddress + "\nZip Code: " + zipCode;
    }
}
