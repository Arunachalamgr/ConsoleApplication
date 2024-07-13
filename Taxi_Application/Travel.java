package taxi_application;

public class Travel{
    private char[] points ;
    private final int disBtwPoints;
    private final int timeTakenForOnePoint;
    private int distanceUnit;

    public Travel(){
        timeTakenForOnePoint = 60;
        points = new char[]{'A','B','C','D','E','F'};
        disBtwPoints = 15;
        distanceUnit = 0;
    }

    public int calculateDistanceCoverage(char pickUpPoint,char dropPoint){
        int startPoint = 0;
        int endPoint = 0;

        for(int i=0;i<points.length;i++){
            if(points[i] == pickUpPoint){
                startPoint = i;
            }
            if(points[i] == dropPoint){
                endPoint = i;
            }
        }
        distanceUnit = Math.abs(startPoint - endPoint);

        return (disBtwPoints * Math.abs(startPoint - endPoint));
    }
    public int calculateDropTime(int pickUpTime){
        return pickUpTime + (distanceUnit * timeTakenForOnePoint) / timeTakenForOnePoint;
    }
}