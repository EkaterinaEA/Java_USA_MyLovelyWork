package Homework_lesson1.FileReflection;

/**
 * Created by Екатерина on 06.01.2019.
 */
public class Monitor {

    private String name;
    private String model;
    private int price;

    public Monitor(){}

    public Monitor(String name, String model, int price){
        this.name = name;
        this.model = model;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getModel() {
        return model;
    }

    public int getPrice() {
        return price;
    }
}
