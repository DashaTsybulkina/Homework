package Lesson;

import lombok.Getter;

@Getter
public class Cat extends Animals {

    public Cat(String name) {
        super(name);
    }

    @Override
    public void speak() {
        System.out.println("мяу");
    }
}
