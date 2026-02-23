package exercise.abstractfactory.model;

public class SpainPhone implements Phone {
    private final String number;
    private static final String PREFIX = "+34";
    private static final String SPAIN_PHONE_FORMAT = "%s %s %s %s %s";
    private static final int EXPECTED_LENGTH = 9;

    public SpainPhone(String number) {
        if (number == null || !number.matches("\\d{" + EXPECTED_LENGTH + "}")) {
            throw new IllegalArgumentException(
                    "Number must be exactly " + EXPECTED_LENGTH + " digits"
            );
        }
        this.number = number;
    }

    @Override
    public String getFormattedPhone() {
        return String.format(SPAIN_PHONE_FORMAT,
                PREFIX,
                number.substring(0, 3),
                number.substring(3, 5),
                number.substring(5, 7),
                number.substring(7, 9)
        );
    }
}
