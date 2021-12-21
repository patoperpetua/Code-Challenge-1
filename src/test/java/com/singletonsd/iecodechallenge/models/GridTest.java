package com.singletonsd.iecodechallenge.models;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class GridTest {

    private static Grid grid = new Grid(4,5);

    @Test
    public void shouldReturnInsideUpperLimit() {
        assertThat(grid.isInsideGrid(4,5)).isTrue();
    }

    @Test
    public void shouldReturnInsideLowerLimit() {
        assertThat(grid.isInsideGrid(0,0)).isTrue();
    }

    @Test
    public void shouldReturnOutsideByX() {
        assertThat(grid.isInsideGrid(5, 3)).isFalse();
    }

    @Test
    public void shouldReturnOutsideByY() {
        assertThat(grid.isInsideGrid(3,6)).isFalse();
    }
}
