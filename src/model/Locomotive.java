package model;

public class Locomotive {
    private int powerLocomotive;
    private long numLocomotive;


    public Locomotive (long numLocomotive,int powerLocomotive){
        this.numLocomotive = numLocomotive;
        this.powerLocomotive = powerLocomotive;
    }
    public int getPowerLocomotive() {
        return powerLocomotive;
    }

    public void setPowerLocomotive(int powerLocomotive){
        this.powerLocomotive = powerLocomotive;
    }
    public long getNumLocomotive() {
        return numLocomotive;
    }

    public String toString(){
        return "Locomotive:(numberLoc = " + numLocomotive
                + ",powerLoc = " + powerLocomotive + ")";
    }
}
