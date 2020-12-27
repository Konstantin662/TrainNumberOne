package model;

public class PassengerWagon extends Wagon {
    private PassengerWagonType passengerWagonType;

    public PassengerWagon (int numOfWagon,int powerOfWagon,PassengerWagonType passengerWagonType){
        super(numOfWagon,powerOfWagon);
        this.passengerWagonType = passengerWagonType;
    }
}
