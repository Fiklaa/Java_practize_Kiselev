package practize13.n2;

public class Person {

    private String firstName;
    private String middleName;
    private String lastName;

    public Person(String lastName, String firstName, String middleName) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
    }

    public String getFullName() {
        StringBuilder fullName = new StringBuilder();

        if (lastName != null && !lastName.isEmpty()) {
            fullName.append(lastName);
        }
        if (firstName != null && !firstName.isEmpty()) {
            fullName.append(" ");
            fullName.append(firstName.toUpperCase().charAt(0)).append(".");
            if (middleName != null && !middleName.isEmpty()) {
                fullName.append(middleName.toUpperCase().charAt(0)).append(".");
            } else {
                fullName.append(" (нет среднего имени) ");
            }
        } else {
            fullName.append(" (нет имени) ");
            if (middleName != null && !middleName.isEmpty()) {
                fullName.append(middleName.toUpperCase().charAt(0)).append(".");
            } else {
                fullName.append(" (нет среднего имени) ");
            }
        }


        return fullName.toString().trim();
    }
}
