package by.itAcademy.pilotProject.service;

import by.itAcademy.pilotProject.model.AcousticSystem;
import by.itAcademy.pilotProject.model.HomeSystem;
import by.itAcademy.pilotProject.model.TV;

public class HomeSystemService {

    public HomeSystem assembleCinemaSystem() {
        TV tv = new TV("SONY", 42);
        AcousticSystem acousticSystem = new AcousticSystem("Philips", 16);
        return new HomeSystem(tv, acousticSystem);
    }

}
