package by.itAcademy.pilotProject.service;

import by.itAcademy.pilotProject.model.HomeSystem;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HomeSystemTest {

    @Test
    public void test1() {
        HomeSystem homeSystem = new HomeSystemService().assembleCinemaSystem();
        assertEquals("Philips", homeSystem.getAcousticSystem().getCompany());
        assertEquals("SONY", homeSystem.getTv().getCompany());
    }

}
