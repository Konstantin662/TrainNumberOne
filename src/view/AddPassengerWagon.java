package view;

import model.*;
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

    public void addPassengerWagon1()throws IOException {
        System.out.println("Введите имя пассажирского поезда,к которому хотите добавить вагон: ");
        String wagonName = reader.readLine();
        if(trainAssembly.TrainStorage1.containsKey(wagonName)
                && trainAssembly.TrainStorage1.getTrain(wagonName).getTypeTrain() == TypeTrain.PASSENGER){
            System.out.println("Выберите тип вагона:");
            System.out.println("1.Вагон-купе.");
            System.out.println("2.Вагон-плацкарт.");
            System.out.println("3.Вагон-ресторан.");
            String number = reader.readLine();
            System.out.println("Введите номер вагона и мощность через пробел:");
            String options = reader.readLine();
            int [] numberArray = Arrays.stream(options.split(" ")).mapToInt(Integer::parseInt).toArray();
            switch (number){
                case "1":
                    trainAssembly.addNewPassengerWagon(trainAssembly.TrainStorage1.getTrain(wagonName),
                            PassengerWagonType.COMPARTMENT,numberArray[0],numberArray[1]);
                    break;
                case "2":
                    trainAssembly.addNewPassengerWagon(trainAssembly.TrainStorage1.getTrain(wagonName),
                            PassengerWagonType.SLEEPINGWAGON,numberArray[0],numberArray[1]);
                    break;
                case "3":
                    trainAssembly.addNewPassengerWagon(trainAssembly.TrainStorage1.getTrain(wagonName),
                            PassengerWagonType.WAGONRESTAURANT,numberArray[0],numberArray[1]);
                    break;
                default:
                    System.out.println("Данные введены некорректно.");
            }
        }

    }
}
