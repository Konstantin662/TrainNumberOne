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

    public void addNewFreightWagon(Train freightTrain, FreightWagonType freightWagonType, int numOfWagon, int powerOfWagon){
        FreightWagon freightWagon = new FreightWagon(numOfWagon, powerOfWagon, freightWagonType);
        freightTrain.getSumWagons().add(freightWagon);
        if(!trainAssembly.sumPower(freightTrain)) {
            System.out.println("Присоединение невозможно!Слишком большая мощность вагона!");
            freightTrain.getSumWagons().remove(freightTrain.getSumWagons().size() - 1);
        } else{
            System.out.println("Вагон успешно добавлен!");
        }
    }
    public void AddFreightWagon1()throws IOException {
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
            switch (number){
                case "1":
                    System.out.println("Введите номер вагона и мощность через пробел:");
                    String options = reader.readLine();
                    int [] numberArray = Arrays.stream(options.split(" ")).mapToInt(Integer::parseInt).toArray();
                    addNewFreightWagon(trainAssembly.TrainStorage1.getTrain(wagonName),
                            FreightWagonType.CISTERN,numberArray[0],numberArray[1]);
                    break;
                case "2":
                    System.out.println("Введите номер вагона и мощность через пробел:");
                    String options1 = reader.readLine();
                    int [] numberArray1 = Arrays.stream(options1.split(" ")).mapToInt(Integer::parseInt).toArray();
                    addNewFreightWagon(trainAssembly.TrainStorage1.getTrain(wagonName),
                            FreightWagonType.OPENWAGON,numberArray1[0],numberArray1[1]);
                    break;
                case "3":
                    System.out.println("Введите номер вагона и мощность через пробел:");
                    String options2 = reader.readLine();
                    int [] numberArray2 = Arrays.stream(options2.split(" ")).mapToInt(Integer::parseInt).toArray();
                    addNewFreightWagon(trainAssembly.TrainStorage1.getTrain(wagonName),
                            FreightWagonType.PLATFORM,numberArray2[0],numberArray2[1]);
                    break;
                case "4":
                    System.out.println("Введите номер вагона и мощность через пробел:");
                    String options3 = reader.readLine();
                    int [] numberArray3 = Arrays.stream(options3.split(" ")).mapToInt(Integer::parseInt).toArray();
                    addNewFreightWagon(trainAssembly.TrainStorage1.getTrain(wagonName),
                            FreightWagonType.COVEREDWAGON,numberArray3[0],numberArray3[1]);
                    break;
                default:
                    System.out.println("Данные введены некорректно.");
            }
        }

    }
}
