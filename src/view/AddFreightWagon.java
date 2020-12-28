package view;

import model.FreightWagon;
import model.FreightWagonType;
import model.Train;
import model.TypeTrain;
import service.TrainAssembly;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class AddFreightWagon {
    private BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    TrainAssembly trainAssembly;

    public AddFreightWagon(TrainAssembly trainAssembly){
        this.trainAssembly = trainAssembly;
    }


    public void addFreightWagon1()throws IOException {
        System.out.println("Введите имя грузового поезда,к которому хотите добавить вагон: ");
        String wagonName = reader.readLine();
        if(trainAssembly.TrainStorage1.containsKey(wagonName)
                && trainAssembly.TrainStorage1.getTrain(wagonName).getTypeTrain() == TypeTrain.FREIGHT){
            System.out.println("Выберите тип вагона:");
            System.out.println("1.Цистерна.");
            System.out.println("2.Открытый вагон.");
            System.out.println("3.Платформа.");
            System.out.println("4.Крытый вагон.");
            String number = reader.readLine();
            System.out.println("Введите номер вагона и мощность через пробел:");
            String options = reader.readLine();
            int [] numberArray = Arrays.stream(options.split(" ")).mapToInt(Integer::parseInt).toArray();
            switch (number){
                case "1":
                    trainAssembly.addNewFreightWagon(trainAssembly.TrainStorage1.getTrain(wagonName),
                            FreightWagonType.CISTERN,numberArray[0],numberArray[1]);
                    break;
                case "2":
                    trainAssembly.addNewFreightWagon(trainAssembly.TrainStorage1.getTrain(wagonName),
                            FreightWagonType.OPENWAGON,numberArray[0],numberArray[1]);
                    break;
                case "3":
                    trainAssembly.addNewFreightWagon(trainAssembly.TrainStorage1.getTrain(wagonName),
                            FreightWagonType.PLATFORM,numberArray[0],numberArray[1]);
                    break;
                case "4":
                    trainAssembly.addNewFreightWagon(trainAssembly.TrainStorage1.getTrain(wagonName),
                            FreightWagonType.COVEREDWAGON,numberArray[0],numberArray[1]);
                    break;
                default:
                    System.out.println("Данные введены некорректно.");
            }
        }

    }
}
