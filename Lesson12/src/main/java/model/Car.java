package model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Car implements Serializable {
    private String brand;
    private Engine engine;
    private Tank tank;
    private int speed;
    private int price;
}
