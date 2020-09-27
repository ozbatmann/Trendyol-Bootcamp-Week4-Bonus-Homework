package com.trendyol.toyrobot.domain;

import static org.junit.jupiter.api.Assertions.*;

import com.trendyol.toyrobot.domain.position.coordinate.Coordinate;
import com.trendyol.toyrobot.domain.position.direction.East;
import com.trendyol.toyrobot.domain.position.direction.North;
import com.trendyol.toyrobot.domain.position.direction.South;
import com.trendyol.toyrobot.domain.position.direction.West;
import org.junit.jupiter.api.Test;

public class RoverTest {

    @Test
    public void should_create_rover() {
        Rover rover = createNorthRover();
        assertEquals(0,  rover.getPosition().getCoordinate().getX());
        assertEquals(0,  rover.getPosition().getCoordinate().getY());
        assertEquals(Compass.NORTH, rover.getPosition().getDirection().getCompass());
    }

    @Test
    public void should_move_forward_when_compass_is_north() {
        Rover rover = createNorthRover();
        rover.move();
        assertEquals(1,  rover.getPosition().getCoordinate().getY());
    }

    @Test
    public void should_move_forward_when_compass_is_east() {
        Rover rover = createEastRover();
        rover.move();
        assertEquals(1, rover.getPosition().getCoordinate().getX());
    }

    @Test
    public void should_move_forward_when_compass_is_south() {
        Rover rover = createSouthRover();
        rover.move();
        assertEquals(-1, rover.getPosition().getCoordinate().getY());
    }

    @Test
    public void should_move_forward_when_compass_is_west() {
        Rover rover = createWestRover();
        rover.move();
        assertEquals(-1,  rover.getPosition().getCoordinate().getX());
    }

    @Test
    public void should_turn_left_when_compass_is_north() {
        Rover rover = createNorthRover();
        rover.turnLeft();
        assertEquals(Compass.WEST, rover.getPosition().getDirection().getCompass());
    }

    @Test
    public void should_turn_left_when_compass_is_west() {
        Rover rover = createWestRover();
        rover.turnLeft();
        assertEquals(Compass.SOUTH, rover.getPosition().getDirection().getCompass());
    }

    @Test
    public void should_turn_left_when_compass_is_south() {
        Rover rover = createSouthRover();
        rover.turnLeft();
        assertEquals(Compass.EAST, rover.getPosition().getDirection().getCompass());
    }

    @Test
    public void should_turn_left_when_compass_is_east() {
        Rover rover = createEastRover();
        rover.turnLeft();
        assertEquals(Compass.NORTH, rover.getPosition().getDirection().getCompass());
    }

    @Test
    public void should_turn_right_when_compass_is_north () {
        Rover rover = createNorthRover();
        rover.turnRight();
        assertEquals(Compass.EAST, rover.getPosition().getDirection().getCompass());
    }

    @Test
    public void should_turn_right_when_compass_is_east() {
        Rover rover = createEastRover();
        rover.turnRight();
        assertEquals(Compass.SOUTH, rover.getPosition().getDirection().getCompass());
    }

    @Test
    public void should_turn_right_when_compass_is_south() {
        Rover rover = createSouthRover();
        rover.turnRight();
        assertEquals(Compass.WEST, rover.getPosition().getDirection().getCompass());
    }

    @Test
    public void should_turn_right_when_compass_is_west () {
        Rover rover = createWestRover();
        rover.turnRight();
        assertEquals(Compass.NORTH, rover.getPosition().getDirection().getCompass());
    }

    private Rover createWestRover() {
        return new Rover(new Coordinate(0, 0), new West());
    }

    private Rover createSouthRover() {
        return new Rover(new Coordinate(0, 0), new South());
    }

    private Rover createEastRover() {
        return new Rover(new Coordinate(0, 0), new East());
    }

    private Rover createNorthRover() {
        return new Rover(new Coordinate(0, 0), new North());
    }
}
