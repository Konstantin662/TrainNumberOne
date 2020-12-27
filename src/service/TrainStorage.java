package service;

import model.Train;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TrainStorage {
    private Map<String, Train> TrainStorage = new HashMap();

    public void AddTrain(String name,Train train){
        if (!this.TrainStorage.containsKey(name) || !this.TrainStorage.containsValue(train)){
            this.TrainStorage.put(name,train);
        }
    }

    public Train getTrain(String name){
        return (Train) this.TrainStorage.get(name);
    }

    public Boolean containsKey(String str){
        return this.TrainStorage.containsKey(str);
    }

    public Set<String> getAllNameTrain(){
        return this.TrainStorage.keySet();
    }

}
