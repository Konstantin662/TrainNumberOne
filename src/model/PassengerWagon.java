package model;

public class PassengerWagon extends Wagon {
    private PassengerWagonType passengerWagonType;

    public PassengerWagon (int numOfWagon,int powerOfWagon,PassengerWagonType passengerWagonType){
        super(numOfWagon,powerOfWagon);
        this.passengerWagonType = passengerWagonType;
    }
    public String toString() {
        return "PassengerWagon:(type = " + passengerWagonType
                + ",number = " + getNumOfWagon() + ",power = " + getPowerOfWagon() + ")";
    }
}
