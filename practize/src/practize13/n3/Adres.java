package practize13.n3;

import java.util.StringTokenizer;

public class Adres {
    private String country;
    private String region;
    private String city;
    private String street;
    private String house;
    private String building;
    private String apartment;


    public Adres(String address) {
        parseUsingSplit(address);
    }


    public Adres(String address, String delimiters) {
        parseUsingStringTokenizer(address, delimiters);
    }

    private void parseUsingSplit(String address) {
        String[] parts = address.split(",");
        if (parts.length != 7) {
            throw new IllegalArgumentException("Неправильный формат адреса");
        }

        this.country = parts[0].trim();
        this.region = parts[1].trim();
        this.city = parts[2].trim();
        this.street = parts[3].trim();
        this.house = parts[4].trim();
        this.building = parts[5].trim();
        this.apartment = parts[6].trim();
    }

    private void parseUsingStringTokenizer(String address, String delimiters) {
        StringTokenizer tokenizer = new StringTokenizer(address, delimiters);
        String[] parts = new String[7];
        int index = 0;

        while (tokenizer.hasMoreTokens() && index < parts.length) {
            parts[index] = tokenizer.nextToken().trim();
            index++;
        }

        if (index != 7) {
            throw new IllegalArgumentException("Неправильный формат адреса");
        }

        this.country = parts[0].trim();
        this.region = parts[1].trim();
        this.city = parts[2].trim();
        this.street = parts[3].trim();
        this.house = parts[4].trim();
        this.building = parts[5].trim();
        this.apartment = parts[6].trim();
    }

    @Override
    public String toString() {
        return "Address - " +
                "country:'" + country + '\'' +
                ", region:'" + region + '\'' +
                ", city:'" + city + '\'' +
                ", street:'" + street + '\'' +
                ", house:'" + house + '\'' +
                ", building:'" + building + '\'' +
                ", apartment:'" + apartment + '\'';
    }
}
