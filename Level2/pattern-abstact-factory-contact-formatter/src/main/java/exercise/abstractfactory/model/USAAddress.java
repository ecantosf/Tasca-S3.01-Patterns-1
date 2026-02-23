package exercise.abstractfactory.model;

public class USAAddress implements Address {
    private String street;
    private String city;
    private String postalCode;

    public USAAddress(String street, String city, String postalCode) {
        this.street = street;
        this.city = city;
        this.postalCode = postalCode;
    }

    @Override
    public String getFormattedAddress() {
        return street + ", " + city + ", " + postalCode;
    }
}
