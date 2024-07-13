package taxi_application;

public class Taxi{
    private int taxiId;
    private boolean available;
    private double earnings;
    private char currentPos;
    private int dropTime;

    public Taxi(int taxiId){
        this.taxiId = taxiId;
        available = true;
        earnings = 0.0;
        currentPos = 'A';
        dropTime = 0;
    }

    public int getTaxiId(){
        return taxiId;
    }

    public boolean getAvailable(){
        return available;
    }

    public double getEarnings(){
        return earnings;
    }
    public void setEarnings(double earnings){
        this.earnings = earnings;
    }

    public char getCurrentPos(){
        return currentPos;
    }

    public int getDropTime(){
        return dropTime;
    }

    public void setAvailable(boolean available){
        this.available = available;
    }

    public void setDropTime(int dropTime){
        this.dropTime = dropTime;
    }

    public void setCurrentPos(char currentPos){
        this.currentPos = currentPos;
    }

    public String toString(){
        return "Taxi Id"+taxiId+" available status "+available+" earnings so far "+ earnings +" current position "+currentPos+" drop time is "+dropTime;
    }
}


