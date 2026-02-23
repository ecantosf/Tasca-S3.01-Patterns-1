package exercise.abstractfactory.factory;

import exercise.abstractfactory.model.Address;
import exercise.abstractfactory.model.Phone;
import exercise.abstractfactory.model.SpainAddress;
import exercise.abstractfactory.model.SpainPhone;

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