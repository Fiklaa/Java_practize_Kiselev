package practize4;

public class Sesons {
    public enum All_seasons {
        SPRING("Весна", "Период с 1 марта по 31 мая", 14),
        SUMMER("Лето", "Период с 1 июня по 31 августа", 27) {
            @Override
            public String getDescription() {
                return "Теплое время года";
            }
        },
        AUTUMN("Осень", "Период с 1 сентября по 30 ноября", 12),
        WINTER("Зима", "Период с 1 декабря по 28 февраля", -24);


        final int Temperature_avg;
        final String name;
        final String description;

        All_seasons(String name, String description, int Temperature_avg) {
            this.name = name;
            this.description = description;
            this.Temperature_avg = Temperature_avg;
        }

        public String getName() { return this.name; }

        public void getLikeSeason(All_seasons season) {
            switch (season) {
                case SPRING -> System.out.println("Я люблю весну");
                case SUMMER -> System.out.println("Я люблю лето");
                case AUTUMN -> System.out.println("Я люблю осень");
                case WINTER -> System.out.println("Я люблю зиму");
            }
        }

        public String getDescription() {
            return "Холодное время года";
        }

        public String getInformation() {
            return this.name + " - " + this.description + " [Средняя температура: " + this.Temperature_avg + "]";
        }
    }

    public static void main(String[] args) {

        All_seasons favSeason = All_seasons.AUTUMN;
        System.out.println("Мое любимое время года: " + favSeason.getInformation());
        System.out.println("Описание: " + favSeason.getDescription());

        All_seasons summer = All_seasons.SUMMER;
        System.out.println("\nИнформация : " + summer.getName());
        System.out.println(summer.getInformation());
        System.out.println("Описание: " + summer.getDescription());

        System.out.println("\nИнформация про сезоны:\n");

        for (All_seasons season : All_seasons.values()){
            System.out.println(season.getInformation());
            season.getLikeSeason(season);
        }
    }
}
