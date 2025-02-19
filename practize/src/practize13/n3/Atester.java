package practize13.n3;

public class Atester {
    public static void main(String[] args) {
        System.out.println("Тестирование разделением по запятой:");
        String address1 = "Казахстан, Кыргын область, Нур Большоц, Качергани, 33, 123К, 17";
        String address2 = "США, Масачусес, Сан-Франциско, Гров-стрит, 22, 1B, 22";

        Adres addr1 = new Adres(address1);
        Adres addr2 = new Adres(address2);
        System.out.println(addr1);
        System.out.println(addr2);

        System.out.println("\nТестирование по любому символу , . ; -:");
        String address3 = "Сякая, Таков, Круть, Майкл-стрит, 666, 7-C, 404";
        String address4 = "Франция; ИЛЬИЛЬ; Париж; башня та самая поля; 42; D; 4014";
        String address5 = "Германия; Рейх; Бердлин; Сосиски стрит; 5; 7E; 507";
        String address6 = "Италия-ДжоДжо-Рим-Кринж-6-F-606";

        Adres addr3 = new Adres(address3, ",.;-");
        Adres addr4 = new Adres(address4, ",.;-");
        Adres addr5 = new Adres(address5, ",.;-");
        Adres addr6 = new Adres(address6, ",.;-");

        System.out.println(addr3);
        System.out.println(addr4);
        System.out.println(addr5);
        System.out.println(addr6);
    }
}
