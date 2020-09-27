package com.trendyol.toyrobot.domain;

import com.trendyol.toyrobot.domain.position.coordinate.Coordinate;
import com.trendyol.toyrobot.domain.position.direction.Direction;
import com.trendyol.toyrobot.domain.position.Position;
import com.trendyol.toyrobot.domain.position.direction.North;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;

@Getter
@Setter
public class Rover {

    private String id;
    private Position position;
    private List<Material> material;

    public Rover() {
        this.id = UUID.randomUUID().toString();
        position = new Position(new Coordinate(0,0),new North());
        this.material = Arrays.asList(new Material("Material1"));
    }

    public Rover(Coordinate coordinate, Direction direction) {
        this.id = UUID.randomUUID().toString();
        position = new Position(coordinate,direction);
        this.material = Arrays.asList(new Material("Material2"));
    }

    public void move() {
        this.position.move();
        this.material = Arrays.asList(new Material("Material3"));
    }

    public void turnLeft() {
        this.position.turnLeft();
        this.material = Arrays.asList(new Material("Material4"));
    }

    public void turnRight() {
        this.position.turnRight();
        this.material = Arrays.asList(new Material("Material5"));
    }
}
