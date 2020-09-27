package com.trendyol.toyrobot.domain.position.direction;

import com.trendyol.toyrobot.domain.Compass;
import com.trendyol.toyrobot.domain.position.coordinate.Coordinate;

public class West extends Direction {

	public West() {
		super(Compass.WEST);
	}

	@Override
	public Direction turnLeft() {
		return new South();
	}

	@Override
	public Direction turnRight() {
		return new North();
	}

	@Override
	public void move(Coordinate coordinate) {
		coordinate.setX(coordinate.getX() - 1);
	}
}
