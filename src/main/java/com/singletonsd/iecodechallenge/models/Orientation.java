package com.singletonsd.iecodechallenge.models;

public enum Orientation {
    SOUTH,
    WEST,
    NORTH,
    EAST;

    private final static Orientation[] Values = values();

    public Orientation next()
    {
        return Values[(this.ordinal() + 1) % Values.length];
    }

    public Orientation prev()
    {
        return Values[(this.ordinal() - 1 + Values.length) % Values.length];
    }
}
