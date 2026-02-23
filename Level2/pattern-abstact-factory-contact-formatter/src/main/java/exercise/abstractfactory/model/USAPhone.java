package exercise.abstractfactory.model;

public class USAPhone implements Phone {
    private final String number;
    private static final String PREFIX = "+1";
    private static final String USA_PHONE_FORMAT = "%s (%s) %s-%s";  // ✅ Afegir constant
    private static final int EXPECTED_LENGTH = 9;

    public USAPhone(String number) {
        String cleanNumber = number.replaceAll("[\\s()-]", "");

        if (!cleanNumber.matches("\\d{" + EXPECTED_LENGTH + "}")) {
            throw new IllegalArgumentException(
                    "Number must contain exactly " + EXPECTED_LENGTH + " digits after cleaning"
            );
        }
        this.number = cleanNumber;
    }

    @Override
    public String getFormattedPhone() {
        return String.format(USA_PHONE_FORMAT,  // ✅ Utilitzar constant
                PREFIX,
                number.substring(0, 3),
                number.substring(3, 6),
                number.substring(6, 9)
        );
    }
}
