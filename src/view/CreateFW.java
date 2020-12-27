package view;

import service.TrainAssembly;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CreateFW {
    private BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private TrainAssembly trainAssembly;

    public CreateFW(TrainAssembly trainAssembly){
        this.trainAssembly = trainAssembly;
    }

    public void CreateFW1() throws IOException{
        System.out.println("Введите уникальное название поезда: ");
        String name = reader.readLine();
        if (!trainAssembly.TrainStorage1.containsKey(name)){
            trainAssembly.createFreightTrain(name);
            System.out.print("Поезд создан!");
        } else {
            System.out.println("Невозможно сделать поезд,так как поезд с таким названием уже существует.");
            System.out.println("");
        }
    }
}