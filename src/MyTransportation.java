

public class MyTransportation {
    protected String name;
    protected double speed;
    protected String color;
    protected int numberOfSeats;
    protected String model;

    MyTransportation(String name,double speed, String color, int numberOfSeats,String model){
        this.name=name;
        this.speed=speed;
        this.color=color;
        this.numberOfSeats=numberOfSeats;
        this.model=model;
    }

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return ("I have a vehicle: name: "+ name +
                ", model: "+ model+
                ", color: "+ color+
                ", number of seats:"+ numberOfSeats+".");
    }
}
