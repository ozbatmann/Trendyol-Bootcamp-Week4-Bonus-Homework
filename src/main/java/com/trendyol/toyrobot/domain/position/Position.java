package com.trendyol.toyrobot.domain.position;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.trendyol.toyrobot.domain.position.coordinate.Coordinate;
import com.trendyol.toyrobot.domain.position.direction.Direction;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@JsonDeserialize (as = Position.class)
@NoArgsConstructor
@AllArgsConstructor
public class Position {

	private Coordinate coordinate;
	private Direction direction;

	public void turnLeft() {
		this.direction = direction.turnLeft();
	}

	public void turnRight() {
		this.direction = direction.turnRight();
	}

	public void move() {
		direction.move(coordinate);
	}
}
