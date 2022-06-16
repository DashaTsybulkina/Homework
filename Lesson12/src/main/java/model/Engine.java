package model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Engine implements Serializable {
        private String name;
        @JsonIgnore
        private transient int numberOfCylinders;
}
