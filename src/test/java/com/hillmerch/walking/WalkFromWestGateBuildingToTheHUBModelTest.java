package com.hillmerch.walking;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class WalkFromWestGateBuildingToTheHUBModelTest {

	private final WalkFromWestGateBuildingToTheHUBModel.Location HUB_LOCATION = new WalkFromWestGateBuildingToTheHUBModel.Location( 15, 0);
	@Test
	void when_model_is_run_destination_will_be_reached_successfully() {
		var walkFromWestGateBuildingToTheHUBModel = new WalkFromWestGateBuildingToTheHUBModel();
		var location = walkFromWestGateBuildingToTheHUBModel.run( true );
		assertEquals( HUB_LOCATION, location);
	}
}
