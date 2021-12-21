package com.singletonsd.iecodechallenge.models;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Pacman {
    private final Grid grid;

    private Position position;
    private Orientation orientation;

    public boolean move() {
        Position newPosition = generateNewPosition();
        if(!grid.isInsideGrid(newPosition))
            return false;
        this.position = newPosition;
        return true;
    }

    public void left() {
        this.orientation = this.orientation.prev();
    }

    public void right() {
        this.orientation = this.orientation.next();
    }

    private Position generateNewPosition() {
        Position newPosition = new Position(position);
        switch (this.orientation){
            case NORTH:
                newPosition.increase1Y();
                break;
            case SOUTH:
                newPosition.decrease1Y();
                break;
            case EAST:
                newPosition.increase1X();
                break;
            case WEST:
                newPosition.decrease1X();
        }
        return newPosition;
    }
}
