package com.singletonsd.iecodechallenge.models;

import lombok.Data;

@Data
public class Grid {
    private final int dimensionX;
    private final int dimensionY;

    public boolean isInsideGrid(int positionX, int positionY) {
        return isInsideGridCheck(positionX, this.dimensionX)
                && isInsideGridCheck(positionY, this.dimensionY);
    }

    private boolean isInsideGridCheck(int position, int dimension) {
        return position >= 0 && position <= dimension;
    }
}
