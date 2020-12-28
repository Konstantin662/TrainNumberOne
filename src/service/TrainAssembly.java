package service;

import model.*;

import java.util.ArrayList;
import java.util.List;

public class TrainAssembly {
    public TrainStorage TrainStorage1 = new TrainStorage();

    public Train createNewTrain(String name,TypeTrain typeTrain) {
        List<Locomotive> Locomotive = new ArrayList<>();

        List<Wagon> Wagon = new ArrayList<>();

        Train train = new Train(name, Locomotive, Wagon, typeTrain);
        TrainStorage1.addTrain(name, train);
        return train;
    }

    public boolean comparePower(Train railwayTrain,int powerOfLastWagon) {
        int powerSumLocomotive = 0;
        for (int i = 0; i < railwayTrain.getSumLocomotives().size(); i++) {
            powerSumLocomotive += railwayTrain.getSumLocomotives().get(i).getPowerLocomotive();
        }
        int powerSumWagon = 0;
        for (int j = 0; j < railwayTrain.getSumWagons().size(); j++) {
            powerSumWagon += railwayTrain.getSumWagons().get(j).getPowerOfWagon();
        }
        powerSumWagon += powerOfLastWagon;

        if (powerSumLocomotive >= powerSumWagon) {
            return true;
        } else {
            return false;
        }
    }

    public void addNewLocomotive(Train railwayTrain, int numLocomotive, int powerLocomotive) {
        if (railwayTrain.getSumLocomotives().size() < 3) {
            Locomotive locomotive = new Locomotive(numLocomotive, powerLocomotive);
            railwayTrain.getSumLocomotives().add(locomotive);
        }
    }

    public void addNewFreightWagon(Train freightTrain, FreightWagonType freightWagonType, int numOfWagon, int powerOfWagon) {
        if(comparePower(freightTrain,powerOfWagon)) {
            FreightWagon freightWagon = new FreightWagon(numOfWagon, powerOfWagon, freightWagonType);
            freightTrain.getSumWagons().add(freightWagon);
        }
    }
    public void addNewPassengerWagon(Train passengerTrain, PassengerWagonType passengerWagonType, int numOfWagon, int powerOfWagon) {
        if(comparePower(passengerTrain,powerOfWagon)) {
            PassengerWagon passengerWagon = new PassengerWagon(numOfWagon, powerOfWagon, passengerWagonType);
            passengerTrain.getSumWagons().add(passengerWagon);
        }
    }
}


