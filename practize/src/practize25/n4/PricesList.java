package practize25.n4;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PricesList {

    public static List<String> extractPrices(Pattern pattern, String string) {
        List<String> prices = new ArrayList<>();
        Matcher matcher = pattern.matcher(string);
        while (matcher.find()) {
            prices.add(matcher.group());
        }
        return prices;
    }
    /*
        b — спецификатор границы слова для начала и конца цен.
        \d — число для целой части цены.
        \. — точка для разделения целой и дробной частей.
        \d{2} — число для дробной части цены.
        \s? — необязательный пробел между ценой и валютой.
        (USD|RUR|EU) — группы валют для поиска (USD, RUR, EU).
        \b — спецификатор границы слова для конца валютного обозначения.
     */
    public static void main(String[] args) {
        String regex = "\\b\\d+\\.\\d+\\s?(USD|EUR|RUB)\\b";
        Pattern pattern = Pattern.compile(regex);
        String string = "Цены: 25.98 USD, 54.99 RUR, 100.00 EU, неправильные: 44 ERR, 0.004 EU, 123.4 USD, 50.000 USD";
        List<String> prices = extractPrices(pattern, string);
        System.out.println("Extracted prices:");
        for (String price: prices) {
            System.out.println(price);
        }
    }
}
