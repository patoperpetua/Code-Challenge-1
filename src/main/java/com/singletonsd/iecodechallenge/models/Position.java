package com.singletonsd.iecodechallenge.models;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Position {
    private int positionX;
    private int positionY;

    public Position(Position position){
        this.positionX = position.getPositionX();
        this.positionY = position.getPositionY();
    }

    public void changeXBy(int value) {
        this.positionX = this.positionX + value;
    }

    public void changeYBy(int value) {
        this.positionY = this.positionY + value;
    }

    public void increase1X() {
        this.changeXBy(1);
    }

    public void increase1Y() {
        this.changeYBy(1);
    }

    public void decrease1X() {
        this.changeXBy(-1);
    }

    public void decrease1Y() {
        this.changeYBy(-1);
    }
}
