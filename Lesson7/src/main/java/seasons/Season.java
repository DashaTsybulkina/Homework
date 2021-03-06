package seasons;

import lombok.Getter;

@Getter
public enum Season {
    WINTER(-10, "Winter"),
    SUMMER(17, "Summer") {
        @Override
        public String getDescription() {
            return " Тёплое время года ";
        }
    },
    AUTUMN(10, "Autumn"),
    SPRING(10, "SPRING");

    private int averageTemperature;
    private String seasonsName;

    Season(int averageTemperature) {
        this.averageTemperature = averageTemperature;
    }

    Season(int averageTemperature, String seasonsName) {
        this.averageTemperature = averageTemperature;
        this.seasonsName = seasonsName;
    }

    public String getDescription() {
        return " Холодное время года ";
    }

    public static void printFavoriteSeasons(Season favoriteSeasons) {
        switch (favoriteSeasons) {
            case AUTUMN:
                System.out.println("Я люблю Осень");
                break;
            case SPRING:
                System.out.println("Я люблю Весну");
                break;
            case WINTER:
                System.out.println("Я люблю Зиму");
                break;
            case SUMMER:
                System.out.println("Я люблю Лето");
                break;
        }
    }
}
