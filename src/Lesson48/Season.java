package Lesson48;

public enum Season {
    SUMMER(30), WINTER(-30), AUTUMN(10), SPRING(15);

    private int temperature;

    Season(int temperature) {
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }
}
