package practize13.n5;

public class Numbers {

    private String phoneNumber;

    public Numbers(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String formatPhoneNumber() {
        String formattedPhoneNumber = "";

        if (phoneNumber.startsWith("+")) {
            String countryCode = phoneNumber.substring(0, phoneNumber.length() - 10);
            String localNumber = phoneNumber.substring(phoneNumber.length() - 10);
            formattedPhoneNumber = countryCode + " " + formatLocalNumber(localNumber);
        }
        else if (phoneNumber.startsWith("8") && phoneNumber.length() == 11) {
            String countryCode = "+7";
            String localNumber = phoneNumber.substring(1);
            formattedPhoneNumber = countryCode + " " + formatLocalNumber(localNumber);
        } else {
            throw new IllegalArgumentException("Wrong number format!");
        }
        return formattedPhoneNumber;
    }

    public String formatLocalNumber(String localNumber) {
        return localNumber.substring(0, 3) + "-" +
                localNumber.substring(3, 6) + "-" +
                localNumber.substring(6);
    }
}
