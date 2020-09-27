package com.trendyol.toyrobot.domain.position.direction;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.trendyol.toyrobot.domain.Compass;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@JsonTypeInfo (use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "compass")
@JsonSubTypes ({
		@JsonSubTypes.Type (value = North.class, name = "NORTH"),
		@JsonSubTypes.Type (value = South.class, name = "SOUTH"),
		@JsonSubTypes.Type (value = West.class, name = "WEST"),
		@JsonSubTypes.Type (value = East.class, name = "EAST")
})

public abstract class Direction implements Turnable, Moveable, Serializable {

	private Compass compass;

	public Direction(Compass compass) {
		this.compass = compass;
	}
}
