public class Main {
    public static void main(String[] args) {

        WaterIntake intake1 = new WaterIntake(250, "9:00 AM");

        System.out.println("You drank " + intake1.getAmount());

        intake1.setAmount(300);

    }
}
