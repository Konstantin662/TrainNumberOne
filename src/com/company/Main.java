package com.company;
import service.TrainAssembly;
import view.MainView;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
	TrainAssembly trainAssembly = new TrainAssembly();
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    MainView mainView = new MainView(trainAssembly,reader);
    mainView.showView();
    }
}
