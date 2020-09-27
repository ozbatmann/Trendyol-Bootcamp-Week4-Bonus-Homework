package com.trendyol.toyrobot.domain.position.direction;

import com.trendyol.toyrobot.domain.Compass;
import com.trendyol.toyrobot.domain.position.coordinate.Coordinate;

public class North extends Direction {

	public North() {
		super(Compass.NORTH);
	}

	@Override
	public Direction turnLeft() {
		return new West();
	}

	@Override
	public Direction turnRight() {
		return new East();
	}

	@Override
	public void move(Coordinate coordinate) {
		coordinate.setY(coordinate.getY() + 1);
	}
}
