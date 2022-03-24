package web.model;

import java.util.Objects;

public class Car {
    private String model;
    private String color;
    private int year;

    public Car(String model, String color, int age) {
        this.model = model;
        this.color = color;
        this.year = age;
    }

    public String getName() {
        return model;
    }

    public void setName(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return year;
    }

    public void setAge(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Car car = (Car) o;
        return year == car.year && Objects.equals(model, car.model)
                && Objects.equals(color, car.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, color, year);
    }
}