import java.util.Scanner;

public class WaterBillingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double waterConsumed;
        String customerType;
        double hoursUsed;
        double cost = 0.0;
        
        WaterUsage usage = new WaterUsage();  // Fixed: was "Waterusage" should be "WaterUsage"
        
        System.out.print("Enter water Consumed (in liters): ");  // Added colon and space
        waterConsumed = scanner.nextDouble();
        usage.setLitresConsumed(waterConsumed);
        
        scanner.nextLine();  // Fixed: was "kg.nextLine()" should be "scanner.nextLine()"
        
        System.out.print("Enter Customer Type (Residential/Commercial/Industrial): ");  // Fixed spelling
        customerType = scanner.nextLine();
        usage.setCustomerType(customerType);
        
        System.out.print("Enter Hours Used: ");
        hoursUsed = scanner.nextDouble();
        usage.setHoursUsed(hoursUsed);
        
        cost = usage.calculateCost();
        
        usage.displayDetails(cost);
        
        scanner.close();  // Good practice to close the scanner
    }
}