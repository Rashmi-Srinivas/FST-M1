package Activities;

public class Car {
    String color;
    String transmission;
    int make;
    int tyres;
    int doors;
    Car(int tyres1, int doors1){
        tyres = tyres1;
        doors = doors1;
    }
    public void displayCharacteristics(){
      System.out.println("Color== "+color);
        System.out.println("Transmission== "+transmission);
        System.out.println("Make== "+make);
        System.out.println("Tyres== "+tyres);
        System.out.println("Doors== "+doors);
    }

    public void accelerate(){
        System.out.println("Car is moving forward");
    }

    public void brake(){
        System.out.println("Car has stopped");
    }
}
