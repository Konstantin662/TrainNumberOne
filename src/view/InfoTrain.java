package view;

import service.TrainAssembly;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InfoTrain {
    private BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    TrainAssembly trainAssembly;

    public InfoTrain(TrainAssembly trainAssembly){
        this.trainAssembly = trainAssembly;
    }

    public void getInfoTrain() throws IOException {// МОЖЕТ СЛОМАТЬ ПРОГРАММУ!
        System.out.println("Введите название поезда:");
        String str = reader.readLine();
        if(trainAssembly.TrainStorage1.containsKey(str)){
            System.out.println(trainAssembly.TrainStorage1.getTrain(str));
        } else {
          System.out.println("Ошибка!Такого поезда не существует.");
        }

    }

}
