package model;

import java.util.List;

public class Train {
    private List<Locomotive> sumLocomotives;
    private List<Wagon> sumWagons;
    private TypeTrain typeTrain;
    private String name;

    public Train(String name,List<Locomotive> sumLocomotives,List<Wagon> sumWagons,TypeTrain typeTrain){
        this.name = name;
        this.sumLocomotives = sumLocomotives;
        this.sumWagons = sumWagons;
        this.typeTrain = typeTrain;

    }

    public TypeTrain getTypeTrain() {
        return typeTrain;
    }

    public void setTypeTrain(TypeTrain typeTrain) {
        this.typeTrain = typeTrain;
    }

    public List<Locomotive> getSumLocomotives() {
        return sumLocomotives;
    }

    public void setSumLocomotives(List<Locomotive> sumLocomotives) {
        this.sumLocomotives = sumLocomotives;
    }

    public List<Wagon> getSumWagons() {
        return sumWagons;
    }

    public void setSumWagons(List<Wagon> sumWagons) {
        this.sumWagons = sumWagons;
    }

    public String toString(){
        return "name = '" + name + "',\nlocomotives = "
                + sumLocomotives + ",\nwagons = " + sumWagons + ",\ntypeTrain = " + typeTrain + ".";
    }
}
