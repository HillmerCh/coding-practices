package com.hillmerch.walking;

import java.time.Duration;
import java.time.Instant;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WalkFromWestGateBuildingToTheHUBModel {

	private static final Logger logger = LoggerFactory.getLogger( WalkFromWestGateBuildingToTheHUBModel.class);

	public record Location(int latitude, int longitude){}//geographic coordinate

	public Location run(boolean useAutomaticDoorButton) {
		var startedTime = getStartedTime();

		openWestGateBuildingDoor(useAutomaticDoorButton);
		var currentLocation = walkToTheHUB();
		openHUBDoor(useAutomaticDoorButton);

		var runningTime = calculateRunningTime(startedTime);

		logger.info( "Time required to complete the model {}", runningTime );

		return currentLocation;
	}

	private long calculateRunningTime(Instant time) {
		return Duration.between( time, Instant.now()).toMillis();
	}

	private Instant getStartedTime() {
		return Instant.now() ;
	}

	private void openWestGateBuildingDoor(boolean useAutomaticDoorButton) {
		simulateTimeDoingTheTask(4000);

		if(useAutomaticDoorButton){
			// wait until the door is automatically opened
		}else{
			// push the door to open it
		}
	}

	private Location walkToTheHUB() {
		Location currentLocation = new Location( 0, 0 );
		currentLocation = walkForward( currentLocation, 2 );
		currentLocation = turnLeftAndWalk(currentLocation, 3);
		currentLocation = turnRightAndWalk( currentLocation, 5 );
		currentLocation = veerToRightAndWalk(currentLocation, 3);
		currentLocation = walkForward(currentLocation, 5);

		return currentLocation;
	}

	private Location walkForward(Location currentLocation, int steps) {
		simulateTimeDoingTheTask(1000*steps);
		return new Location( currentLocation.latitude() + steps , currentLocation.longitude );
	}

	private Location turnLeftAndWalk(Location currentLocation, int steps) {
		simulateTimeDoingTheTask(1000 + 1000*steps);
		return new Location( currentLocation.latitude(), currentLocation.longitude + steps );
	}

	private Location turnRightAndWalk(Location currentLocation, int steps) {
		simulateTimeDoingTheTask(1000 + 1000*steps);
		return new Location( currentLocation.latitude() + steps , currentLocation.longitude  );
	}

	private Location veerToRightAndWalk(Location currentLocation, int steps) {
		simulateTimeDoingTheTask(1000*steps);
		return new Location( currentLocation.latitude() + steps , currentLocation.longitude - steps );
	}

	private void openHUBDoor(boolean useAutomaticDoorButton) {
		simulateTimeDoingTheTask(4000);

		if(useAutomaticDoorButton){
			// wait until the door is automatically opened
		}else{
			// push the door to open it
		}
	}

	private void simulateTimeDoingTheTask(long milliseconds){
		try {
			Thread.sleep(milliseconds);
		}
		catch (InterruptedException e) {
			throw new RuntimeException( e );
		}
	}
}
