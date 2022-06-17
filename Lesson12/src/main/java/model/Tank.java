package model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Tank implements Serializable {
    private String fuelType;
    private int volume;
}
