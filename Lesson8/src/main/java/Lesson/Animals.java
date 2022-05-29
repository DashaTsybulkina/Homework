package Lesson;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Animals {
    private String name;

    public void speak() {
        System.out.println("бу");
    }
}
