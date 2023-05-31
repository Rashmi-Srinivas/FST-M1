package Activities;

public class MountainBike extends Bicycle{
    int seatHeight;

    MountainBike(int gears, int currentSpeed, int seatHeight){
        super(gears, currentSpeed);
        this.seatHeight = seatHeight;
    }

    public void setHeight(int value){
      seatHeight = value;
    }

    public String bicycleDesc(){
        return (super.bicycledesc() + " \nSeat height of the bicycle is " +seatHeight);
    }
}
