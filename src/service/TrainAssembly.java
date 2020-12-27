package service;

import model.*;

import java.util.ArrayList;
import java.util.List;

public class TrainAssembly {
    public TrainStorage TrainStorage1 = new TrainStorage();

    public Train createPassengerTrain(String name) {
        List<Locomotive> PassengerLocomotive = new ArrayList<>();

        List<Wagon> PassengerOfWagon = new ArrayList<>();

        Train PassengerTrain = new Train(name,PassengerLocomotive,PassengerOfWagon,TypeTrain.PASSENGER);
        TrainStorage1.AddTrain(name,PassengerTrain);
        return PassengerTrain;
    }

    public Train createFreightTrain(String name) {
        List<Locomotive> FreightLocomotive = new ArrayList<>();

        List<Wagon> FreightOfWagon = new ArrayList<>();

        Train FreightTrain = new Train(name,FreightLocomotive,FreightOfWagon,TypeTrain.FREIGHT);
        TrainStorage1.AddTrain(name,FreightTrain);
        return FreightTrain;
    }

    public void addNewPassengerWagon(Train passengerTrain,PassengerWagonType passengerWagonType,int numOfWagon,int powerOfWagon){
        PassengerWagon passengerWagon = new PassengerWagon(numOfWagon,powerOfWagon,passengerWagonType);
        passengerTrain.getSumWagons().add(passengerWagon);
    }

    public void addNewFreightWagon(Train freightTrain,FreightWagonType freightWagonType,int numOfWagon,int powerOfWagon){
        FreightWagon freightWagon = new FreightWagon(numOfWagon,powerOfWagon,freightWagonType);
        freightTrain.getSumWagons().add(freightWagon);
    }

    public void addNewLocomotive(Train railwayTrain,int numLocomotive,int powerLocomotive) {
        Locomotive locomotive = new Locomotive(numLocomotive, powerLocomotive);
        railwayTrain.getSumLocomotives().add(locomotive);
    }

}

