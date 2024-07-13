package taxi_application;

public class Fair {
    private final int intialdistance;
    private final int minCharge;
    private final int subSequentCharge;

    public Fair(){
        intialdistance = 5;
        minCharge = 100;
        subSequentCharge = 10;
    }

    public double calculateFair(int distanceCovered){
        if(distanceCovered <= intialdistance){
            return minCharge;
        }
        return minCharge + (distanceCovered * subSequentCharge);
    }
}
