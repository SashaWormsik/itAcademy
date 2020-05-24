package by.itAcademy.pilotProject.model;

public class TV {

    private String company;
    private int screenDiagonal;

    public TV(String company, int screenDiagonal) {
        this.company = company;
        this.screenDiagonal = screenDiagonal;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getScreenDiagonal() {
        return screenDiagonal;
    }

    public void setScreenDiagonal(int screenDiagonal) {
        this.screenDiagonal = screenDiagonal;
    }

    @Override
    public String toString() {
        return "TV:" + company + ", screenDiagonal=" + screenDiagonal;
    }
}
