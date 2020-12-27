package view;

import model.PassengerWagonType;
import model.TypeTrain;
import service.TrainAssembly;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class AddLocomotive {
    private BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    TrainAssembly trainAssembly;

    public AddLocomotive(TrainAssembly trainAssembly){
        this.trainAssembly = trainAssembly;
    }

    public void AddLocomotive1() throws IOException {
        System.out.println("Введите имя поезда,к которому хотите добавить локомотив(максимальное количество 3): ");
        String wagonName = reader.readLine();
        if (trainAssembly.TrainStorage1.containsKey(wagonName)) {
            System.out.println("Введите номер локомотива и мощность через пробел:");
            String options = reader.readLine();
            int [] numberArray = Arrays.stream(options.split(" ")).mapToInt(Integer::parseInt).toArray();
            trainAssembly.addNewLocomotive(trainAssembly.TrainStorage1.getTrain(wagonName),
                    numberArray[0],numberArray[1]);
            System.out.println("Локомотив добавлен.");
        }
    }
}
