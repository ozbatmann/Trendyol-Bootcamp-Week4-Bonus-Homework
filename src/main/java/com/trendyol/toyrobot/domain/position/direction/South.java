package com.trendyol.toyrobot.domain.position.direction;

import com.trendyol.toyrobot.domain.Compass;
import com.trendyol.toyrobot.domain.position.coordinate.Coordinate;

public class South extends Direction {

	public South() {
		super(Compass.SOUTH);
	}

	@Override
	public Direction turnLeft() {
		return new East();
	}

	@Override
	public Direction turnRight() {
		return new West();
	}

	@Override
	public void move(Coordinate coordinate) {
		coordinate.setY(coordinate.getY() - 1);
	}
}
