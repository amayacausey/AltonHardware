import java.util.Scanner;

public class AltonHardware {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int buildingPermit = 50;
        double taxRate = .06;
        System.out.println("What kind of fencing would you like? Please input the number for the corresponding type" +
                " \n (1) Wooden Fence \n (2) Chain Link Fence \n ");
        int fenceType = sc.nextInt();
        while(fenceType!=1 && fenceType!=2) {

            System.out.print("You must choose number 1 or 2. These are our only fencing options at the moment.");
            fenceType=sc.nextInt();

        }
        System.out.println("How many feet do you want?");
        int feet = sc.nextInt();
        System.out.println("How many gates do you want? Note: Minimum 1 Gate");
        int amountOfGates= sc.nextInt();
        while(amountOfGates<1) {
            System.out.println("The amount of Gates must be at least 1. Please enter a new number of gates. ");
            amountOfGates=sc.nextInt();
        }
        int costOfGates = (150 * amountOfGates);
        double gateTax =costOfGates * taxRate;
        double totalGateCost= gateTax+costOfGates;



        if (fenceType == 1) {
            double fenceTax = (25 * feet) * taxRate;
            double fencePrice = (25 * feet) + fenceTax;
            double total= fencePrice + +totalGateCost + +buildingPermit;
            System.out.println("Total Cost" +total);
        } else if (fenceType == 2) {
            double fenceTax = (15 * feet) * taxRate;
            double fencePrice = (15 * feet) + fenceTax;
            double total= fencePrice + +totalGateCost + +buildingPermit;System.out.println("Total Cost" +total);

        } else {
            System.out.println("You must choose number 1 or 2. These are our only fencing options at the moment. ");

        }

    }
}


