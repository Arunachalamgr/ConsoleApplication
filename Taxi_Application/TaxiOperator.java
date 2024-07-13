package taxi_application;

import java.util.ArrayList;

public class TaxiOperator{

    private ArrayList<Taxi> taxis;
    private int noOfTaxi; // In this case we are taking four
    private Travel travel;
    private Fair fair;


    public TaxiOperator(int noOfTaxi){

        this.noOfTaxi = noOfTaxi;
        travel = new Travel();
        fair = new Fair();
        taxis = new ArrayList<>();

        for(int i=0;i<noOfTaxi;i++){
            taxis.add(new Taxi(i+1));
        }
    }

    public void getValidTaxi(char pickUpPoint,char dropPoint,int pickUpTime){

        Taxi assign = null;
        double assignMinEarnedTaxi = Integer.MAX_VALUE;
        int minDistanceTaxi = Integer.MAX_VALUE;
        for(Taxi taxi : taxis){
            if(taxi.getEarnings()  < assignMinEarnedTaxi && pickUpTime > taxi.getDropTime() && minDistanceTaxi > Math.abs(taxi.getCurrentPos()- pickUpPoint)){
                minDistanceTaxi = Math.abs(taxi.getCurrentPos()- pickUpPoint);
                assignMinEarnedTaxi = taxi.getEarnings();
                assign = taxi;
            }
        }

        if(assign != null){
            assign.setAvailable(false);
            int distCovered = travel.calculateDistanceCoverage(pickUpPoint,dropPoint);
            double amount = fair.calculateFair(distCovered);
            assign.setEarnings(amount);
            assign.setCurrentPos(dropPoint);
            assign.setDropTime(travel.calculateDropTime(pickUpTime));
            System.out.println("Taxi "+assign.getTaxiId()+" is assigned");
        }else{
            System.out.println("All the taxis are busy");
        }
    }

    public void displayTaxi(){
        for(Taxi taxi : taxis){
                System.out.println(taxi);
        }
    }
}
	
			
		

			
	
	
	
	
		

	


		
		