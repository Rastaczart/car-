package pl.akademiakodu.cars;

import java.util.ArrayList;
import java.util.List;

public class Car {


    private String brand;
    private String model;
    private String description;

public Car(){ }



    public String toString(){
        return getBrand()+" "+ getModel()+" "+getDescription();
    }

    public Car(String brand, String model, String description) {
        this();
        this.brand = brand;
        this.model = model;
        this.description = description;
    }


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
