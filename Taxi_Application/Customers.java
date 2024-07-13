package taxi_application;

class Customer{
    private int customerId;
    private char pickUpPoint;
    private char dropPoint;
    private int pickUpTime;

    public Customer(int customerId,char pickUpPoint,char dropPoint,int pickUpTime){
        this.customerId = customerId;
        this.pickUpPoint = pickUpPoint;
        this.dropPoint = dropPoint;
        this.pickUpTime = pickUpTime;
    }

    public int getCustomeId(){
        return customerId;
    }

    public char getPickUpPoint(){
        return pickUpPoint;
    }

    public char getDropPoint(){
        return dropPoint;
    }

    public int getPickUpTime(){
        return pickUpTime;
    }

    public void displayCustomerInfo(){
        System.out.println(this);
    }

    public String toString(){
        return "Customer Id"+customerId+" pickUpPoint "+ pickUpPoint+" dropPoint"+ dropPoint +" pickUpTime is"+ pickUpTime;
    }

}