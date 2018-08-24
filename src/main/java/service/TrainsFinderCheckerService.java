package service;

import model.Passenger;
import model.Station;
import model.Train;

import java.time.LocalDateTime;

public class TrainsFinderCheckerService {
    Train findTrain(Station startStation, Station endStation, LocalDateTime startTime){
        return new Train();
    }

    boolean checkCapacity(Train train){
        return false;
    }

    boolean checkPresenceOfPassenger(Train train, Passenger passenger){
        return false;
    }

    boolean checkTime(Train train, Station startStation){
        return false;
    }


}
