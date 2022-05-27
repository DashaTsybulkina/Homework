package flower_shop;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum FlowerType {
    ROSE(15, "ROSE"),
    LILY(7, "LILY"),
    ASTER(5, "ASTER"),
    HERBERA(5, "HERBERA"),
    TULIP(8, "TULIP"),
    CARNATION(11, "CARNATION");
    private int cost;
    private String name;
}
