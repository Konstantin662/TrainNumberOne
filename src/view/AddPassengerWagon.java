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

    public void addNewPassengerWagon(Train passengerTrain, PassengerWagonType passengerWagonType, int numOfWagon, int powerOfWagon) {
        PassengerWagon passengerWagon = new PassengerWagon(numOfWagon, powerOfWagon, passengerWagonType);
        passengerTrain.getSumWagons().add(passengerWagon);
        if(!trainAssembly.sumPower(passengerTrain)) {
            System.out.println("Присоединение невозможно!Слишком большая мощность вагона!");
            passengerTrain.getSumWagons().remove(passengerTrain.getSumWagons().size() - 1);
        } else {
            System.out.println("Вагон успешно добавлен!");
        }
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
                    addNewPassengerWagon(trainAssembly.TrainStorage1.getTrain(wagonName),
                            PassengerWagonType.COMPARTMENT,numberArray[0],numberArray[1]);
                    break;
                case "2":
                    System.out.println("Введите номер вагона и мощность через пробел:");
                    String options1 = reader.readLine();
                    int [] numberArray1 = Arrays.stream(options1.split(" ")).mapToInt(Integer::parseInt).toArray();
                    addNewPassengerWagon(trainAssembly.TrainStorage1.getTrain(wagonName),
                            PassengerWagonType.SLEEPINGWAGON,numberArray1[0],numberArray1[1]);
                    break;
                case "3":
                    System.out.println("Введите номер вагона и мощность через пробел:");
                    String options2 = reader.readLine();
                    int [] numberArray2 = Arrays.stream(options2.split(" ")).mapToInt(Integer::parseInt).toArray();
                    addNewPassengerWagon(trainAssembly.TrainStorage1.getTrain(wagonName),
                            PassengerWagonType.WAGONRESTAURANT,numberArray2[0],numberArray2[1]);
                    break;
                default:
                    System.out.println("Данные введены некорректно.");
            }
        }

    }
}
