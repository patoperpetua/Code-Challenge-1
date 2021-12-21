package com.singletonsd.iecodechallenge.models;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PositionTest {

    @Test
    public void ShouldIncrease1X() {
        Position position = new Position(0,0);
        position.increase1X();
        assertThat(position.getPositionX()).isEqualTo(1);
    }

    @Test
    public void ShouldDecrease1X() {
        Position position = new Position(0,0);
        position.decrease1X();
        assertThat(position.getPositionX()).isEqualTo(-1);
    }

    @Test
    public void ShouldIncrease1Y() {
        Position position = new Position(0,0);
        position.increase1Y();
        assertThat(position.getPositionY()).isEqualTo(1);
    }

    @Test
    public void ShouldDecrease1Y() {
        Position position = new Position(0,0);
        position.decrease1Y();
        assertThat(position.getPositionY()).isEqualTo(-1);
    }
}
