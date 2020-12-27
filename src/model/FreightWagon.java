package model;

public class FreightWagon extends Wagon {
    private FreightWagonType FreightWagonType;

    public FreightWagon (int numOfWagon,int powerOfWagon,FreightWagonType FreightWagonType){
        super(numOfWagon,powerOfWagon);
        this.FreightWagonType = FreightWagonType;
    }

    public String toString() {
        return "FreightWagon:(type = " + FreightWagonType
                + ",number = " + getNumOfWagon() + ",power = " + getPowerOfWagon() + ")";
    }
}
