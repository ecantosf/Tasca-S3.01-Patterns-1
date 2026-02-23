package exercise.abstractfactory.factory;

import exercise.abstractfactory.model.Address;
import exercise.abstractfactory.model.Phone;
import exercise.abstractfactory.model.USAAddress;
import exercise.abstractfactory.model.USAPhone;

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