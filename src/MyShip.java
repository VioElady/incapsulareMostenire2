
public class MyShip extends MyTransportation{
    private int equipmentShip;
    private int timeTravel;

    MyShip(String Name,double Speed,String Color,int NumberOfSeats,String Model,int equipmentForTheShip,int timeTravel){
        super(Name,Speed,Color,NumberOfSeats,Model);
        this.equipmentShip =equipmentForTheShip;
        this.timeTravel =timeTravel;
    }

    public double getTimeTravel() {
        return timeTravel;
    }

    public void setTimeTravel(int timeTravel) {
        this.timeTravel = timeTravel;
    }

    public int getEquipmentShip() {
        return equipmentShip;
    }

    public void setEquipmentShip(int equipmentShip) {
        this.equipmentShip = equipmentShip;
    }

    @Override
    public String toString() {
        return("The journey is on the ship: name= "+ name
                +", model= "+ model +", color="+color
                +", number of seats= "+numberOfSeats
                +", equipments= "+equipmentShip
                +", time= " +timeTravel+" months.");
    }
}
