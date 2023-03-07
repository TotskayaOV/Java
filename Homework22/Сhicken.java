package Homework22;

public class Сhicken extends Bird {

    public Сhicken(Double growth, Double weight, String eyeColor, Double flightAltitude) {
        super(growth, weight, eyeColor, flightAltitude);
    }

    public void voice() {
        System.out.println("Ко ко ко!");;
    }

    public void fly(){
        System.out.printf("Я лечу на %d метрах, где %d - высота полета", flightAltitude, flightAltitude);
    }

    @Override
    public String toString() {
        return "Курица." + super.toString();
    }
}
