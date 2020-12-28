package view;

import java.io.BufferedReader;
import java.io.IOException;

import model.TypeTrain;
import service.TrainAssembly;

public class MainView {
    private TrainAssembly trainAssembly;
    private BufferedReader reader;

    public MainView(TrainAssembly trainAssembly,BufferedReader reader) {
        this.trainAssembly = trainAssembly;
        this.reader = reader;
    }

    public void showView() throws IOException {
        boolean key = true;
        do {
            System.out.println("Список команд для выполнения:");
            System.out.println("1.Создать грузовой поезд.");
            System.out.println("2.Создать пассажирский поезд.");
            System.out.println("3.Добавить локомотив в любой поезд.");
            System.out.println("4.Добавить грузовой вагон.");
            System.out.println("5.Добавить пассажирский вагон.");
            System.out.println("6.Информация о поезде.");
            System.out.println("7.Информация о всех названиях поездов за время работы программы.");
            System.out.println("8.Завершить программу");
            System.out.println("Введите команду:");
            String indication = reader.readLine();
            switch (indication) {
                case "1":
                    CreateTrain createFreightTrain = new CreateTrain(trainAssembly);
                    createFreightTrain.createTrain1(TypeTrain.FREIGHT);
                    break;
                case "2":
                    CreateTrain createPassengerTrain = new CreateTrain(trainAssembly);
                    createPassengerTrain.createTrain1(TypeTrain.PASSENGER);
                    break;
                case "3":
                    AddLocomotive addLocomotive = new AddLocomotive(trainAssembly);
                    addLocomotive.addLocomotive1();
                    break;
                case "4":
                    AddFreightWagon addFreightWagon = new AddFreightWagon(trainAssembly);
                    addFreightWagon.addFreightWagon1();
                    break;
                case "5":
                    AddPassengerWagon addPassengerWagon = new AddPassengerWagon(trainAssembly);
                    addPassengerWagon.addPassengerWagon1();
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
