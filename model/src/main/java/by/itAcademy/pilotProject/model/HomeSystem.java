package by.itAcademy.pilotProject.model;

public class HomeSystem {
    private TV tv;
    private AcousticSystem acousticSystem;

    public HomeSystem(TV tv, AcousticSystem acousticSystem) {
        this.tv = tv;
        this.acousticSystem = acousticSystem;
    }

    public TV getTv() {
        return tv;
    }

    public void setTv(TV tv) {
        this.tv = tv;
    }

    public AcousticSystem getAcousticSystem() {
        return acousticSystem;
    }

    public void setAcousticSystem(AcousticSystem acousticSystem) {
        this.acousticSystem = acousticSystem;
    }

    @Override
    public String toString() {
        return "HomeSystem:" + tv + acousticSystem;
    }
}
