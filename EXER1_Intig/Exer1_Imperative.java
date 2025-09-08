public class Exer1_Imperative {
    public static void main(String[] args) {
        int sum = 0;

        // Using a loop (Imperative: step-by-step instructions)
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) { 
                sum += i;
            }
        }

        System.out.println("Sum of even numbers from 1 to 10 (Imperative): " + sum);
    }
}