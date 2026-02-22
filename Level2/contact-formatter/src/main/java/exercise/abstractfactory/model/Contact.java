package exercise.abstractfactory.model;

import exercise.abstractfactory.factory.ContactFactory;

public class Contact {
    private Address address;
    private Phone phone;

    public Contact(ContactFactory factory, String street, String city,
                   String postalCode, String phoneNumber) {
        this.address = factory.createAddress(street, city, postalCode);
        this.phone = factory.createPhone(phoneNumber);
    }

    public String getFormattedAddress() {
        return address.getFormattedAddress();
    }

    public String getFormattedPhone() {
        return phone.getFormattedPhone();
    }

    @Override
    public String toString() {
        return "Address: " + getFormattedAddress() + " | Phone: " + getFormattedPhone();
    }
}
