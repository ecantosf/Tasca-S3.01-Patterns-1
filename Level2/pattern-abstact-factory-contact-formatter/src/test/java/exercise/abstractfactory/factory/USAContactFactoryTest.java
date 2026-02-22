package exercise.abstractfactory.factory;

import exercise.abstractfactory.model.Address;
import exercise.abstractfactory.model.Phone;
import exercise.abstractfactory.model.Contact;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

class USAContactFactoryTest {

    private USAContactFactory factory;
    private String street;
    private String city;
    private String postalCode;
    private String phoneNumber;

    @BeforeEach
    void setUp() {
        factory = new USAContactFactory();
        street = "154 5th Avenue";
        city = "New York";
        postalCode = "NY 10001";
        phoneNumber = "987654321";
    }

    @Test
    void testCreateAddress() {
        Address address = factory.createAddress(street, city, postalCode);
        assertNotNull(address);
        assertEquals("154 5th Avenue, New York, NY 10001",
                address.getFormattedAddress());
    }

    @Test
    void testCreatePhone() {
        Phone phone = factory.createPhone(phoneNumber);
        assertNotNull(phone);
        assertEquals("+1 (987) 654-321",
                phone.getFormattedPhone());
    }

    @Test
    void testContactCreation() {
        Contact contact = new Contact(factory, street, city, postalCode, phoneNumber);
        String expected = "Address: 154 5th Avenue, New York, NY 10001 | Phone: +1 (987) 654-321";
        assertEquals(expected, contact.toString());
    }
}
