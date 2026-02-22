package exercise.abstractfactory.factory;

import exercise.abstractfactory.model.Address;
import exercise.abstractfactory.model.Phone;

// Concrete Products for Spain (poden ser package-private)
class SpainAddress implements Address {
    private String street;
    private String city;
    private String postalCode;

    public SpainAddress(String street, String city, String postalCode) {
        this.street = street;
        this.city = city;
        this.postalCode = postalCode;
    }

    @Override
    public String getFormattedAddress() {
        return street + ", " + postalCode + " " + city;
    }
}

class SpainPhone implements Phone {
    private String number;
    private static final String PREFIX = "+34";

    public SpainPhone(String number) {
        this.number = number;
    }

    @Override
    public String getFormattedPhone() {
        // Format per a Spain: +34 623 45 67 89
        return PREFIX + " " + String.format("%s %s %s %s",
                number.substring(0, 3),
                number.substring(3, 5),
                number.substring(5, 7),
                number.substring(7, 9));
    }
}

// Concrete Factory (ha de ser pública)
public class SpainContactFactory implements ContactFactory {
    @Override
    public Address createAddress(String street, String city, String postalCode) {
        return new SpainAddress(street, city, postalCode);
    }

    @Override
    public Phone createPhone(String number) {
        return new SpainPhone(number);
    }
}