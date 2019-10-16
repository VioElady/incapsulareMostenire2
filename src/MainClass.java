
public class MainClass {

    public static void main(String[] arg) {

        MyTransportation favorit = new MyTransportation("Bycyclet",20,"red",2,"Fn45y");
        System.out.println(favorit);

        MyShip titanic = new MyShip("Titanic",90,"black",800,"FDS3344",400,3 );
        System.out.println(titanic);

        MyAirplane veic = new MyAirplane("VEIC",870,"black",400,"boeing 747","Londra","Paris");
        System.out.println(veic);
    }
}
