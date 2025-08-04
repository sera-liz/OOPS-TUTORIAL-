import java.time.Year;

public class vehicle {
    
    protected String brand;
    protected String model;
    protected int year;
    protected double basePrice;

    
    public vehicle(String brand, String model, int year, double basePrice) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.basePrice = basePrice;
    }

    
    public void displayInfo() {
        System.out.println("Vehicle Information:");
        System.out.println("Brand:" + brand);
        System.out.println("Model:" + model);
        System.out.println("year: "+ year);
        System.out.println("Base Price:$" + basePrice);
    }

    
    public double calculateResaleValue() {
        int currentYear = Year.now().getValue();
        int age = currentYear - year;
        double resaleValue = basePrice * Math.pow(0.85, age);
        return resaleValue;
    }

    
    public static void main(String[] args) {
        vehicle myvehicle = new vehicle("Toyota", "Camry", 2018, 25000);
        myvehicle.displayInfo();
        System.out.printf("Resale Value: $%.2f\n", myvehicle.calculateResaleValue());
    }
