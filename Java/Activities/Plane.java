package Activities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Plane {
    private List<String> passengers;
    private int maxPassengers;
    private Date lastTimeTookOff;
    private Date lastTimeLanded;

    Plane(int maxPassengers){
      this.maxPassengers = maxPassengers;
      this.passengers = new ArrayList<>();
    }

    public void onboard(String passengers){
        this.passengers.add(passengers);
    }

    public Date takeOff(){
        this.lastTimeTookOff = new Date();
        return lastTimeTookOff;
    }

    public void land(){
        this.lastTimeLanded = new Date();
        this.passengers.clear();
    }

    public Date getLastTimeLanded(){
        return lastTimeLanded;
    }

    public List<String> getPassengers(){
        return passengers;
    }
}
