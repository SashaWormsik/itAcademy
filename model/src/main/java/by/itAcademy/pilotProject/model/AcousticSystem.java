package by.itAcademy.pilotProject.model;

public class AcousticSystem {

    private String company;
    private int power;

    public AcousticSystem(String company, int power) {
        this.company = company;
        this.power = power;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return "AcousticSystem:" + company + ", power=" + power;
    }
}
