
public class MyAirplane extends  MyTransportation{
    private String startingPoint;
    private String finalDestination;

    MyAirplane(String Name,double Speed, String Color, int NumberOfSeats,String Model,String startingPoint,String finalDestination){
        super(Name,Speed,Color,NumberOfSeats,Model);
        this.finalDestination=finalDestination;
        this.startingPoint=startingPoint;
    }

    public String getStartingPoint() {
        return startingPoint;
    }

    public void setStartingPoint(String startingPoint) {
        this.startingPoint = startingPoint;
    }

    public String getFinalDestination(){
        return finalDestination;
    }

    public void setFinalDestination(String finalDestination){
        this.finalDestination=finalDestination;
    }

    public String toString(){
        return("My airplane has: name= "+name+
                ", speed= "+speed+", color="+color+
                ", number of seats= "+numberOfSeats+
                " ,model= "+model+", starting point = "+startingPoint+
                ", final destination= "+finalDestination+".");
    }
}


