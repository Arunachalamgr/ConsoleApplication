package taxi_application;

import java.util.Scanner;

public class MainRunner{
    public static void main(String[] ar){

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the no of taxis ");
        TaxiOperator operator = new TaxiOperator(scan.nextInt());
        Customer customer = null;

        System.out.println("Pls enter '1' to start the taxi booking process ");
        int entry = scan.nextInt();

        while(entry == 1){

            System.out.println("1. Book taxi");
            System.out.println("2. Display taxi information");
            System.out.println("3. Display customer information");
            System.out.println("4. Exit");

            System.out.println("Enter your choice");
            int choice = scan.nextInt();

            switch(choice){
                case 1 : {
                    System.out.println("Enter the customerId, pickUpPoint , dropPoint , pickUpTime");
                    int customerId = scan.nextInt();
                    char pickUpPoint = scan.next().charAt(0);
                    char dropPoint = scan.next().charAt(0);
                    int pickUpTime = scan.nextInt();

                    customer  = new Customer(customerId,pickUpPoint,dropPoint,pickUpTime);
                    operator.getValidTaxi(pickUpPoint,dropPoint,pickUpTime);

                    break;
                }
                case 2 : {
                    operator.displayTaxi();
                    break;
                }
                case 3 : {
                    if(customer != null){
                        customer.displayCustomerInfo();
                    }else{
                        System.out.println("Customer detail not available");
                    }
                    break;
                }
                case 4 : {
                    entry = 0;
                    break;
                }

                default : System.out.println("Enter the valid choice");

            }
        }
        scan.close();
    }
}
					
					
				
			
			
		
		
		
		