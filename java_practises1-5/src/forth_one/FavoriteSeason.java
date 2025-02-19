package forth_one;

public class FavoriteSeason {
    public enum Season {
        WINTER("Зима", "Можно лепить снеговичков скуфиков", -5),
        AUTUMN("Осень", "Ура, мой день рождения", 8),
        SPRING("Весна", "1 апреля - день смеха", 10),
        SUMMER("Лето", "Очень жаркий сезон, не переношу жару", 25) {
            @Override
            public String getDescription() {
                return "Теплое время года";
            }
        };

        public final int avgTemp;
        public final String name;
        public final String description;

        // Конструктор с параметрами
        Season(String name, String description, int avgTemp) {
            this.name = name;
            this.description = description;
            this.avgTemp = avgTemp;
        }

        // Метод для получения описания сезона
        public String getDescription() {
            return "Холодное время года";
        }

        // Метод для вывода информации о времени года
        public String getInformation() {
            return name + ": " + description + " (Средняя температура: " + avgTemp + "°C)";
        }
    }

    public static void main(String[] args) {

        Season favoriteSeason = Season.WINTER;
        System.out.println("↓↓↓ Мое любимое время года ↓↓↓");
        System.out.println(favoriteSeason.getInformation());
        System.out.println("Описание: " + favoriteSeason.getDescription());

        Season summer = Season.SUMMER;
        System.out.println("\nИнформация о лете:");
        System.out.println(summer.getInformation());
        System.out.println("Описание: " + summer.getDescription());

        System.out.println("\nИнформация о всех сезонах:\n");

        for (Season season : Season.values()){
            System.out.println(season.getInformation());
            System.out.println("Описание: " + season.getDescription());
            printSeasonMessage(season);
            System.out.println();
        }
    }

    // Метод для вывода сообщения в зависимости от времени года
    public static void printSeasonMessage(Season season) {
        switch (season) {
            case AUTUMN -> System.out.println("Люблю осень, потому что у меня день рождения в сентябре.");
            case SPRING -> System.out.println("Весна прикольная, можно посмеяться 1 апреля.");
            case WINTER -> System.out.println("Зима — мое самое любимое время года.");
            case SUMMER -> System.out.println("Не отлететь бы после 2 курса");
        }
    }
}
