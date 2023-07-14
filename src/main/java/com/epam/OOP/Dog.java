package com.epam.OOP;

public class Dog  extends Animal{

    public Dog() {
        super.setColor("brown");
        super.setNumberOfPaws(4);
        super.setHasFur(true);
    }

    @Override
    public String getDescription() {
        return super.getDescription();
    }
}
