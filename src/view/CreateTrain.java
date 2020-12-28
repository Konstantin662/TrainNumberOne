package view;

import model.TypeTrain;
import service.TrainAssembly;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CreateTrain {
    private BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private TrainAssembly trainAssembly;

    public CreateTrain(TrainAssembly trainAssembly){
        this.trainAssembly = trainAssembly;
    }

    public void createTrain1(TypeTrain typeTrain) throws IOException {
        System.out.println("Введите уникальное название поезда: ");
        String name = reader.readLine();
        if (!trainAssembly.TrainStorage1.containsKey(name)){
            trainAssembly.createNewTrain(name, typeTrain);
            System.out.println("Поезд создан!");
        } else {
            System.out.println("Невозможно сделать поезд,так как поезд с таким названием уже существует.");
            System.out.println("");
        }
    }
}
