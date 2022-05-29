package seasons;

public class Main {
    public static void main(String[] args) {
        Season seasons = Season.SPRING;
        System.out.println("Любимое время года:");
        Season.printFavoriteSeasons(seasons);
        System.out.println("Любимое время года информация:");
        infoSeasons(seasons);
        System.out.println();
        System.out.println("Времена года:");
        Season[] seasonsArray = Season.values();
        for (int i = 0; i < seasonsArray.length; i++) {
            infoSeasons(seasonsArray[i]);
        }
    }

    static void infoSeasons(Season seasons) {
        System.out.println("Название времени года: "
                + seasons.getSeasonsName()
                + " Средняя температура "
                + seasons.getAverageTemperature()
                + " градусов"
                + seasons.getDescription());
    }

}
