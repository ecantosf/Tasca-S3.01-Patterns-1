package exercise.abstractfactory.factory;

import exercise.abstractfactory.model.Address;
import exercise.abstractfactory.model.Phone;

class USAAddress implements Address {
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

class USAPhone implements Phone {
    private String number;
    private static final String PREFIX = "+1";

    public USAPhone(String number) {
        this.number = number;
    }

    @Override
    public String getFormattedPhone() {
        // Format per a USA: +1 (987) 654-321
        return PREFIX + " (" + number.substring(0, 3) + ") "
                + number.substring(3, 6) + "-" + number.substring(6, 9);
    }
}

public class USAContactFactory implements ContactFactory {
    @Override
    public Address createAddress(String street, String city, String postalCode) {
        return new USAAddress(street, city, postalCode);
    }

    @Override
    public Phone createPhone(String number) {
        return new USAPhone(number);
    }
}