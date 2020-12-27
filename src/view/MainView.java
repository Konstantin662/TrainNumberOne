package view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import service.TrainAssembly;

public class MainView {
    private TrainAssembly trainAssembly;
    private BufferedReader reader;

    public MainView(TrainAssembly trainAssembly,BufferedReader reader) {
        this.trainAssembly = trainAssembly;
        this.reader = reader;
    }

    public void ShowView() throws IOException {
        boolean key = true;
        do {
            System.out.println("1.Создать грузовой поезд.");
            System.out.println("2.Создать пассажирский поезд.");
            System.out.println("3.Добавить локомотив в любой поезд.");
            System.out.println("4.Добавить грузовой вагон.");
            System.out.println("5.Добавить пассажирский вагон.");
            System.out.println("6.Информация о поезде.");
            System.out.println("7.Информация о всех поездах.");
            System.out.println("8.Завершить программу");
            System.out.println("");
            String indication = reader.readLine();
            switch (indication) {
                case "1":
                    CreateFW createFW = new CreateFW(trainAssembly);
                    createFW.CreateFW1();
                    break;
                case "2":
                    CreatePW createPW = new CreatePW(trainAssembly);
                    createPW.CreatePW1();
                    break;
                case "3":
                    AddLocomotive addLocomotive = new AddLocomotive(trainAssembly);
                    addLocomotive.AddLocomotive1();
                    break;
                case "4":
                    AddFreightWagon addFreightWagon = new AddFreightWagon(trainAssembly);
                    addFreightWagon.AddFreightWagon1();
                    break;
                case "5":
                    AddPassengerWagon addPassengerWagon = new AddPassengerWagon(trainAssembly);
                    addPassengerWagon.AddPassengerWagon1();
                    break;
                case "6":
                    InfoTrain infoTrain = new InfoTrain(trainAssembly);
                    infoTrain.getInfoTrain();
                    break;
                case "7":
                    System.out.println("Название всех поездов: ");
                    trainAssembly.TrainStorage1.getAllNameTrain().forEach(System.out::println);
                    break;
                case "8":
                    key = false;
                    break;
                default:
                    System.out.println("Введите корректную формулировку и попробуйте еще раз!");
            }
        } while (key);
    }
}
