package model;

public class Wagon {
    private int numOfWagon;
    private int powerOfWagon;

    public Wagon (int numOfWagon,int powerOfWagon){
        this.numOfWagon = numOfWagon;
        this.powerOfWagon = powerOfWagon;
    }
    public int getNumOfWagon() {
        return this.numOfWagon;
    }

    public void setNumOfWagon(int numOfWagon) {
        this.numOfWagon = numOfWagon;
    }

    public int getPowerOfWagon() {
        return powerOfWagon;
    }

    public void setPowerOfWagon(int powerOfWagon) {
        this.powerOfWagon = powerOfWagon;
    }
}
