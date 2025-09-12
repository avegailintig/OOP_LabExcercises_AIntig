public class Car {
    private String brand;
    private String color;
    private String plateNo;
    private String chassisNo;
    private String fuelType;

    public Car() {
        this.brand = "No Brand";
        this.color = "No Color";
        this.plateNo = "No Plate Number";
        this.chassisNo = "No Chassis Number Yet";
        this.fuelType = "No Fuel Type";
    }

    public Car(String brand, String color, String plateNo, String chassisNo, String fuelType) {
        this.brand = brand;
        this.color = color;
        this.plateNo = plateNo;
        this.chassisNo = chassisNo;
        this.fuelType = fuelType;
    }

    public void displayInfo() {
        String info = "";
        info += "Brand: " + this.brand + "\n";
        info += "Color: " + this.color + "\n";
        info += "PlateNo: " + this.plateNo + "\n";
        info += "ChassisNo: " + this.chassisNo + "\n";
        info += "FuelType: " + this.fuelType + "\n";
        System.out.println("-----------------------");
        System.out.print(info);
    }
    public static void main(String[] args) {
        Car c1 = new Car("Ford", "Navy Blue", "FOR123", "CH001", "Diesel");
        Car c2 = new Car("Chevrolet", "Gray", "CHE456", "CH002", "Gasoline");
        Car c3 = new Car("Honda", "Maroon", "HON789", "CH003", "Hybrid");
        Car c4 = new Car("Toyota", "Pearl White", "TOY321", "CH004", "Gasoline");
        Car c5 = new Car("Nissan", "Matte Black", "NIS654", "CH005", "Electric");
        Car c6 = new Car("Kia", "Sky Blue", "KIA987", "CH006", "Diesel");
        Car c7 = new Car("Hyundai", "Orange", "HYU432", "CH007", "Gasoline");
        Car c8 = new Car("Mazda", "Violet", "MAZ876", "CH008", "Hybrid");
        Car c9 = new Car("Subaru", "Green", "SUB543", "CH009", "Gasoline");
        Car c10 = new Car("Jeep", "Sand Brown", "JEE210", "CH010", "Diesel");

        c1.displayInfo();
        c2.displayInfo();
        c3.displayInfo();
        c4.displayInfo();
        c5.displayInfo();
        c6.displayInfo();
        c7.displayInfo();
        c8.displayInfo();
        c9.displayInfo();
        c10.displayInfo();
    }

    public String getBrand() {
        return brand;
    }
}
