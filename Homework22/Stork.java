package Homework22;

public class Stork extends Bird {

    public Stork(Double growth, Double weight, String eyeColor, Double flightAltitude) {
        super(growth, weight, eyeColor, flightAltitude);
    }

    public void voice() {
        System.out.println("Че-ли че-ли че-ли");;
    }

    public void fly(){
        System.out.printf("Я лечу на %d метрах, где %d - высота полета", flightAltitude, flightAltitude);
    }

    @Override
    public String toString() {
        return "Аист. " + super.toString();
    }
    
}
