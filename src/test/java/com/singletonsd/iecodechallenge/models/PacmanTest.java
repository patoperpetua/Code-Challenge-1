package com.singletonsd.iecodechallenge.models;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PacmanTest {

    private static Grid grid = new Grid(3,3);

    @Test
    public void shouldOrientationWorks() {
        Pacman pacman = new Pacman(null,null,Orientation.NORTH);
        assertThat(pacman.getOrientation()).isEqualTo(Orientation.NORTH);
        pacman.left();
        assertThat(pacman.getOrientation()).isEqualTo(Orientation.WEST);
        pacman.left();
        assertThat(pacman.getOrientation()).isEqualTo(Orientation.SOUTH);
        pacman.left();
        assertThat(pacman.getOrientation()).isEqualTo(Orientation.EAST);
        pacman.left();
        assertThat(pacman.getOrientation()).isEqualTo(Orientation.NORTH);

        pacman.right();
        assertThat(pacman.getOrientation()).isEqualTo(Orientation.EAST);
        pacman.right();
        assertThat(pacman.getOrientation()).isEqualTo(Orientation.SOUTH);
        pacman.right();
        assertThat(pacman.getOrientation()).isEqualTo(Orientation.WEST);
        pacman.right();
        assertThat(pacman.getOrientation()).isEqualTo(Orientation.NORTH);
    }

    @Test
    public void shouldPacmanMoveY() {
        Pacman pacman = new Pacman(grid,new Position(0,0),Orientation.NORTH);
        assertThat(pacman.move()).isTrue();
        assertThat(pacman.getPosition().getPositionX()).isEqualTo(0);
        assertThat(pacman.getPosition().getPositionY()).isEqualTo(1);

        assertThat(pacman.move()).isTrue();
        assertThat(pacman.getPosition().getPositionX()).isEqualTo(0);
        assertThat(pacman.getPosition().getPositionY()).isEqualTo(2);

        assertThat(pacman.move()).isTrue();
        assertThat(pacman.getPosition().getPositionX()).isEqualTo(0);
        assertThat(pacman.getPosition().getPositionY()).isEqualTo(3);
    }

    @Test
    public void shouldPacmanMoveX() {
        Pacman pacman = new Pacman(grid,new Position(0,0),Orientation.EAST);
        assertThat(pacman.move()).isTrue();
        assertThat(pacman.getPosition().getPositionX()).isEqualTo(1);
        assertThat(pacman.getPosition().getPositionY()).isEqualTo(0);

        assertThat(pacman.move()).isTrue();
        assertThat(pacman.getPosition().getPositionX()).isEqualTo(2);
        assertThat(pacman.getPosition().getPositionY()).isEqualTo(0);

        assertThat(pacman.move()).isTrue();
        assertThat(pacman.getPosition().getPositionX()).isEqualTo(3);
        assertThat(pacman.getPosition().getPositionY()).isEqualTo(0);
    }

    @Test
    public void shouldPacmanNotMoveX() {
        Pacman pacman = new Pacman(grid,new Position(0,0),Orientation.WEST);
        assertThat(pacman.move()).isFalse();
        assertThat(pacman.getPosition().getPositionX()).isEqualTo(0);
        assertThat(pacman.getPosition().getPositionY()).isEqualTo(0);

        assertThat(pacman.move()).isFalse();
        assertThat(pacman.getPosition().getPositionX()).isEqualTo(0);
        assertThat(pacman.getPosition().getPositionY()).isEqualTo(0);

        pacman.setPosition(new Position(3,3));
        pacman.setOrientation(Orientation.EAST);

        assertThat(pacman.move()).isFalse();
        assertThat(pacman.getPosition().getPositionX()).isEqualTo(3);
        assertThat(pacman.getPosition().getPositionY()).isEqualTo(3);

        assertThat(pacman.move()).isFalse();
        assertThat(pacman.getPosition().getPositionX()).isEqualTo(3);
        assertThat(pacman.getPosition().getPositionY()).isEqualTo(3);
    }

    @Test
    public void shouldPacmanNotMoveY() {
        Pacman pacman = new Pacman(grid,new Position(0,0),Orientation.SOUTH);
        assertThat(pacman.move()).isFalse();
        assertThat(pacman.getPosition().getPositionX()).isEqualTo(0);
        assertThat(pacman.getPosition().getPositionY()).isEqualTo(0);

        assertThat(pacman.move()).isFalse();
        assertThat(pacman.getPosition().getPositionX()).isEqualTo(0);
        assertThat(pacman.getPosition().getPositionY()).isEqualTo(0);

        pacman.setPosition(new Position(3,3));
        pacman.setOrientation(Orientation.NORTH);

        assertThat(pacman.move()).isFalse();
        assertThat(pacman.getPosition().getPositionX()).isEqualTo(3);
        assertThat(pacman.getPosition().getPositionY()).isEqualTo(3);

        assertThat(pacman.move()).isFalse();
        assertThat(pacman.getPosition().getPositionX()).isEqualTo(3);
        assertThat(pacman.getPosition().getPositionY()).isEqualTo(3);
    }
}
