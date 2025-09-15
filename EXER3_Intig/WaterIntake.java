public class WaterIntake {
    private int amount;       
    private String time;      
 
    public WaterIntake(int amount, String time) {
        this.amount = amount;
        this.time = time;
    }
    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        if (amount > 0) {
            this.amount = amount;
        } else {
            System.out.println("Amount must be greater than 0!");
        }
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    }

