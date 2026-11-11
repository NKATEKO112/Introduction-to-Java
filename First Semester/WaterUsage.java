import java.text.DecimalFormat;

public class WaterUsage {
    
    private double litresConsumed;
    private String customerType;
    private double hoursUsed;
    
    // Constructor
    public WaterUsage() {
        this.litresConsumed = 0;
        this.hoursUsed = 0;
        this.customerType = "Residential";
    }
    
    // Setter methods
    public void setLitresConsumed(double litresConsumed) {
        this.litresConsumed = litresConsumed;
    }
    
    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }
    
    public void setHoursUsed(double hoursUsed) {
        this.hoursUsed = hoursUsed;
    }
    
    // Getter methods
    public double getLitresConsumed() {  // Fixed: was "getLitersConsumed"
        return litresConsumed;
    }
    
    public String getCustomerType() {  // Fixed: was "getConsumerType" - consistency
        return customerType;
    }
    
    public double getHoursUsed() {
        return hoursUsed;
    }
    
    // Calculate efficiency (liters per hour)
    public double calculateEfficiency() {  // Fixed spelling: "calculateEffieciency" -> "calculateEfficiency"
        if (hoursUsed > 0) {
            return litresConsumed / hoursUsed;
        }
        return 0;
    }
    
    // Calculate cost based on customer type
    public double calculateCost() {
        double cost = 0.0;
        
        switch(customerType.toLowerCase()) {
            case "residential":
                cost = litresConsumed * 0.50;
                break;
            case "commercial":
                cost = litresConsumed * 0.70;
                break;
            case "industrial":
                cost = litresConsumed * 0.80;  // Changed to different rate (was same as commercial)
                break;
            default:
                System.out.println("Invalid customer type. Defaulting to Residential.");
                cost = litresConsumed * 0.50;
        }
        return cost;
    }
    
    // Displaying results
    public void displayDetails(double cost) {
        DecimalFormat df = new DecimalFormat("0.00");
        
        System.out.println("\n====================================");
        System.out.println("     WATER USAGE SUMMARY");
        System.out.println("====================================");
        System.out.println("Water consumed: " + df.format(litresConsumed) + " liters");
        System.out.println("Hours used: " + df.format(hoursUsed) + " hours");
        System.out.println("Customer type: " + customerType);
        System.out.println("Usage efficiency: " + df.format(calculateEfficiency()) + " liters/hour");
        System.out.println("Total cost: R" + df.format(cost));
        System.out.println("====================================");
    }
}