package flower_shop;

import lombok.Getter;


@Getter
public class FlowerMarket {
    private int flowerSell;
    private String[][] allFlower;

    public FlowerMarket() {
        FlowerType[] flowerType = FlowerType.values();
        allFlower = new String[flowerType.length][2];
        int count = 0;
        for (FlowerType flower : flowerType) {
            allFlower[count][0] = flower.getName();
            allFlower[count][1] = Integer.toString(flower.getCost());
            count++;
        }
    }

    public Bouquet getBouquet(String... flowers) {
        Flower[] flowersForBouquet = new Flower[flowers.length];
        flowerSell += flowers.length;
        int count = 0;
        for (String flower : flowers) {
            for (int i = 0; i < allFlower.length; i++) {
                if (flower.equals(allFlower[i][0])) {
                    flowersForBouquet[count] = new Flower(flower, Integer.parseInt(allFlower[i][1]));
                    count++;
                }
            }
        }
        return new Bouquet(flowersForBouquet);
    }
}
