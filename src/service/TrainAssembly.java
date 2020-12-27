package service;

import model.*;

import java.util.ArrayList;
import java.util.List;

public class TrainAssembly {
    public TrainStorage TrainStorage1 = new TrainStorage();

    public Train createPassengerTrain(String name) {
        List<Locomotive> PassengerLocomotive = new ArrayList<>();

        List<Wagon> PassengerOfWagon = new ArrayList<>();

        Train PassengerTrain = new Train(name, PassengerLocomotive, PassengerOfWagon, TypeTrain.PASSENGER);
        TrainStorage1.AddTrain(name, PassengerTrain);
        return PassengerTrain;
    }

    public Train createFreightTrain(String name) {
        List<Locomotive> FreightLocomotive = new ArrayList<>();

        List<Wagon> FreightOfWagon = new ArrayList<>();

        Train FreightTrain = new Train(name, FreightLocomotive, FreightOfWagon, TypeTrain.FREIGHT);
        TrainStorage1.AddTrain(name, FreightTrain);
        return FreightTrain;
    }

    public boolean sumPower(Train railwayTrain) {
        int powerSumLocomotive = 0;
        for (int i = 0; i < railwayTrain.getSumLocomotives().size(); i++) {
            powerSumLocomotive += railwayTrain.getSumLocomotives().get(i).getPowerLocomotive();
        }
        int powerSumWagon = 0;
        for (int j = 0; j < railwayTrain.getSumWagons().size(); j++) {
            powerSumWagon += railwayTrain.getSumWagons().get(j).getPowerOfWagon();
        }

        if (powerSumLocomotive >= powerSumWagon) {
            return true;
        } else {
            return false;
        }
    }
}


