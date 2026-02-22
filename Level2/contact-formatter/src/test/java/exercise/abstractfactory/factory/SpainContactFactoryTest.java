package exercise.abstractfactory.factory;

import exercise.abstractfactory.model.Address;
import exercise.abstractfactory.model.Phone;
import exercise.abstractfactory.model.Contact;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

class SpainContactFactoryTest {

    private SpainContactFactory factory;
    private String street;
    private String city;
    private String postalCode;
    private String phoneNumber;

    @BeforeEach
    void setUp() {
        factory = new SpainContactFactory();
        street = "Carrer Major 34";
        city = "Barcelona";
        postalCode = "08001";
        phoneNumber = "623456789";
    }

    @Test
    void testCreateAddress() {
        Address address = factory.createAddress(street, city, postalCode);
        assertNotNull(address);
        assertEquals("Carrer Major 34, 08001 Barcelona",
                address.getFormattedAddress());
    }

    @Test
    void testCreatePhone() {
        Phone phone = factory.createPhone(phoneNumber);
        assertNotNull(phone);
        assertEquals("+34 623 45 67 89",
                phone.getFormattedPhone());
    }

    @Test
    void testContactCreation() {
        Contact contact = new Contact(factory, street, city, postalCode, phoneNumber);
        String expected = "Address: Carrer Major 34, 08001 Barcelona | Phone: +34 623 45 67 89";
        assertEquals(expected, contact.toString());
    }
}
