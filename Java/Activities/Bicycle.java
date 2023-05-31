package Activities;

public class Bicycle implements BicycleParts, BicycleOperations{

    int gears, currentSpeed;
    Bicycle(int gears, int currentSpeed){
     this.gears = gears;
     this.currentSpeed = currentSpeed;
    }


    public void applyBrake(int decrement) {
      currentSpeed = currentSpeed - decrement;
      System.out.println("When brake applied, speed is "+currentSpeed);
    }

    public void speedUp(int increment) {
     currentSpeed = currentSpeed + increment;
     System.out.println("When speed is up, speed is "+currentSpeed);
    }

    public String bicycledesc(){
        return ("Gears in a bicycle are "+gears + " \nCurrent speed of the bicycle is "+currentSpeed);
    }
}
