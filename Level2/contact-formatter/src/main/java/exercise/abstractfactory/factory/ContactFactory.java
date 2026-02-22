package exercise.abstractfactory.factory;

import exercise.abstractfactory.model.Address;
import exercise.abstractfactory.model.Phone;

public interface ContactFactory {
    Address createAddress(String street, String city, String postalCode);
    Phone createPhone(String number);
}
