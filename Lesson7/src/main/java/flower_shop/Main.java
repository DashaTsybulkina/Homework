package flower_shop;

public class Main {
    public static void main(String[] args) {
        FlowerMarket flowerMarket = new FlowerMarket();
        Bouquet bouquet1 = flowerMarket.getBouquet("ROSE", "HERBERA", "TULIP");
        Bouquet bouquet2 = flowerMarket.getBouquet("ROSE", "ROSE", "ROSE", "ROSE");
        Bouquet bouquet3 = flowerMarket.getBouquet("CARNATION", "HERBERA", "TULIP");
        Bouquet bouquet4 = flowerMarket.getBouquet("LILY", "CARNATION", "TULIP");
        Bouquet bouquet5 = flowerMarket.getBouquet("ROSE", "ASTER", "TULIP");

        System.out.println(bouquet1 + " Price:" + bouquet1.getPriceFlowers());
        System.out.println(bouquet2 + " Price:" + bouquet2.getPriceFlowers());
        System.out.println(bouquet3 + " Price:" + bouquet3.getPriceFlowers());
        System.out.println(bouquet4 + " Price:" + bouquet4.getPriceFlowers());
        System.out.println(bouquet5 + " Price:" + bouquet5.getPriceFlowers());
        System.out.println("Count of sell flowers: " + flowerMarket.getFlowerSell());
    }
}
