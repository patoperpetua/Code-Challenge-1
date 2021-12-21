package com.singletonsd.iecodechallenge.models;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class OrientationTest {

    @Test
    public void shouldReturnNorth(){
        assertThat(Orientation.WEST.next()).isEqualTo(Orientation.NORTH);
        assertThat(Orientation.EAST.prev()).isEqualTo(Orientation.NORTH);
    }

    @Test
    public void shouldReturnSouth(){
        assertThat(Orientation.EAST.next()).isEqualTo(Orientation.SOUTH);
        assertThat(Orientation.WEST.prev()).isEqualTo(Orientation.SOUTH);
    }

    @Test
    public void shouldReturnEast(){
        assertThat(Orientation.NORTH.next()).isEqualTo(Orientation.EAST);
        assertThat(Orientation.SOUTH.prev()).isEqualTo(Orientation.EAST);
    }

    @Test
    public void shouldReturnWest(){
        assertThat(Orientation.SOUTH.next()).isEqualTo(Orientation.WEST);
        assertThat(Orientation.NORTH.prev()).isEqualTo(Orientation.WEST);
    }
}
