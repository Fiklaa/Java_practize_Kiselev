package practize14.n2;

import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.List;
import java.util.ArrayList;

public class price {

    public static List<String> extractPrices(Pattern pattern, String string) {
        List<String> prices = new ArrayList<>();
        Matcher matcher = pattern.matcher(string);
        while (matcher.find()) {
            prices.add(matcher.group());
        }
        return prices;
    }

    public static void main(String[] args) {
        String regex = "\\b\\d+\\.\\d+\\s?(USD|EUR|RUB)\\b";
        Pattern pattern = Pattern.compile(regex);
        String s = "Цены: 25.98 USD, 54.99 RUR, 100.00 EU, неправильные: 44 ERR, 0.004 EU, 123.4 USD, 50.000 USD";
        List<String> prices = extractPrices(pattern, s);
        System.out.println("Цены:");
        for (String price: prices) {
            System.out.println(price);
        }
    }
}
