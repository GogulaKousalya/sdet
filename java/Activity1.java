package JavaActivity1;

public class Activity1 {

    public static void main(String[] args) {
        Car AUDI = new Car();
        AUDI.make = 2014;
        AUDI.color = "Black";
        AUDI.transmission = "Manual";
    
        //Using Car class method
        AUDI.displayCharacterstics();
        AUDI.accelerate();
        AUDI.brake();
    }

}