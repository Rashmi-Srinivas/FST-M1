package Activities;

public class Activity7 {
    public static void main(String[] args){
        MountainBike mb = new MountainBike(4, 20, 6);
        mb.applyBrake(5);
        mb.speedUp(10);
        System.out.println(mb.bicycleDesc());
    }
}