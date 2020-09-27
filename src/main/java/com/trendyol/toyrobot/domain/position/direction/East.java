package com.trendyol.toyrobot.domain.position.direction;

import com.trendyol.toyrobot.domain.Compass;
import com.trendyol.toyrobot.domain.position.coordinate.Coordinate;

public class East extends Direction {

	public East() {
		super(Compass.EAST);
	}

	@Override
	public Direction turnLeft() {
		return new North();
	}

	@Override
	public Direction turnRight() {
		return new South();
	}

	@Override
	public void move(Coordinate coordinate) {
		coordinate.setX(coordinate.getX() + 1);
	}
}
