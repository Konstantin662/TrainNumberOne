package view;

import model.FreightWagonType;
import model.PassengerWagonType;
import model.TypeTrain;
import service.TrainAssembly;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class AddPassengerWagon {
    private BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    TrainAssembly trainAssembly;

    public AddPassengerWagon(TrainAssembly trainAssembly){
        this.trainAssembly = trainAssembly;
    }
    public void AddPassengerWagon1()throws IOException {
        System.out.println("Введите имя пассажирского поезда,к которому хотите добавить вагон: ");
        String wagonName = reader.readLine();
        if(trainAssembly.TrainStorage1.containsKey(wagonName)
                && trainAssembly.TrainStorage1.getTrain(wagonName).getTypeTrain() == TypeTrain.PASSENGER){
            System.out.println("Выберите тип вагона:");
            System.out.println("1.Вагон-купе.");
            System.out.println("2.Вагон-плацкарт.");
            System.out.println("3.Вагон-ресторан.");
            String number = reader.readLine();
            switch (number){
                case "1":
                    System.out.println("Введите номер вагона и мощность через пробел:");
                    String options = reader.readLine();
                    int [] numberArray = Arrays.stream(options.split(" ")).mapToInt(Integer::parseInt).toArray();
                    trainAssembly.addNewPassengerWagon(trainAssembly.TrainStorage1.getTrain(wagonName),
                            PassengerWagonType.COMPARTMENT,numberArray[0],numberArray[1]);
                    System.out.println("Вагон добавлен.");
                    break;
                case "2":
                    System.out.println("Введите номер вагона и мощность через пробел:");
                    String options1 = reader.readLine();
                    int [] numberArray1 = Arrays.stream(options1.split(" ")).mapToInt(Integer::parseInt).toArray();
                    trainAssembly.addNewPassengerWagon(trainAssembly.TrainStorage1.getTrain(wagonName),
                            PassengerWagonType.SLEEPINGWAGON,numberArray1[0],numberArray1[1]);
                    System.out.println("Вагон добавлен.");
                    break;
                case "3":
                    System.out.println("Введите номер вагона и мощность через пробел:");
                    String options2 = reader.readLine();
                    int [] numberArray2 = Arrays.stream(options2.split(" ")).mapToInt(Integer::parseInt).toArray();
                    trainAssembly.addNewPassengerWagon(trainAssembly.TrainStorage1.getTrain(wagonName),
                            PassengerWagonType.WAGONRESTAURANT,numberArray2[0],numberArray2[1]);
                    System.out.println("Вагон добавлен.");
                    break;
                default:
                    System.out.println("Данные введены некорректно.");
            }
        }

    }
}
